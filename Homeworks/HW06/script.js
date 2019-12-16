(function () {
    let divs = $("#puzzlearea div");


    let init = function () {

        debugger;
        // initialize each piece
        for (let i = 0; i < divs.length; i++) {
            let div = divs[i];
            debugger;
            // calculate x and y for this piece
            let x = ((i % 4) * 100);
            let y = (Math.floor(i / 4) * 100);

            // set basic style and background
            div.className = "puzzlepiece";
            div.css('left',  x + 'px');
            div.css('top',  y + 'px');
            div.css('background-image', 'url("background.jpg")');
            div.css('background-position', -x + 'px ' + (-y) + 'px');

            // store x and y for later
            div.x = x;
            div.y = y;
        }
    };

    $(document).ready(function () {
        debugger;
        init();
    });

    $('#shufflebutton').click(function () {

    });

    divs.click(function(){
        pieceMove();
    });
    
    let pieceMove = function(){
        // $(this).x = 
    }

})();