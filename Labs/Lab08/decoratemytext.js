
// function biggerFont(){
//     document.getElementById("txt").style.fontSize = "24pt";
// }

function biggerFont() {
    var txtElem = document.getElementById("txt");
    var currentSize = window.getComputedStyle(txtElem, null).getPropertyValue("font-size");
    var parsedSize = parseInt(currentSize);
    document.getElementById("txt").style.setProperty("font-size", (parsedSize + 2) + "pt");
    setInterval(biggerFont, 500);
}

function bling() {
    if (document.getElementById("bling").checked === true) {
        document.getElementById("txt").style.fontWeight = "bold";
        document.getElementById("txt").style.color = "green";
        document.getElementById("txt").style.textDecoration = "underline";
        document.body.style.backgroundImage = "url('http://www.cs.washington.edu/education/courses/190m/CurrentQtr/labs/6/hundred-dollar-bill.jpg')";
    }
    if (document.getElementById("bling").checked === false) {
        document.getElementById("txt").style.fontWeight = "normal";
    }
}


function pigLatin() {
    var words = document.getElementById("txt").value.split(" ");
    var newStr = "";
    words.forEach(word => {
        if (word.charAt(0).match('^[aieouAIEOU].*')) {
            word = word + "ay";
        } else {
            var con = word.toLowerCase().charAt(0);
            word = word.substr(1) + con + "ay";
        }
        newStr += word.charAt(0).toUpperCase() + word.slice(1) + " ";
    });
    document.getElementById("txt").value = newStr;
}

function malkovitch() {
    var words = document.getElementById("txt").value.split(" ");
    var newStr = "";
    for (let index = 0; index < words.length; index++) {
        var word = words[index];
        if (word.length >= 5){
             word = "Malkovitch";
        }
        newStr += word + " ";       
    }
    document.getElementById("txt").value = newStr;
}