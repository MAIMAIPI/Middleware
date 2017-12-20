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

// 书柜资源
$(document).ready(function()
{
    $(".account1").click(function()
    {
        var X=$(this).attr('id');

        if(X==1)
        {
            $(".submenu1").hide();
            $(this).attr('id', '0');
        }
        else
        {

            $(".submenu1").show();
            $(this).attr('id', '1');
        }

    });

//Mouseup textarea false
    $(".submenu1").mouseup(function()
    {
        return false
    });
    $(".account1").mouseup(function()
    {
        return false
    });


//Textarea without editing.
    $(document).mouseup(function()
    {
        $(".submenu1").hide();
        $(".account1").attr('id', '');
    });

});

// 硬盘资源
$(document).ready(function()
{
    $(".account2").click(function()
    {
        var X=$(this).attr('id');

        if(X==3)
        {
            $(".submenu2").hide();
            $(this).attr('id', '2');
        }
        else
        {

            $(".submenu2").show();
            $(this).attr('id', '3');
        }

    });

//Mouseup textarea false
    $(".submenu2").mouseup(function()
    {
        return false
    });
    $(".account2").mouseup(function()
    {
        return false
    });


//Textarea without editing.
    $(document).mouseup(function()
    {
        $(".submenu2").hide();
        $(".account2").attr('id', '');
    });

});

// 电子资源
$(document).ready(function()
{
    $(".account3").click(function()
    {
        var X=$(this).attr('id');

        if(X==5)
        {
            $(".submenu3").hide();
            $(this).attr('id', '4');
        }
        else
        {

            $(".submenu3").show();
            $(this).attr('id', '5');
        }

    });

//Mouseup textarea false
    $(".submenu3").mouseup(function()
    {
        return false
    });
    $(".account3").mouseup(function()
    {
        return false
    });


//Textarea without editing.
    $(document).mouseup(function()
    {
        $(".submenu3").hide();
        $(".account3").attr('id', '');
    });

});