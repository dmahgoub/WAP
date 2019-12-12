(function () {
    // Elements
    const viewer = document.getElementById("viewer");
    const start = document.getElementById("start");
    const stop = document.getElementById("stop");
    const animation = document.getElementById("animation");
    const size = document.getElementById("size");
    const speed = document.getElementById("speed");

    let selectedSpeed = 250;
    let animate = function (frames) { return setTimeout(runAnime, selectedSpeed, frames, 0) };
    let handle = null;

    // Handlers
    start.onclick = function () {
        debugger;
        let selectedAnime = ANIMATIONS[animation.options[animation.selectedIndex].value];
        let frames = selectedAnime.split("=====\n");
        animate(frames);
    }

    function runAnime(frames, index) {
        if (index < frames.length) {
            viewer.value = frames[index];
        } else {
            index = -1;
        }
        handle = setTimeout(runAnime, selectedSpeed, frames, ++index)
    }

    stop.onclick = function () {
        clearTimeout(handle);
    }

    animation.onchange = function () {
        clearTimeout(handle);
        viewer.value = ANIMATIONS[animation.options[animation.selectedIndex].value].split("=====\n")[0];
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
