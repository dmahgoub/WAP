let addjQuery = (function () {
    // Adding jQuery
    let jquery = document.createElement('script');
    jquery.src = 'https://code.jquery.com/jquery-3.4.1.min.js';
    jquery.type = 'text/javascript';
    let head = document.getElementsByTagName('head');
    head[0].appendChild(jquery);
})();
window.onload = function () {

    let coordinates = [];

    // Initializing puzzle
    let init = function () {
        $("#puzzlearea div").each(function (i) {
            // calculate x and y for this piece
            let x = ((i % 4) * 100);
            let y = (Math.floor(i / 4) * 100);
            // set basic style and background
            $(this).addClass('puzzlepiece');
            $(this).css('left', x + 'px');
            $(this).css('top', y + 'px');
            $(this).css('background-image', 'url("background.jpg")');
            $(this).css('background-position', -x + 'px ' + (-y) + 'px');
            // store x and y for later
            // $(this).x = x;
            // $(this).y = y;
            $(this).coordinate = { x: x, y: y }
            coordinates.push($(this).coordinate);
        });
    };

    init();

    function shuffle() {
        // $("#puzzlearea div").each(function (i) {
        //     // calculate x and y for this piece

        //     let x = ((i % 4) * 100);
        //     let y = (Math.floor(i / 4) * 100);
        //     // set basic style and background
        //     $(this).addClass('puzzlepiece');
        //     $(this).css('left', x + 'px');
        //     $(this).css('top', y + 'px');
        //     $(this).css('background-image', 'url("background.jpg")');
        //     $(this).css('background-position', -x + 'px ' + (-y) + 'px');
        //     // store x and y for later
        //     $(this).x = x;
        //     $(this).y = y;
        //     let coordinate = { x: x, y: y }
        //     coordinates.push(coordinate);
        // });
    }


    // Event Handlers
    $("#shufflebutton").click(function () {
        shuffle();
    });

    $("#puzzlearea div").hover(function () {
        // if moveable 
        if (true) {
            $(this).addClass('movablepiece');
        }
    });

    $("#puzzlearea div").click(function () {
        // if moveable 
        if (true) {
            swap();
        }
    });
};


