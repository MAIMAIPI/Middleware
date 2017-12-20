
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

object PersonProject extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE HTML>
<html>
    """),_display_(/*5.6*/head("我的项目信息")/*5.20*/ {_display_(Seq[Any](format.raw/*5.22*/("""
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
            <h3>我的项目信息</h3>
            <p class="description">
                Welcome to join JSUCCW! Here we will meet a group of like-minded students,
                grow together, learn professional knowledge, I hope everyone here can meet better myself. Finally, I wish
                you all success!
            </p>
            <div class="breadcrumb1">
                <ul>
                    <li class="icon6"><a href="index.html">首页</a></li>
                    <li class="current-page">我的项目信息</li>
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
                    <div class="project_sumup" contenteditable="true">
                        你对自己的项目有些什么感悟呢？
                    </div>
                    <input type="submit" value="确认" class="project-submit">
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
                            <div class="document"><p class="notice">请上传您的需求文档</p></div>
                            <div class="UDload">
                                <a class="upload"><i class="fa fa-arrow-circle-o-up"></i></a>
                                <a class="download"><i class="fa fa-arrow-circle-o-down"></i></a>
                            </div>
                        </li>
                        <li class="clearfix">
                            <div class="Text">功能点和技术点&nbsp;:</div>
                            <div class="document"><p class="notice">请上传您的功能点和技术点文档</p></div>
                            <div class="UDload">
                                <a class="upload"><i class="fa fa-arrow-circle-o-up"></i></a>
                                <a class="download"><i class="fa fa-arrow-circle-o-down"></i></a>
                            </div>
                        </li>
                        <li class="clearfix GTpic">
                            <div class="addPic"><img src=""""),_display_(/*137.60*/routes/*137.66*/.Assets.at("images/addPic.png")),format.raw/*137.97*/("""" style="width: 80px"></div>
                            <div class="picShow"><p class="notice">请上传您的甘特图</p></div>
                            <div class="UDload">
                                <a class="upload"><i class="fa fa-arrow-circle-o-up"></i></a>
                                <a class="download"><i class="fa fa-arrow-circle-o-down"></i></a>
                            </div>
                        </li>
                        <li class="clearfix">
                            <div class="Text col-xs-2">Github链接&nbsp;:</div>
                            <div class="link col-xs-9"><input type="text" placeholder="请上传您的Github链接" style="width: 100%"></div>
                            <div class="UDload col-xs-1">
                                <a class="upload"><i class="fa fa-arrow-circle-o-up"></i></a>
                            </div>
                        </li>
                    </ul>
                    <section class="reviews mod book-content">
                        <header>
                            <div class="table-header clearfix">
                                <div class="comment">项目评论区</div>
                                    <!--<a href="#write-comment" class="create-review btn  redbutt rr">
                                <span>我要打分</span>
                            </a>-->
                            </div>

                        </header>
                        <div class="review-list  ">
                            <ul>
                                <li>
                                    <div class="main review-item">
                                        <header class="main-hd">
                                            <div class="ll">
                                                <a href="#" class="avator">
                                                    <img width="40" height="40" src=""""),_display_(/*169.87*/routes/*169.93*/.Assets.at("images/head.jpg")),format.raw/*169.122*/("""">
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
                                                    <img width="40" height="40" src=""""),_display_(/*195.87*/routes/*195.93*/.Assets.at("images/head.jpg")),format.raw/*195.122*/("""">
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
                                                    <img width="40" height="40" src=""""),_display_(/*221.87*/routes/*221.93*/.Assets.at("images/head.jpg")),format.raw/*221.122*/("""">
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
    """),_display_(/*297.6*/footer()),format.raw/*297.14*/("""
        """),format.raw/*298.9*/("""<!-- FlexSlider -->
    <link href=""""),_display_(/*299.18*/routes/*299.24*/.Assets.at("css/flexslider.css")),format.raw/*299.56*/("""" rel='stylesheet' type='text/css'/>
    <script defer src=""""),_display_(/*300.25*/routes/*300.31*/.Assets.at("js/jquery.flexslider.js")),format.raw/*300.68*/(""""></script>
<script type="text/javascript">
        $(function () """),format.raw/*302.23*/("""{"""),format.raw/*302.24*/("""
            """),format.raw/*303.13*/("""SyntaxHighlighter.all();
        """),format.raw/*304.9*/("""}"""),format.raw/*304.10*/(""");
        $(window).load(function () """),format.raw/*305.36*/("""{"""),format.raw/*305.37*/("""
            """),format.raw/*306.13*/("""$('.flexslider').flexslider("""),format.raw/*306.41*/("""{"""),format.raw/*306.42*/("""
                """),format.raw/*307.17*/("""animation: "slide",
                start: function (slider) """),format.raw/*308.42*/("""{"""),format.raw/*308.43*/("""
                    """),format.raw/*309.21*/("""$('body').removeClass('loading');
                """),format.raw/*310.17*/("""}"""),format.raw/*310.18*/("""
            """),format.raw/*311.13*/("""}"""),format.raw/*311.14*/(""");
        """),format.raw/*312.9*/("""}"""),format.raw/*312.10*/(""");
</script>
<script>
        $(function () """),format.raw/*315.23*/("""{"""),format.raw/*315.24*/("""
            """),format.raw/*316.13*/("""$('[data-toggle = "tooltip"]').tooltip();
        """),format.raw/*317.9*/("""}"""),format.raw/*317.10*/(""");
        $('a[title]').tooltip("""),format.raw/*318.31*/("""{"""),format.raw/*318.32*/("""container: 'body'"""),format.raw/*318.49*/("""}"""),format.raw/*318.50*/(""");
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
                  DATE: Tue Dec 19 21:12:11 CST 2017
                  SOURCE: /home/fan/sbtProject/MANAGER/app/views/common/PersonProject.scala.html
                  HASH: 896de8523a4412d74f39701aae19ce3ec9c64f24
                  MATRIX: 737->1|833->3|861->5|914->33|936->47|975->49|1015->62|1089->110|1103->116|1156->149|1224->191|1238->197|1295->234|1355->268|1369->274|1423->308|1549->406|1578->407|1627->428|1717->490|1746->491|1807->524|1986->675|2015->676|2085->718|2114->719|2175->752|2352->901|2381->902|2430->923|2477->942|2506->943|2562->969|2590->970|2628->982|2654->987|2690->996|3716->1995|3731->2001|3780->2029|4290->2511|4319->2512|4394->2559|4423->2560|4839->2949|4854->2955|4904->2984|5520->3573|5535->3579|5585->3608|6201->4197|6216->4203|6266->4232|8451->6389|8467->6395|8520->6426|10426->8304|10442->8310|10494->8339|12325->10142|12341->10148|12393->10177|14224->11980|14240->11986|14292->12015|19055->16751|19085->16759|19122->16768|19187->16805|19203->16811|19257->16843|19346->16904|19362->16910|19421->16947|19516->17013|19546->17014|19588->17027|19649->17060|19679->17061|19746->17099|19776->17100|19818->17113|19875->17141|19905->17142|19951->17159|20041->17220|20071->17221|20121->17242|20200->17292|20230->17293|20272->17306|20302->17307|20341->17318|20371->17319|20444->17363|20474->17364|20516->17377|20594->17427|20624->17428|20686->17461|20716->17462|20762->17479|20792->17480
                  LINES: 21->1|26->1|28->3|30->5|30->5|30->5|31->6|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|37->12|37->12|38->13|39->14|39->14|40->15|42->17|42->17|43->18|43->18|44->19|46->21|46->21|47->22|48->23|48->23|50->25|51->26|52->27|52->27|53->28|78->53|78->53|78->53|87->62|87->62|88->63|88->63|97->72|97->72|97->72|109->84|109->84|109->84|121->96|121->96|121->96|162->137|162->137|162->137|194->169|194->169|194->169|220->195|220->195|220->195|246->221|246->221|246->221|322->297|322->297|323->298|324->299|324->299|324->299|325->300|325->300|325->300|327->302|327->302|328->303|329->304|329->304|330->305|330->305|331->306|331->306|331->306|332->307|333->308|333->308|334->309|335->310|335->310|336->311|336->311|337->312|337->312|340->315|340->315|341->316|342->317|342->317|343->318|343->318|343->318|343->318
                  -- GENERATED --
              */
          