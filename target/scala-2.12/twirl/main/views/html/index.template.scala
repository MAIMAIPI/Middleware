
package views.html

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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE HTML>
<html>
    """),_display_(/*5.6*/head("首页")/*5.16*/ {_display_(Seq[Any](format.raw/*5.18*/("""
            """),format.raw/*6.13*/("""<!--Add-->
        <link href=""""),_display_(/*7.22*/routes/*7.28*/.Assets.at("css/index.css")),format.raw/*7.55*/("""" rel='stylesheet' type='text/css'/>
            <!--Add-->
        <script>
                $(document).ready(function () """),format.raw/*10.47*/("""{"""),format.raw/*10.48*/("""
                    """),format.raw/*11.21*/("""$(".dropdown").hover(
                            function () """),format.raw/*12.41*/("""{"""),format.raw/*12.42*/("""
                                """),format.raw/*13.33*/("""$('.dropdown-menu', this).stop(true, true).slideDown("fast");
                                $(this).toggleClass('open');
                            """),format.raw/*15.29*/("""}"""),format.raw/*15.30*/(""",
                            function () """),format.raw/*16.41*/("""{"""),format.raw/*16.42*/("""
                                """),format.raw/*17.33*/("""$('.dropdown-menu', this).stop(true, true).slideUp("fast");
                                $(this).toggleClass('open');
                            """),format.raw/*19.29*/("""}"""),format.raw/*19.30*/("""
                    """),format.raw/*20.21*/(""");

                    var data = [
                        """),format.raw/*23.25*/("""{"""),format.raw/*23.26*/("""
                            """),format.raw/*24.29*/("""source: "项目管理",
                            content: [
                                "名称",
                                "成员",
                                "创建时间"
                            ]
                        """),format.raw/*30.25*/("""}"""),format.raw/*30.26*/(""",
                        """),format.raw/*31.25*/("""{"""),format.raw/*31.26*/("""
                            """),format.raw/*32.29*/("""source: "ACM管理",
                            content: [
                                "题名",
                                "刷题人",
                                "已经AC"
                            ]
                        """),format.raw/*38.25*/("""}"""),format.raw/*38.26*/(""",
                        """),format.raw/*39.25*/("""{"""),format.raw/*39.26*/("""
                            """),format.raw/*40.29*/("""source: "读书管理",
                            content: [
                                "书名",
                                "阅读者"
                            ]
                        """),format.raw/*45.25*/("""}"""),format.raw/*45.26*/("""
                    """),format.raw/*46.21*/("""];
                    var s1 = $("#sources");
                    var s2 = $("#contents");

                    $.each(data, function (d) """),format.raw/*50.47*/("""{"""),format.raw/*50.48*/("""
                        """),format.raw/*51.25*/("""var t = data[d].source;
                        s1.append("<option value='" + t + "'>" + t + "</option>")
                    """),format.raw/*53.21*/("""}"""),format.raw/*53.22*/(""");

                    var init = data[0].content;

                    $.each(init, function (d) """),format.raw/*57.47*/("""{"""),format.raw/*57.48*/("""
                        """),format.raw/*58.25*/("""s2.append("<option value='" + init[d] + "'>" + init[d] + "</option>")
                    """),format.raw/*59.21*/("""}"""),format.raw/*59.22*/(""");

                    s1.change(function () """),format.raw/*61.43*/("""{"""),format.raw/*61.44*/("""
                        """),format.raw/*62.25*/("""s2.empty();
                        var index = s1.get(0).selectedIndex;
                        var t = data[index].content;
                        $.each(t, function (d) """),format.raw/*65.48*/("""{"""),format.raw/*65.49*/("""
                            """),format.raw/*66.29*/("""s2.append("<option value='" + t[d] + "'>" + t[d] + "</option>")
                        """),format.raw/*67.25*/("""}"""),format.raw/*67.26*/(""")
                    """),format.raw/*68.21*/("""}"""),format.raw/*68.22*/(""")
                """),format.raw/*69.17*/("""}"""),format.raw/*69.18*/(""");
        </script>
    """)))}),format.raw/*71.6*/("""
"""),format.raw/*72.1*/("""<body>
    """),_display_(/*73.6*/nav()),format.raw/*73.11*/("""
        """),format.raw/*74.9*/("""<!-- banner -->
    <div class="banner">
            <!-- banner Slider starts Here -->
        <script src=""""),_display_(/*77.23*/routes/*77.29*/.Assets.at("js/responsiveslides.min.js")),format.raw/*77.69*/(""""></script>
        <script>
                // You can also use "$(window).load(function() """),format.raw/*79.64*/("""{"""),format.raw/*79.65*/(""""
                $(function () """),format.raw/*80.31*/("""{"""),format.raw/*80.32*/("""
                    """),format.raw/*81.21*/("""// Slideshow 4
                    $("#slider3").responsiveSlides("""),format.raw/*82.52*/("""{"""),format.raw/*82.53*/("""
                        """),format.raw/*83.25*/("""auto: true,
                        pager: true,
                        nav: true,
                        speed: 500,
                        namespace: "callbacks",
                        before: function () """),format.raw/*88.45*/("""{"""),format.raw/*88.46*/("""
                            """),format.raw/*89.29*/("""$('.events').append("<li>before event fired.</li>");
                        """),format.raw/*90.25*/("""}"""),format.raw/*90.26*/(""",
                        after: function () """),format.raw/*91.44*/("""{"""),format.raw/*91.45*/("""
                            """),format.raw/*92.29*/("""$('.events').append("<li>after event fired.</li>");
                        """),format.raw/*93.25*/("""}"""),format.raw/*93.26*/("""
                    """),format.raw/*94.21*/("""}"""),format.raw/*94.22*/(""");

                """),format.raw/*96.17*/("""}"""),format.raw/*96.18*/(""");
        </script>
            <!--//End-slider-script -->
        <div id="top" class="callbacks_container">
            <ul class="rslides" id="slider3">
                <li>
                    <div class="banner-bg">
                        <div class="container">
                            <div class="banner-info">
                                <h3>Take the first step<span>to knowledge friends</span></h3>
                                <p>Inspired by Brasil’s bold colors and matching up to football’s on-pitch
                                    playmakers, these kicks are ready to stand out.
                                </p>
                            </div>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="banner-bg banner-img2">
                        <div class="container">
                            <div class="banner-info">
                                <h3>Stay in touch<span>Lorem Ipsum</span></h3>
                                <p>Inspired by bold colors and matching up to football’s on-pitch
                                    playmakers, these kicks are ready to stand out.
                                </p>
                            </div>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="banner-bg banner-img">
                        <div class="container">
                            <div class="banner-info">
                                <h3>therefore always<span>looks reasonable</span></h3>
                                <p>Inspired by Brasil’s bold colors and matching up to football’s on-pitch
                                    playmakers, these Brasil’s kicks are ready to stand out.
                                </p>
                            </div>
                        </div>
                    </div>
                </li>
            </ul>
        </div>
    </div>
        <!-- //banner -->
        <!--<div class="copyrights">Collect from <a href="http://www.cssmoban.com/">手机网站模板</a></div>-->
    <div class="details">
        <div class="container">
            <div class="col-sm-10 dropdown-buttons">
                <div class="col-sm-4 dropdown-button">
                    <div class="section_1">
                            <!-- <select id="country" onChange="change_country(this.value)" class="frm-field required">-->
                        <select id="sources" class="frm-field required">
                        </select>
                    </div>
                </div>
                <div class="col-sm-4 dropdown-button">
                    <div class="section_1">
                        <select id="contents" class="frm-field required">
                        </select>
                    </div>
                </div>
                <div class="col-sm-4 dropdown-button">
                    <div class="input-group">
                        <input class="form-control has-dark-background" name="slider-name" id="slider-name"
                        placeholder="本馆资源搜索" type="text" required="">
                    </div>
                </div>
                <div class="clearfix"></div>
            </div>
            <div class="col-sm-2 submit_button">
                <form>
                    <input type="submit" value="搜索">
                </form>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
    <div class="grid_1">
        <div class="container">
            <div class="col-md-4">
                <div class="news">
                    <h3>检查结果</h3>
                    <div class="section-content">
                        <article>
                            <figure class="date"><i class="fa fa-file-o"></i>07-25-2017</figure>
                            <a href="#">大二项目中期检查结果公示</a>
                        </article>
                        <article>
                            <figure class="date"><i class="fa fa-file-o"></i>08-24-2017</figure>
                            <a href="#">大一项目末期检查结果公示</a>
                        </article>
                        <article>
                            <figure class="date"><i class="fa fa-file-o"></i>08-24-2017</figure>
                            <a href="#">大三服创项目检查结果公示</a>
                        </article>
                        <article>
                            <figure class="date"><i class="fa fa-file-o"></i>08-24-2017</figure>
                            <a href="#">大一刷题数检查结果公示</a>
                        </article>

                    </div><!-- /.section-content -->
                    <a href="#" class="read-more">更多</a>
                </div><!-- /.news-small -->
            </div>
            <div class="col-md-8 grid_1_right">
                <h3>工作室通知</h3>
                <div class="but_list">
                    <div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
                        <ul id="myTab" class="nav nav-tabs nav-tabs1" role="tablist">
                            <li role="presentation" class="active"><a href="#home" id="home-tab" role="tab"
                            data-toggle="tab" aria-controls="home"
                            aria-expanded="true">任务通知</a></li>
                            <li role="presentation"><a href="#profile" role="tab" id="profile-tab" data-toggle="tab"
                            aria-controls="profile">比赛通知</a></li>
                            <li role="presentation"><a href="#profile1" role="tab" id="profile-tab1" data-toggle="tab"
                            aria-controls="profile1">个人通知</a></li>
                        </ul>
                        <div id="myTabContent" class="tab-content">
                            <div role="tabpanel" class="tab-pane fade in active" id="home" aria-labelledby="home-tab">
                                <div class="events_box">
                                    <div class="event_left">
                                        <div class="event_left-item">
                                            <div class="icon_2"><i class="fa fa-clock-o"></i>2017/02/05 19:30</div>
                                                <!--<div class="icon_2"><i class="fa fa-user"></i>From Who</div>-->
                                            <div class="icon_2">
                                                <div class="speaker">
                                                    <i class="fa fa-user"></i>
                                                    <div class="speaker_item">
                                                        <a href="#">刘先生</a>
                                                    </div>
                                                    <div class="clearfix"></div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="event_right">
                                        <h3><a href="#">大二项目选题</a></h3>
                                        <p>请大二的各位同学下载项目题目文档，从里面选择一个题目作为本次的项目题目，并创建好项目 <a href="#">更多</a></p>
                                    </div>
                                    <div class="clearfix"></div>
                                </div>
                                <div class="events_box">
                                    <div class="event_left">
                                        <div class="event_left-item">
                                            <div class="icon_2"><i class="fa fa-clock-o"></i>2017/02/05 19:30</div>
                                                <!--<div class="icon_2"><i class="fa fa-user"></i>From Who</div>-->
                                            <div class="icon_2">
                                                <div class="speaker">
                                                    <i class="fa fa-user"></i>
                                                    <div class="speaker_item">
                                                        <a href="#">刘先生</a>
                                                    </div>
                                                    <div class="clearfix"></div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="event_right">
                                        <h3><a href="#">大二项目选题</a></h3>
                                        <p>请大二的各位同学下载项目题目文档，从里面选择一个题目作为本次的项目题目，并创建好项目 <a href="#">更多</a></p>
                                    </div>
                                    <div class="clearfix"></div>
                                </div>
                                <div class="events_box">
                                    <div class="event_left">
                                        <div class="event_left-item">
                                            <div class="icon_2"><i class="fa fa-clock-o"></i>2017/02/05 19:30</div>
                                                <!--<div class="icon_2"><i class="fa fa-user"></i>From Who</div>-->
                                            <div class="icon_2">
                                                <div class="speaker">
                                                    <i class="fa fa-user"></i>
                                                    <div class="speaker_item">
                                                        <a href="#">刘先生</a>
                                                    </div>
                                                    <div class="clearfix"></div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="event_right">
                                        <h3><a href="#">大二项目选题</a></h3>
                                        <p>请大二的各位同学下载项目题目文档，从里面选择一个题目作为本次的项目题目，并创建好项目 <a href="#">更多</a></p>
                                    </div>
                                    <div class="clearfix"></div>
                                </div>
                            </div>
                            <div role="tabpanel" class="tab-pane fade" id="profile" aria-labelledby="profile-tab">
                                <div class="events_box">
                                    <div class="event_left">
                                        <div class="event_left-item">
                                            <div class="icon_2"><i class="fa fa-clock-o"></i>2017/02/05 19:30</div>
                                                <!--<div class="icon_2"><i class="fa fa-user"></i>From Who</div>-->
                                            <div class="icon_2">
                                                <div class="speaker">
                                                    <i class="fa fa-user"></i>
                                                    <div class="speaker_item">
                                                        <a href="#">刘先生</a>
                                                    </div>
                                                    <div class="clearfix"></div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="event_right">
                                        <h3><a href="#">服创比赛</a></h3>
                                        <p>明天开始进行服创比赛报名，请大家开始自行组队，然后报名 <a href="#">更多</a></p>
                                    </div>
                                    <div class="clearfix"></div>
                                </div>
                                <div class="events_box">
                                    <div class="event_left">
                                        <div class="event_left-item">
                                            <div class="icon_2"><i class="fa fa-clock-o"></i>2017/02/05 19:30</div>
                                            <div class="icon_2">
                                                <div class="speaker">
                                                    <i class="fa fa-user"></i>
                                                    <div class="speaker_item">
                                                        <a href="#">刘先生</a>
                                                    </div>
                                                    <div class="clearfix"></div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="event_right">
                                        <h3><a href="#">服创比赛</a></h3>
                                        <p>明天开始进行服创比赛报名，请大家开始自行组队，然后报名 <a href="#">更多</a></p>
                                    </div>
                                    <div class="clearfix"></div>
                                </div>
                                <div class="events_box">
                                    <div class="event_left">
                                        <div class="event_left-item">
                                            <div class="icon_2"><i class="fa fa-clock-o"></i>2017/02/05 19:30</div>
                                            <div class="icon_2">
                                                <div class="speaker">
                                                    <i class="fa fa-user"></i>
                                                    <div class="speaker_item">
                                                        <a href="#">刘先生</a>
                                                    </div>
                                                    <div class="clearfix"></div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="event_right">
                                        <h3><a href="#">服创比赛</a></h3>
                                        <p>明天开始进行服创比赛报名，请大家开始自行组队，然后报名 <a href="#">更多</a></p>
                                    </div>
                                    <div class="clearfix"></div>
                                </div>
                            </div>
                            <div role="tabpanel" class="tab-pane fade" id="profile1" aria-labelledby="profile-tab1">
                                <div class="events_box">
                                    <div class="event_left">
                                        <div class="event_left-item">
                                            <div class="icon_2"><i class="fa fa-clock-o"></i>2017/02/05 19:30</div>
                                                <!--<div class="icon_2"><i class="fa fa-user"></i>来自:刘先生</div>-->
                                            <div class="icon_2">
                                                <div class="speaker">
                                                    <i class="fa fa-user"></i>
                                                    <div class="speaker_item">
                                                        <a href="#">刘先生</a>
                                                    </div>
                                                    <div class="clearfix"></div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="event_right">
                                        <h3><a href="#">需求分析更新</a></h3>
                                        <p>刘先生的项目需求分析更新啦 <a href="#">更多</a></p>
                                    </div>
                                    <div class="clearfix"></div>
                                </div>
                                <div class="events_box">
                                    <div class="event_left">
                                        <div class="event_left-item">
                                            <div class="icon_2"><i class="fa fa-clock-o"></i>2017/02/05 19:30</div>
                                            <div class="icon_2">
                                                <div class="speaker">
                                                    <i class="fa fa-user"></i>
                                                    <div class="speaker_item">
                                                        <a href="#">刘先生</a>
                                                    </div>
                                                    <div class="clearfix"></div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="event_right">
                                        <h3><a href="#">需求分析更新</a></h3>
                                        <p>刘先生的项目需求分析更新啦 <a href="#">更多</a></p>
                                    </div>
                                    <div class="clearfix"></div>
                                </div>
                                <div class="events_box">
                                    <div class="event_left">
                                        <div class="event_left-item">
                                            <div class="icon_2"><i class="fa fa-clock-o"></i>2017/02/05 19:30</div>
                                            <div class="icon_2">
                                                <div class="speaker">
                                                    <i class="fa fa-user"></i>
                                                    <div class="speaker_item">
                                                        <a href="#">刘先生</a>
                                                    </div>
                                                    <div class="clearfix"></div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="event_right">
                                        <h3><a href="#">需求分析更新</a></h3>
                                        <p>刘先生的项目需求分析更新啦 <a href="#">更多</a></p>
                                    </div>
                                    <div class="clearfix"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <a href="#" class="read-more">更多</a>
                <div class="clearfix"></div>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
    """),_display_(/*424.6*/footer()),format.raw/*424.14*/("""
    """),format.raw/*425.5*/("""<script src=""""),_display_(/*425.19*/routes/*425.25*/.Assets.at("js/jquery.countdown.js")),format.raw/*425.61*/(""""></script>
    <script src=""""),_display_(/*426.19*/routes/*426.25*/.Assets.at("js/script.js")),format.raw/*426.51*/(""""></script>
</body>
</html>"""),format.raw/*428.8*/("""}"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 19 21:02:24 CST 2017
                  SOURCE: /home/fan/sbtProject/MANAGER/app/views/index.scala.html
                  HASH: 8d86f3085f4d0c9192a35fbbfd1c041a624b2794
                  MATRIX: 722->1|818->3|846->5|899->33|917->43|956->45|996->58|1054->90|1068->96|1115->123|1266->246|1295->247|1344->268|1434->330|1463->331|1524->364|1703->515|1732->516|1802->558|1831->559|1892->592|2069->741|2098->742|2147->763|2236->824|2265->825|2322->854|2574->1078|2603->1079|2657->1105|2686->1106|2743->1135|2997->1361|3026->1362|3080->1388|3109->1389|3166->1418|3379->1603|3408->1604|3457->1625|3624->1764|3653->1765|3706->1790|3860->1916|3889->1917|4016->2016|4045->2017|4098->2042|4216->2132|4245->2133|4319->2179|4348->2180|4401->2205|4602->2378|4631->2379|4688->2408|4804->2496|4833->2497|4883->2519|4912->2520|4958->2538|4987->2539|5043->2565|5071->2566|5109->2578|5135->2583|5171->2592|5308->2702|5323->2708|5384->2748|5504->2840|5533->2841|5593->2873|5622->2874|5671->2895|5765->2961|5794->2962|5847->2987|6087->3199|6116->3200|6173->3229|6278->3306|6307->3307|6380->3352|6409->3353|6466->3382|6570->3458|6599->3459|6648->3480|6677->3481|6725->3501|6754->3502|26353->23074|26383->23082|26416->23087|26458->23101|26474->23107|26532->23143|26590->23173|26606->23179|26654->23205|26709->23232
                  LINES: 21->1|26->1|28->3|30->5|30->5|30->5|31->6|32->7|32->7|32->7|35->10|35->10|36->11|37->12|37->12|38->13|40->15|40->15|41->16|41->16|42->17|44->19|44->19|45->20|48->23|48->23|49->24|55->30|55->30|56->31|56->31|57->32|63->38|63->38|64->39|64->39|65->40|70->45|70->45|71->46|75->50|75->50|76->51|78->53|78->53|82->57|82->57|83->58|84->59|84->59|86->61|86->61|87->62|90->65|90->65|91->66|92->67|92->67|93->68|93->68|94->69|94->69|96->71|97->72|98->73|98->73|99->74|102->77|102->77|102->77|104->79|104->79|105->80|105->80|106->81|107->82|107->82|108->83|113->88|113->88|114->89|115->90|115->90|116->91|116->91|117->92|118->93|118->93|119->94|119->94|121->96|121->96|449->424|449->424|450->425|450->425|450->425|450->425|451->426|451->426|451->426|453->428
                  -- GENERATED --
              */
          