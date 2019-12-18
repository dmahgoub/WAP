/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(() => {
    $("#form").on("submit", (e) => {
        e.preventDefault();

        $.ajax({
            url: "search",
            method: 'POST',
            dataType: 'json',
            data: $("#form").serialize(),
            success: (response) => {
                if (response.word) {
                    response.defs.forEach((def, i) => {
                        $("#definitions").append(`<tr><td>${i + 1}</td><td>(${def.wordType})</td><td>${def.definition}</td></tr>`);
                    });
                }
            },
            error: (error) => {
                alert(error);
            }
        });
    })
});