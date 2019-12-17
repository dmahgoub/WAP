
"use strict"; //this activates strict mode 

let addjQuery = (function () {
    // Adding jQuery
    let jquery = document.createElement('script');
    jquery.src = 'https://code.jquery.com/jquery-3.4.1.min.js';
    jquery.type = 'text/javascript';
    let head = document.getElementsByTagName('head');
    head[0].appendChild(jquery);
})();


window.onload = function () {
    let divs = $("#puzzlearea div");
    let emptySpace = 15;

    ////////////////////////////////////////// Initializing Puzzle //////////////////////////////////////////
    const init = function () {
        $("#puzzlearea div").each(function (i) {
            // calculate x and y for this piece
            let pos = getPosition(i);
            let x = pos.x;
            let y = pos.y;
            // set basic style and background
            $(this).addClass('puzzlepiece');
            $(this).css('left', x + 'px');
            $(this).css('top', y + 'px');
            $(this).css('background-image', 'url("background.jpg")');
            $(this).css('background-position', -x + 'px ' + (-y) + 'px');
            $(this).attr('id', i);
            $(this).attr('oldId', i);
        });
    };

    ////////////////////////////////////////// Helper Methods //////////////////////////////////////////
    let getPosition = function (i) {
        return {
            x: ((i % 4) * 100),
            y: (Math.floor(i / 4) * 100)
        }
    }

    let isNeighbor = function (a, b) {
        if (a >= 0 && a < 16 && b >= 0 && b < 16 && a != b) {
            if ((Math.abs(a - b) <= 1 && Math.floor(a / 4) == Math.floor(b / 4)) ||
                (Math.abs(a - b) <= 4 && a % 4 == b % 4))
                return true;
        } else {
            return false;
        }
    }

    let getPossibilities = function (id) {
        id = parseInt(id);
        let possibleMoves = [id - 1, id + 1, id - 4, id + 4];
        let realAvailableMoves = [];
        $(possibleMoves).each(function (i) {
            let moveId = possibleMoves[i];
            if (isNeighbor(id, moveId))
                realAvailableMoves.push(moveId);
        });
        return realAvailableMoves;
    }

    let updatePuzzle = function () {
        divs.each(function () {
            $(this).removeClass('movablepiece');
            $(this).removeClass('valid');
            $(this).removeClass('invalid');

            if (isNeighbor($(this).attr('id'), emptySpace)) {
                $(this).addClass('movablepiece');
            }
            $(this).addClass(($(this).attr('oldId') == $(this).attr('id')) ? 'valid' : 'invalid');
        })

    }

    let swap = function (id) {
        let piece = $('#' + id);
        piece.attr('oldId', id);
        if (isNeighbor(id, emptySpace)) {
            let freePosition = getPosition(emptySpace);
            piece.css({
                left: freePosition.x + 'px',
                top: freePosition.y + 'px'
            });
            piece.attr('id', emptySpace);
            emptySpace = id;
            updatePuzzle();
        }
        if (gameWon()){
            $('h1').append('<p class="win"> You Win!</p>');
        }
    }

    let gameWon = function () {
        debugger;
        let flag = true;
        $(divs).each(function (i) {
            if (i != $(this).attr('id')) {
                flag = false;
            }
        });
        return flag;
    }

    ////////////////////////////////////////// Event Handlers //////////////////////////////////////////
    $("#shufflebutton").click(function () {
        for (let i = 0; i < 100; ++i) {
            let movablePieces = getPossibilities(emptySpace);
            let random = Math.floor(Math.random() * movablePieces.length);
            swap(movablePieces[random]);
        }
        $('.win').remove();
    });

    $("#puzzlearea div").hover(function () {
        if (isNeighbor($(this).attr('id'), emptySpace)) {
            $(this).addClass('movablepiece');
        }
    });

    $("#puzzlearea div").click(function () {
        swap($(this).attr('id'));
    });

    init();
};