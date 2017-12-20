
package views.html.common

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object ProjectInfo extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE HTML>
<html>
    """),_display_(/*5.6*/head("项目")/*5.16*/ {_display_(Seq[Any](format.raw/*5.18*/("""
            """),format.raw/*6.13*/("""<!--Add-->
        <link type="text/css" href=""""),_display_(/*7.38*/routes/*7.44*/.Assets.at("css/ProjectInfo.css")),format.raw/*7.77*/("""" rel="stylesheet">
        <script src=""""),_display_(/*8.23*/routes/*8.29*/.Assets.at("js/bootstrap-wysiwyg.js")),format.raw/*8.66*/(""""></script>
        <script src=""""),_display_(/*9.23*/routes/*9.29*/.Assets.at("js/jquery.hotkeys.js")),format.raw/*9.63*/(""""></script>
            <!--Add-->
        <script>
                $(document).ready(function () """),format.raw/*12.47*/("""{"""),format.raw/*12.48*/("""
                    """),format.raw/*13.21*/("""$(".dropdown").hover(
                            function () """),format.raw/*14.41*/("""{"""),format.raw/*14.42*/("""
                                """),format.raw/*15.33*/("""$('.dropdown-menu', this).stop(true, true).slideDown("fast");
                                $(this).toggleClass('open');
                            """),format.raw/*17.29*/("""}"""),format.raw/*17.30*/(""",
                            function () """),format.raw/*18.41*/("""{"""),format.raw/*18.42*/("""
                                """),format.raw/*19.33*/("""$('.dropdown-menu', this).stop(true, true).slideUp("fast");
                                $(this).toggleClass('open');
                            """),format.raw/*21.29*/("""}"""),format.raw/*21.30*/("""
                    """),format.raw/*22.21*/(""");
                """),format.raw/*23.17*/("""}"""),format.raw/*23.18*/(""");
        </script>
    """)))}),format.raw/*25.6*/("""
"""),format.raw/*26.1*/("""<body>
    """),_display_(/*27.6*/nav()),format.raw/*27.11*/("""
        """),format.raw/*28.9*/("""<!-- banner -->
    <div class="courses_banner">
        <div class="container">
            <h3>项目信息</h3>
            <p class="description">
                Welcome to join JSUCCW! Here we will meet a group of like-minded students,
                grow together, learn professional knowledge, I hope everyone here can meet better myself. Finally, I wish
                you all success!
            </p>
            <div class="breadcrumb1">
                <ul>
                    <li class="icon6"><a href="index.html">首页</a></li>
                    <li class="current-page">项目信息</li>
                </ul>
            </div>
        </div>
    </div>
        <!-- //banner -->
    <div class="courses_box1">
        <div class="container">
            <div class="col-md-3">
                <div class="projectBox">
                    <h3>项目介绍</h3>
                    <div class="projectBox_1">
                        <div class="project_image">
                            <img src=""""),_display_(/*53.40*/routes/*53.46*/.Assets.at("images/t17.jpg")),format.raw/*53.74*/("""" class="img-responsive" alt=""/>
                        </div>
                        <div class="project_image_desc">
                            <h2>局域网聊天</h2>
                                <!--<p>Tempor Incididunt</p>-->
                        </div>
                        <div class="clearfix"></div>
                    </div>
                    <div class="project_description">
                        <p><span>简介:</span>实现注册，登录，查找好友，单聊（添加好友，删除好友，查看并修改详细信息，查看聊天记录，聊天"""),format.raw/*62.89*/("""{"""),format.raw/*62.90*/("""在线信息，
                            在线未读信息提醒，离线信息"""),format.raw/*63.42*/("""}"""),format.raw/*63.43*/(""",发送文件，发送声音），群聊（与单聊类似）等。 <!--<a href="#">更多..</a>-->
                        </p>
                    </div>
                </div>
                <ul class="persons">
                    <h3>项目成员</h3>
                    <li>
                        <article class="person-item">
                            <div class="person-thumb pull-left">
                                <img src=""""),_display_(/*72.44*/routes/*72.50*/.Assets.at("images/head.jpg")),format.raw/*72.79*/("""" class="img-responsive" alt=""/>
                            </div>
                            <div class="person-content">
                                <h6><a href="#">刘小新</a></h6>
                                <p><a href="#">年级:</a>15级</p>
                            </div>
                            <div class="clearfix"></div>
                        </article>
                    </li>
                    <li>
                        <article class="person-item">
                            <div class="person-thumb pull-left">
                                <img src=""""),_display_(/*84.44*/routes/*84.50*/.Assets.at("images/head.jpg")),format.raw/*84.79*/("""" class="img-responsive" alt=""/>
                            </div>
                            <div class="person-content">
                                <h6><a href="#">刘小新</a></h6>
                                <p><a href="#">年级:</a>15级</p>
                            </div>
                            <div class="clearfix"></div>
                        </article>
                    </li>
                    <li>
                        <article class="person-item">
                            <div class="person-thumb pull-left">
                                <img src=""""),_display_(/*96.44*/routes/*96.50*/.Assets.at("images/head.jpg")),format.raw/*96.79*/("""" class="img-responsive" alt=""/>
                            </div>
                            <div class="person-content">
                                <h6><a href="#">刘小新</a></h6>
                                <p><a href="#">年级:</a>15级</p>
                            </div>
                            <div class="clearfix"></div>
                        </article>
                    </li>
                </ul>
                <div class="projectSummarize">
                    <h3>项目总结</h3>
                    <div class="project_sumup">
                        在这个项目中，我学会了项目的整个流程，以及前后端交互。
                    </div>
                </div>
            </div>
            <div class="col-md-9">
                <div class="project_list">
                    <div class="table-header clearfix">
                        <div class="project_request">项目要求</div>
                    </div>
                    <ul class="table-list">
                        <li class="clearfix">
                            <div class="Text">需求文档&nbsp;:</div>
                            <div class="document"><p class="notice">需求分析.doc</p></div>
                            <div class="UDload">
                                    <!-- <a class="upload"><i class="fa fa-arrow-circle-o-up"></i></a>-->
                                <a class="download"><i class="fa fa-arrow-circle-o-down"></i></a>
                            </div>
                        </li>
                        <li class="clearfix">
                            <div class="Text">功能点和技术点&nbsp;:</div>
                            <div class="document"><p class="notice">功能点和技术点.txt</p></div>
                            <div class="UDload">
                                    <!-- <a class="upload"><i class="fa fa-arrow-circle-o-up"></i></a>-->
                                <a class="download"><i class="fa fa-arrow-circle-o-down"></i></a>
                            </div>
                        </li>
                        <li class="clearfix GTpic">
                            <div class="addPic"><img src=""""),_display_(/*136.60*/routes/*136.66*/.Assets.at("images/addPic.png")),format.raw/*136.97*/("""" style="width: 80px"></div>
                                <!--<div class="picShow"><p class="notice">请上传您的甘特图</p></div>-->
                            <div class="UDload">
                                    <!-- <a class="upload"><i class="fa fa-arrow-circle-o-up"></i></a>-->
                                <a class="download"><i class="fa fa-arrow-circle-o-down"></i></a>
                            </div>
                        </li>
                        <li class="clearfix">
                            <div class="Text col-xs-2">Github链接&nbsp;:</div>
                            <div class="link col-xs-9"><input type="text" placeholder="https://github.com/MuxinKrismile/ManagerSystem" style="width: 100%" readonly="readonly"></div>
                                <!--<div class="UDload col-xs-1">
                            <a class="upload"><i class="fa fa-arrow-circle-o-up"></i></a>
                        </div>-->
                        </li>
                    </ul>
                    <section class="reviews mod book-content">
                        <header>
                            <div class="table-header clearfix">
                                <div class="comment">评论打分</div>
                                <a href="#write-comment" class="create-review btn  redbutt rr">
                                    <span>我要打分</span>
                                </a>
                            </div>

                        </header>
                        <div class="review-list  ">
                            <ul>
                                <li>
                                    <div class="main review-item">
                                        <header class="main-hd">
                                            <div class="ll">
                                                <a href="#" class="avator">
                                                    <img width="40" height="40" src=""""),_display_(/*168.87*/routes/*168.93*/.Assets.at("images/head.jpg")),format.raw/*168.122*/("""">
                                                </a>
                                            </div>
                                            <a href="#" class="name">灿烈</a>
                                            <span content="2017-10-28" class="main-meta">2017-10-28 23:34:49</span>
                                            <br>
                                            <span class="score"> 9.9 分</span>
                                        </header>
                                        <div class="main-bd">
                                            <div class="review-short">
                                                <div class="short-content">
                                                    <p class="book_comment">
                                                        人生如逆旅，我亦是行人。人生匆匆，对于刚刚进入职场的年轻人来讲，生活已经安定下来了，如果有一个稳定的结婚对象，那么生活基本已经定了型，即未来几十年里，会不断重复着上班下班、接待客户或者相夫教子的生活。
                                                        可芒芴之间，总会觉得生活缺了点什么。可能有时一觉醒来，会...
                                                        &nbsp;(<a href="#" class="unfold" title="查看全部">查看全部</a>)
                                                    </p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </li>
                                <li>
                                    <div class="main review-item">
                                        <header class="main-hd">
                                            <div class="ll">
                                                <a href="#" class="avator">
                                                    <img width="40" height="40" src=""""),_display_(/*194.87*/routes/*194.93*/.Assets.at("images/head.jpg")),format.raw/*194.122*/("""">
                                                </a>
                                            </div>
                                            <a href="#" class="name">灿烈</a>
                                            <span content="2017-10-28" class="main-meta">2017-10-28 23:34:49</span>
                                            <br>
                                            <span class="score"> 9.9 分</span>
                                        </header>
                                        <div class="main-bd">
                                            <div class="review-short">
                                                <div class="short-content">
                                                    <p class="book_comment">
                                                        人生如逆旅，我亦是行人。人生匆匆，对于刚刚进入职场的年轻人来讲，生活已经安定下来了，如果有一个稳定的结婚对象，那么生活基本已经定了型，即未来几十年里，会不断重复着上班下班、接待客户或者相夫教子的生活。
                                                        可芒芴之间，总会觉得生活缺了点什么。可能有时一觉醒来，会...
                                                        &nbsp;(<a href="#" class="unfold" title="查看全部">查看全部</a>)
                                                    </p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </li>
                                <li>
                                    <div class="main review-item">
                                        <header class="main-hd">
                                            <div class="ll">
                                                <a href="#" class="avator">
                                                    <img width="40" height="40" src=""""),_display_(/*220.87*/routes/*220.93*/.Assets.at("images/head.jpg")),format.raw/*220.122*/("""">
                                                </a>
                                            </div>
                                            <a href="#" class="name">灿烈</a>
                                            <span content="2017-10-28" class="main-meta">2017-10-28 23:34:49</span>
                                            <br>
                                            <span class="score"> 9.9 分</span>
                                        </header>
                                        <div class="main-bd">
                                            <div class="review-short">
                                                <div class="short-content">
                                                    <p class="book_comment">
                                                        人生如逆旅，我亦是行人。人生匆匆，对于刚刚进入职场的年轻人来讲，生活已经安定下来了，如果有一个稳定的结婚对象，那么生活基本已经定了型，即未来几十年里，会不断重复着上班下班、接待客户或者相夫教子的生活。
                                                        可芒芴之间，总会觉得生活缺了点什么。可能有时一觉醒来，会...
                                                        &nbsp;(<a href="#" class="unfold" title="查看全部">查看全部</a>)
                                                    </p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </li>
                            </ul>
                                <!-- COLLECTED CSS -->
                        </div>
                        <p class="pl">><a href="#">更多评论</a></p>
                    </section>

                    <div class="panel panel-default" id="write-comment">
                        <div class="panel-heading">
                            <h3 class="panel-title">
                                <span class="fa fa-flag" style="color: red"></span> &nbsp;&nbsp;发表评论
                            </h3>
                        </div>
                        <div class="panel-body">
                            <form class="form-horizontal">
                                <div>
                                    <div class="give-grade col-xs-1">
                                        分数:</div><input type="text" class="input-grade col-xs-11" placeholder="请输入您给予的分数    (0-100)" >
                                </div>
                                <div class="btn-toolbar" data-role="editor-toolbar" data-target="#editor">
                                    <div class="btn-group">
                                        <a class="btn btn-default" data-edit="italic" title="斜体">
                                            <i class="fa fa-italic"></i>
                                        </a>
                                        <a class="btn btn-default" data-edit="bold" title="粗体">
                                            <i class="fa fa-bold"></i>
                                        </a>
                                        <a class="btn btn-default" data-edit="strikethrough" title="删除线">
                                            <i class="fa fa-strikethrough"></i>
                                        </a>
                                        <a class="btn btn-default" data-edit="underline" title="下划线">
                                            <i class="fa fa-underline"></i>
                                        </a>
                                    </div>
                                    <div class="btn-group">
                                        <a class="btn btn-default" data-edit="justifyleft" title="左对齐">
                                            <i class="fa fa-align-left"></i>
                                        </a>
                                        <a class="btn btn-default" data-edit="justifycenter" title="居中对齐">
                                            <i class="fa fa-align-center"></i>
                                        </a>
                                        <a class="btn btn-default" data-edit="justifyright" title="右对齐">
                                            <i class="fa fa-align-right"></i>
                                        </a>
                                        <a class="btn btn-default" data-edit="justifyfull" title="两段对齐">
                                            <i class="fa fa-align-justify"></i>
                                        </a>
                                    </div>
                                </div>
                                <div id="editor" class="form-control" style="height: 300px">请发表文明评论</div>
                                <button class="btn btn-primary publish-comment ">发表评论</button>
                                <button class="btn btn-primary del-publish-comment ">取消发表</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
    <"""),_display_(/*300.7*/footer()),format.raw/*300.15*/("""
    """),format.raw/*301.5*/("""<!-- FlexSlider -->
    <link href=""""),_display_(/*302.18*/routes/*302.24*/.Assets.at("css/flexslider.css")),format.raw/*302.56*/("""" rel='stylesheet' type='text/css'/>
    <script defer src=""""),_display_(/*303.25*/routes/*303.31*/.Assets.at("js/jquery.flexslider.js")),format.raw/*303.68*/(""""></script>
<script type="text/javascript">
        $(function () """),format.raw/*305.23*/("""{"""),format.raw/*305.24*/("""
            """),format.raw/*306.13*/("""SyntaxHighlighter.all();
        """),format.raw/*307.9*/("""}"""),format.raw/*307.10*/(""");
        $(window).load(function () """),format.raw/*308.36*/("""{"""),format.raw/*308.37*/("""
            """),format.raw/*309.13*/("""$('.flexslider').flexslider("""),format.raw/*309.41*/("""{"""),format.raw/*309.42*/("""
                """),format.raw/*310.17*/("""animation: "slide",
                start: function (slider) """),format.raw/*311.42*/("""{"""),format.raw/*311.43*/("""
                    """),format.raw/*312.21*/("""$('body').removeClass('loading');
                """),format.raw/*313.17*/("""}"""),format.raw/*313.18*/("""
            """),format.raw/*314.13*/("""}"""),format.raw/*314.14*/(""");
        """),format.raw/*315.9*/("""}"""),format.raw/*315.10*/(""");
</script>
<script>
        $(function () """),format.raw/*318.23*/("""{"""),format.raw/*318.24*/("""
            """),format.raw/*319.13*/("""$('[data-toggle = "tooltip"]').tooltip();
        """),format.raw/*320.9*/("""}"""),format.raw/*320.10*/(""");
        $('a[title]').tooltip("""),format.raw/*321.31*/("""{"""),format.raw/*321.32*/("""container: 'body'"""),format.raw/*321.49*/("""}"""),format.raw/*321.50*/(""");
        $('#editor').wysiwyg();
</script>
    <!-- FlexSlider -->
</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 19 21:21:20 CST 2017
                  SOURCE: /home/fan/sbtProject/MANAGER/app/views/common/ProjectInfo.scala.html
                  HASH: f5c74a5032023a50ecae951fefda5884d84b99a8
                  MATRIX: 735->1|831->3|859->5|912->33|930->43|969->45|1009->58|1083->106|1097->112|1150->145|1218->187|1232->193|1289->230|1349->264|1363->270|1417->304|1543->402|1572->403|1621->424|1711->486|1740->487|1801->520|1980->671|2009->672|2079->714|2108->715|2169->748|2346->897|2375->898|2424->919|2471->938|2500->939|2556->965|2584->966|2622->978|2648->983|2684->992|3706->1987|3721->1993|3770->2021|4280->2503|4309->2504|4384->2551|4413->2552|4829->2941|4844->2947|4894->2976|5510->3565|5525->3571|5575->3600|6191->4189|6206->4195|6256->4224|8374->6314|8390->6320|8443->6351|10424->8304|10440->8310|10492->8339|12323->10142|12339->10148|12391->10177|14222->11980|14238->11986|14290->12015|19336->17034|19366->17042|19399->17047|19464->17084|19480->17090|19534->17122|19623->17183|19639->17189|19698->17226|19793->17292|19823->17293|19865->17306|19926->17339|19956->17340|20023->17378|20053->17379|20095->17392|20152->17420|20182->17421|20228->17438|20318->17499|20348->17500|20398->17521|20477->17571|20507->17572|20549->17585|20579->17586|20618->17597|20648->17598|20721->17642|20751->17643|20793->17656|20871->17706|20901->17707|20963->17740|20993->17741|21039->17758|21069->17759
                  LINES: 21->1|26->1|28->3|30->5|30->5|30->5|31->6|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|37->12|37->12|38->13|39->14|39->14|40->15|42->17|42->17|43->18|43->18|44->19|46->21|46->21|47->22|48->23|48->23|50->25|51->26|52->27|52->27|53->28|78->53|78->53|78->53|87->62|87->62|88->63|88->63|97->72|97->72|97->72|109->84|109->84|109->84|121->96|121->96|121->96|161->136|161->136|161->136|193->168|193->168|193->168|219->194|219->194|219->194|245->220|245->220|245->220|325->300|325->300|326->301|327->302|327->302|327->302|328->303|328->303|328->303|330->305|330->305|331->306|332->307|332->307|333->308|333->308|334->309|334->309|334->309|335->310|336->311|336->311|337->312|338->313|338->313|339->314|339->314|340->315|340->315|343->318|343->318|344->319|345->320|345->320|346->321|346->321|346->321|346->321
                  -- GENERATED --
              */
          