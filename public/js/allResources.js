/*-----------------------------------/
  /*	DROPDOWN
  /*----------------------------------*/

$(document).ready(function () {
    $(document).off('click.bs.dropdowwn.data-api');
    dropdownOpen();
});

function dropdownOpen() {

    $("li.dropdown").mouseover(function () {
        $(this).addClass('open');
    });
    $("li.dropdown").mouseout(function () {
        $(this).removeClass('open');
    });
}

/*-----------------------------------/
  /*	MAIN
  /*----------------------------------*/

function adaptiveHeight(obj) {
    var mainheight = $(obj).contents().find("body").height() + 50;
    $(obj).height(mainheight);
}

/*-----------------------------------/
  /*	WEST
  /*----------------------------------*/

function find(bid, page) {
    $.ajax({
        url: '/selectProjectPageByBatch',
        data: {
            bid: bid,
            page: page
        },
        type: 'GET',
        dataType: 'json',
        success: function (data) {
            window.cnt = data.totalElements;
            layui.use(['laypage', 'layer'], function () {
                var laypage = layui.laypage
                    , layer = layui.layer;
                //完整功能
                laypage.render({
                    elem: 'demo7'
                    , count: cnt
                    //,groups: 0
                    , layout: ['count', 'prev', 'page', 'next', 'limit', 'skip']
                    , jump: function (obj) {
                        console.log(obj);
                        var content = $('#zqjj ul');
                        content.children().remove();
                        $.ajax({
                            url: '/selectProjectPageByBatch',
                            data: {
                                bid: bid,
                                page: obj.curr
                            },
                            type: 'GET',
                            dataType: 'json',
                            success: function (ans) {
                                $.each(ans.content, function (index, object) {
                                    content.append('<li class="clearfix"><div class="id_col">' + object.pid + '</div><div class="name_col"><a href="' + object.link + '">\n' +
                                        '                                        Super&nbsp;' + object.name + '</a>\n' +
                                        '                                    </div><div class="member_col">' + object.member + '</div></li>')
                                })
                            }
                        })
                    }
                });
            });
        }
    })
}

// 书柜资源
$(document).ready(function () {
    var first = $('.account1:first a:first');

    var firstDiv = $('.account1:first').next();

    firstDiv.toggle();

    var firstC = $('.submenu1:first ul:first li:first a:first');

    first.addClass('actived');

    firstC.addClass('actived');

    find(firstC.attr('id'), 1);

    $('.account1').click(function () {
        first.toggleClass('actived');
        $(first).parent().next().toggle();
        var next = $(this).children('a:first');
        first = next;
        next.toggleClass('actived');
        var div = $(this).next();
        div.toggle();
    });

    $('.tag').click(function () {
        firstC.toggleClass('actived');
        $(this).toggleClass('actived');
        firstC = $(this);
        find(firstC.attr('id'), 1);
    });

});

