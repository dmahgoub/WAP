(function () {
    // Elements
    const viewer = document.getElementById("viewer");
    const start = document.getElementById("start");
    const stop = document.getElementById("stop");
    const animation = document.getElementById("animation");
    const size = document.getElementById("size");
    const speed = document.getElementById("speed");

    let selectedSpeed = 2500;
    let interval = null;

    // Helper functions
    let view = function (view) {
        viewer.value = view;
    }

    // Handlers
    start.onclick = function () {
        debugger;
        let selectedAnime = ANIMATIONS[animation.options[animation.selectedIndex].value];
        let frames = selectedAnime.split("=====\n");
        for (let index = 0; index < frames.length; index++) {
            view(frames[index]);
            interval = setInterval(view, selectedSpeed)
            if (index == frames.length - 1)
                index = 0;
        }
        
    }

    stop.onclick = function () {
        clearInterval(interval);
    }

    animation.onchange = function () {
        debugger;
        viewer.value = ANIMATIONS[animation.options[animation.selectedIndex].value].split("=====")[0];
    }

    size.onchange = function () {
        let sizeValue = size.options[size.selectedIndex].value;
        viewer.style.fontSize = sizeValue;
    }

    speed.onchange = function () {
        if (speed.checked == true)
            selectedSpeed = 50;
        else
            selectedSpeed = 250;
    }

})();
