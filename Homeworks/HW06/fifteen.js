let main = (function () {

    let interval;
    
    let importScript = function () {
        // jQuery
        let jquery = document.createElement('script');
        jquery.src = 'https://code.jquery.com/jquery-3.4.1.min.js';
        jquery.type = 'text/javascript';
        let head = document.getElementsByTagName('head');
        head[0].appendChild(jquery);
        // Script
        let script = document.createElement('script');
        script.src = 'script.js';
        script.type = 'text/javascript';
        let body = document.getElementsByTagName('body');
        body[body.length - 1].appendChild(script);
        clearInterval(interval);
    };

    interval = setInterval(importScript, 500);
    

})();


