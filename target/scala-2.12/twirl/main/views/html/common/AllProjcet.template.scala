
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

object AllProjcet extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE HTML>
<html>
    """),_display_(/*5.6*/head("项目管理展示")/*5.20*/ {_display_(Seq[Any](format.raw/*5.22*/("""
            """),format.raw/*6.13*/("""<!--Add-->
        <link href=""""),_display_(/*7.22*/routes/*7.28*/.Assets.at("css/user.css")),format.raw/*7.54*/("""" rel="stylesheet" type="text/css"/>
        <link href=""""),_display_(/*8.22*/routes/*8.28*/.Assets.at("css/allProject.css")),format.raw/*8.60*/("""" rel="stylesheet" type="text/css"/>
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
            <!----Calender -------->
        <link rel="stylesheet" href=""""),_display_(/*26.39*/routes/*26.45*/.Assets.at("css/clndr.css")),format.raw/*26.72*/("""" type="text/css"/>
        <script src=""""),_display_(/*27.23*/routes/*27.29*/.Assets.at("js/underscore-min.js")),format.raw/*27.63*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*28.23*/routes/*28.29*/.Assets.at("js/moment-2.2.1.js")),format.raw/*28.61*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*29.23*/routes/*29.29*/.Assets.at("js/clndr.js")),format.raw/*29.54*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*30.23*/routes/*30.29*/.Assets.at("js/site.js")),format.raw/*30.53*/("""" type="text/javascript"></script>
    """)))}),format.raw/*31.6*/("""
"""),format.raw/*32.1*/("""<body>
    """),_display_(/*33.6*/nav()),format.raw/*33.11*/("""
        """),format.raw/*34.9*/("""<!-- banner -->
    <div class="allProject_banner">
        <div class="container">
            <h3>所有信息</h3>
            <p class="description">
                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer lorem quam, adipiscing condimentum
                tristique vel, eleifend sed turpis. Pellentesque cursus arcu id magna euismod in elementum purus molestie.
            </p>
            <div class="breadcrumb1">
                <ul>
                    <li class="icon6"><a href=""""),_display_(/*44.49*/routes/*44.55*/.Application.index()),format.raw/*44.75*/("""">首页</a></li>
                    <li class="current-page">项目管理展示</li>
                </ul>
            </div>
        </div>
    </div>
        <!-- //banner -->
    <div class="allProject_main">
        <div class="container">
            <div class="col-md-3">
                <div class="leftmain">
                    <div class="west">
                        <ul>
                            <li class="account1">
                                <a id="west1" class="actived">
                                    <i class="fa fa-tasks"></i><span>17年下</span><i class="fa fa-angle-down"></i>
                                </a>
                            </li>
                            <div class="submenu1" style="display: none; ">
                                <ul class="root">
                                    <li>
                                        <a index="1" class="actived" onclick="change_div('dynamicall')">
                                            <i class="fa fa-leaf"></i><span>全部</span><i class="fa fa-angle-right"></i>
                                        </a>
                                    </li>
                                    <li>
                                        <a index="2">
                                            <i class="fa fa-leaf"></i><span>17级</span><i class="fa fa-angle-right"></i>
                                        </a>
                                    </li>
                                    <li>
                                        <a index="3">
                                            <i class="fa fa-leaf"></i><span>16级</span><i class="fa fa-angle-right"></i>
                                        </a>
                                    </li>
                                    <li>
                                        <a index="4">
                                            <i class="fa fa-leaf"></i><span>15级</span><i class="fa fa-angle-right"></i>
                                        </a>
                                    </li>
                                    <li>
                                        <a index="5">
                                            <i class="fa fa-leaf"></i><span>15级以前</span><i class="fa fa-angle-right"></i>
                                        </a>
                                    </li>
                                </ul>
                            </div>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="col-md-9 detail">
                <div class="panel  project_list">
                    <ul class="nav nav-tabs show-types-choose" id="tab_ul">
                        <li class="active mid-term-examination">
                            <a href="#zqjj" data-toggle="tab" id="zqjj_a">
                                <i class="fa fa-google-wallet"></i>&nbsp; 周期检查:
                            </a>
                        </li>
                        <li>
                            <select id="status" class="form-control batch-frequency" onchange="" name="status">
                                <option value="0"> 周期检查:&nbsp; 第一次</option>
                                <option value="1"> 周期检查:&nbsp; 第二次</option>
                                <option value="2"> 周期检查:&nbsp;第三次</option>
                            </select>
                        </li>
                        <li class="">
                            <a href="#qzjj" data-toggle="tab" id="qzjj_a">
                                <i class="fa fa-google-wallet"></i>&nbsp; 中期检查
                            </a>
                        </li>
                        <li class="final-examination">
                            <a href="#mqjj" data-toggle="tab" id="mqjj_a">
                                <i class="fa fa-google-wallet"></i>&nbsp; 末期检查
                            </a>
                        </li>

                    </ul>
                    <div class="tab-content">
                        <div class="table-header clearfix">
                            <div class="id_col">序号</div>
                            <div class="name_col">项目名</div>
                            <div class="member_col">创建人</div>
                            <div class="grade_col">打分</div>
                        </div>
                        <div class="tab-pane fade in active" id="zqjj">
                            <ul class="table-list">
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*133.69*/routes/*133.75*/.Application.projectInfo()),format.raw/*133.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a></div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*140.69*/routes/*140.75*/.Application.projectInfo()),format.raw/*140.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a></div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*147.69*/routes/*147.75*/.Application.projectInfo()),format.raw/*147.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a></div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*154.69*/routes/*154.75*/.Application.projectInfo()),format.raw/*154.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a></div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                            </ul>
                            <ul class="pagination event_pagination">
                                <li class="active"><a href="#">1</a></li>
                                <li><a href="#">2</a></li>
                            </ul>
                        </div>
                        <div class="tab-pane fade" id="qzjj">
                            <ul class="table-list">
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*169.69*/routes/*169.75*/.Application.projectInfo()),format.raw/*169.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a></div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*176.69*/routes/*176.75*/.Application.projectInfo()),format.raw/*176.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a></div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*183.69*/routes/*183.75*/.Application.projectInfo()),format.raw/*183.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a></div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*190.69*/routes/*190.75*/.Application.projectInfo()),format.raw/*190.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a></div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                            </ul>
                            <ul class="pagination event_pagination">
                                <li class="active"><a href="#">1</a></li>
                                <li><a href="#">2</a></li>
                            </ul>
                        </div>
                        <div class="tab-pane fade" id="mqjj">
                            <ul class="table-list">
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*205.69*/routes/*205.75*/.Application.projectInfo()),format.raw/*205.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a></div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*212.69*/routes/*212.75*/.Application.projectInfo()),format.raw/*212.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a></div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*219.69*/routes/*219.75*/.Application.projectInfo()),format.raw/*219.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a></div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*226.69*/routes/*226.75*/.Application.projectInfo()),format.raw/*226.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a></div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                            </ul>
                            <ul class="pagination event_pagination">
                                <li class="active"><a href="#">1</a></li>
                                <li><a href="#">2</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
    """),_display_(/*243.6*/footer()),format.raw/*243.14*/("""
        """),format.raw/*244.9*/("""<!-- FlexSlider -->
    <link href=""""),_display_(/*245.18*/routes/*245.24*/.Assets.at("css/flexslider.css")),format.raw/*245.56*/("""" rel='stylesheet' type='text/css'/>
    <script defer src=""""),_display_(/*246.25*/routes/*246.31*/.Assets.at("js/jquery.flexslider.js")),format.raw/*246.68*/(""""></script>
    <script src=""""),_display_(/*247.19*/routes/*247.25*/.Assets.at("js/allResources.js")),format.raw/*247.57*/(""""></script>
<script type="text/javascript">
        $(function () """),format.raw/*249.23*/("""{"""),format.raw/*249.24*/("""
            """),format.raw/*250.13*/("""SyntaxHighlighter.all();
        """),format.raw/*251.9*/("""}"""),format.raw/*251.10*/(""");
        $(window).load(function () """),format.raw/*252.36*/("""{"""),format.raw/*252.37*/("""
            """),format.raw/*253.13*/("""$('.flexslider').flexslider("""),format.raw/*253.41*/("""{"""),format.raw/*253.42*/("""
                """),format.raw/*254.17*/("""animation: "slide",
                start: function (slider) """),format.raw/*255.42*/("""{"""),format.raw/*255.43*/("""
                    """),format.raw/*256.21*/("""$('body').removeClass('loading');
                """),format.raw/*257.17*/("""}"""),format.raw/*257.18*/("""
            """),format.raw/*258.13*/("""}"""),format.raw/*258.14*/(""");
        """),format.raw/*259.9*/("""}"""),format.raw/*259.10*/(""");
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
                  DATE: Tue Dec 19 21:32:42 CST 2017
                  SOURCE: /home/fan/sbtProject/MANAGER/app/views/common/AllProjcet.scala.html
                  HASH: 7f894319ee0dfab0b7499d0f819d3d130132e979
                  MATRIX: 734->1|830->3|858->5|911->33|933->47|972->49|1012->62|1070->94|1084->100|1130->126|1214->184|1228->190|1280->222|1432->346|1461->347|1510->368|1600->430|1629->431|1690->464|1869->615|1898->616|1968->658|1997->659|2058->692|2235->841|2264->842|2313->863|2360->882|2389->883|2512->979|2527->985|2575->1012|2644->1054|2659->1060|2714->1094|2798->1151|2813->1157|2866->1189|2950->1246|2965->1252|3011->1277|3095->1334|3110->1340|3155->1364|3225->1404|3253->1405|3291->1417|3317->1422|3353->1431|3889->1940|3904->1946|3945->1966|8630->6623|8646->6629|8695->6655|9175->7107|9191->7113|9240->7139|9720->7591|9736->7597|9785->7623|10265->8075|10281->8081|10330->8107|11225->8974|11241->8980|11290->9006|11770->9458|11786->9464|11835->9490|12315->9942|12331->9948|12380->9974|12860->10426|12876->10432|12925->10458|13820->11325|13836->11331|13885->11357|14365->11809|14381->11815|14430->11841|14910->12293|14926->12299|14975->12325|15455->12777|15471->12783|15520->12809|16253->13515|16283->13523|16320->13532|16385->13569|16401->13575|16455->13607|16544->13668|16560->13674|16619->13711|16677->13741|16693->13747|16747->13779|16842->13845|16872->13846|16914->13859|16975->13892|17005->13893|17072->13931|17102->13932|17144->13945|17201->13973|17231->13974|17277->13991|17367->14052|17397->14053|17447->14074|17526->14124|17556->14125|17598->14138|17628->14139|17667->14150|17697->14151
                  LINES: 21->1|26->1|28->3|30->5|30->5|30->5|31->6|32->7|32->7|32->7|33->8|33->8|33->8|37->12|37->12|38->13|39->14|39->14|40->15|42->17|42->17|43->18|43->18|44->19|46->21|46->21|47->22|48->23|48->23|51->26|51->26|51->26|52->27|52->27|52->27|53->28|53->28|53->28|54->29|54->29|54->29|55->30|55->30|55->30|56->31|57->32|58->33|58->33|59->34|69->44|69->44|69->44|158->133|158->133|158->133|165->140|165->140|165->140|172->147|172->147|172->147|179->154|179->154|179->154|194->169|194->169|194->169|201->176|201->176|201->176|208->183|208->183|208->183|215->190|215->190|215->190|230->205|230->205|230->205|237->212|237->212|237->212|244->219|244->219|244->219|251->226|251->226|251->226|268->243|268->243|269->244|270->245|270->245|270->245|271->246|271->246|271->246|272->247|272->247|272->247|274->249|274->249|275->250|276->251|276->251|277->252|277->252|278->253|278->253|278->253|279->254|280->255|280->255|281->256|282->257|282->257|283->258|283->258|284->259|284->259
                  -- GENERATED --
              */
          