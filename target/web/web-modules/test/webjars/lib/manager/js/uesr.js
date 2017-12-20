/*-----------------------------------/
  /*	DROPDOWN
  /*----------------------------------*/

$(document).ready(function () {
    $(document).off('click.bs.dropdowwn.data-api') ;
    dropdownOpen() ;
}) ;
function dropdownOpen() {

    $("li.dropdown").mouseover(function () {
        $(this).addClass('open') ;
    }) ;
    $("li.dropdown").mouseout(function () {
        $(this).removeClass('open') ;
    });
}

/*-----------------------------------/
  /*	MAIN
  /*----------------------------------*/

function adaptiveHeight(obj) {
    var mainheight = $(obj).contents().find("body").height()+50 ;
    $(obj).height(mainheight) ;
}

/*-----------------------------------/
  /*	WEST
  /*----------------------------------*/

$(document).ready(function()
{
    $(".account").click(function()
    {
        var X=$(this).attr('id');

        if(X==1)
        {
            $(".submenu").hide();
            $(this).attr('id', '0');
        }
        else
        {

            $(".submenu").show();
            $(this).attr('id', '1');
        }

    });

//Mouseup textarea false
    $(".submenu").mouseup(function()
    {
        return false
    });
    $(".account").mouseup(function()
    {
        return false
    });


//Textarea without editing.
    $(document).mouseup(function()
    {
        $(".submenu").hide();
        $(".account").attr('id', '');
    });

});
