window.onload = function () {
    let reset = function () {
        $(this).data('clicked', true);
        $(".boundary").removeClass('youlose');
        $("#status").html('Click the "S" to begin.');
    }

    let red = function () {
        if ($("#start").data('clicked')) {
            $(".boundary").addClass('youlose');
            $("#status").html('Sorry You Lost! =(');
        }
    }

    let end = function () {
        if ($("#start").data('clicked')) {
            if (!($(".boundary").hasClass('youlose')))               
                $("#status").html('You Win! =)');
            $("#start").data('clicked', false);
        }
    }

    $(document).ready(
        $("#start").click(reset),
        $(".boundary").mouseover(red),
        $("#maze").mouseleave(red),
        $("#end").mouseover(end)
    );
} 