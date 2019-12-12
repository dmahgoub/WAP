var main = (function () {
    let button = document.getElementById("clickme");

    let timer = null;
    
    button.onclick = function () {
        return function () {
            debugger;
            if (timer === null) {
                timer = setInterval(rudyTimer, 1000);
            } else {
                clearInterval(timer);
                timer = null;
            }
        }
    }();

    function rudyTimer() { 
        debugger;
        document.getElementById("output").value += "Rudy!";
    }


})();
