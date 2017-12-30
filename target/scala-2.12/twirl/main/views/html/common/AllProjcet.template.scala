
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

object AllProjcet extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[Batches],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(batches: Seq[Batches]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.25*/("""

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
        <link rel="stylesheet" href=""""),_display_(/*31.39*/routes/*31.45*/.Assets.at("layui/css/layui.css")),format.raw/*31.78*/(""""/>
    """)))}),format.raw/*32.6*/("""
"""),format.raw/*33.1*/("""<body>
    """),_display_(/*34.6*/nav()),format.raw/*34.11*/("""
        """),format.raw/*35.9*/("""<!-- banner -->
    <div class="allProject_banner">
        <div class="container">
            <h3>所有信息</h3>
            <p class="description">
                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer lorem quam, adipiscing condimentum
                tristique vel, eleifend sed turpis. Pellentesque cursus arcu id magna euismod in elementum purus molestie.
            </p>
            <div class="breadcrumb1">
                <ul>
                    <li class="icon6"><a href=""""),_display_(/*45.49*/routes/*45.55*/.Application.index()),format.raw/*45.75*/("""">首页</a></li>
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
                        """),_display_(/*58.26*/for(batch <- batches) yield /*58.47*/ {_display_(Seq[Any](format.raw/*58.49*/("""
                            """),format.raw/*59.29*/("""<li class="account1">
                                <a id="west1">
                                    <i class="fa fa-tasks"></i>
                                    <span>"""),_display_(/*62.44*/batch/*62.49*/.year),format.raw/*62.54*/(""" """),format.raw/*62.55*/("""年</span>
                                    <i class="fa fa-angle-down"></i>
                                </a>
                            </li>

                            <div class="submenu1" style="display: none; ">
                                <ul class="root">
                                """),_display_(/*69.34*/for(batchItem <- batch.batchList) yield /*69.67*/ {_display_(Seq[Any](format.raw/*69.69*/("""
                                    """),format.raw/*70.37*/("""<li>
                                        <a class="tag" id=""""),_display_(/*71.61*/batchItem/*71.70*/.bid),format.raw/*71.74*/("""">
                                            <i class="fa fa-leaf"></i>
                                            <span>"""),_display_(/*73.52*/{
                                                batchItem.level + batchItem.name + "学期"
                                            }),format.raw/*75.46*/("""</span>
                                            <i class="fa fa-angle-right"></i>
                                        </a>
                                    </li>
                                """)))}),format.raw/*79.34*/("""
                                """),format.raw/*80.33*/("""</ul>
                            </div>
                        """)))}),format.raw/*82.26*/("""
                        """),format.raw/*83.25*/("""</ul>
                    </div>
                </div>
            </div>
            <div class="col-md-9 detail">
                <div class="panel  project_list">
                    <ul class="nav nav-tabs show-types-choose" id="tab_ul">
                        <li class="active mid-term-examination">
                            <a href="#zqjj" data-toggle="tab" id="zqjj_a">
                                <i class="fa fa-google-wallet"></i>
                                    &nbsp; 周期检查:
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
                                <i class="fa fa-google-wallet"></i>
                                    &nbsp; 中期检查
                            </a>
                        </li>
                        <li class="final-examination">
                            <a href="#mqjj" data-toggle="tab" id="mqjj_a">
                                <i class="fa fa-google-wallet"></i>
                                    &nbsp; 末期检查
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
                                    <div class="name_col"><a href=""""),_display_(/*129.69*/routes/*129.75*/.Application.projectInfo()),format.raw/*129.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a>
                                    </div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*137.69*/routes/*137.75*/.Application.projectInfo()),format.raw/*137.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a>
                                    </div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*145.69*/routes/*145.75*/.Application.projectInfo()),format.raw/*145.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a>
                                    </div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*153.69*/routes/*153.75*/.Application.projectInfo()),format.raw/*153.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a>
                                    </div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                            </ul>
                            <div id="demo7" style="text-align: center"></div>
                        </div>
                        <div class="tab-pane fade" id="qzjj">
                            <ul class="table-list">
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*166.69*/routes/*166.75*/.Application.projectInfo()),format.raw/*166.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a>
                                    </div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*174.69*/routes/*174.75*/.Application.projectInfo()),format.raw/*174.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a>
                                    </div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*182.69*/routes/*182.75*/.Application.projectInfo()),format.raw/*182.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a>
                                    </div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*190.69*/routes/*190.75*/.Application.projectInfo()),format.raw/*190.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a>
                                    </div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                            </ul>
                            <div id="demo7"></div>
                        </div>
                        <div class="tab-pane fade" id="mqjj">
                            <ul class="table-list">
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*203.69*/routes/*203.75*/.Application.projectInfo()),format.raw/*203.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a>
                                    </div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*211.69*/routes/*211.75*/.Application.projectInfo()),format.raw/*211.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a>
                                    </div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*219.69*/routes/*219.75*/.Application.projectInfo()),format.raw/*219.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a>
                                    </div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*227.69*/routes/*227.75*/.Application.projectInfo()),format.raw/*227.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a>
                                    </div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                            </ul>
                            <div id="demo7"></div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
    """),_display_(/*242.6*/footer()),format.raw/*242.14*/("""
        """),format.raw/*243.9*/("""<!-- FlexSlider -->
    <link href=""""),_display_(/*244.18*/routes/*244.24*/.Assets.at("css/flexslider.css")),format.raw/*244.56*/("""" rel='stylesheet' type='text/css'/>
    <script defer src=""""),_display_(/*245.25*/routes/*245.31*/.Assets.at("js/jquery.flexslider.js")),format.raw/*245.68*/(""""></script>
    <script src=""""),_display_(/*246.19*/routes/*246.25*/.Assets.at("layui/layui.js")),format.raw/*246.53*/(""""></script>
    <script src=""""),_display_(/*247.19*/routes/*247.25*/.Assets.at("js/allResources.js")),format.raw/*247.57*/(""""></script>
<script type="text/javascript">
        $(window).load(function () """),format.raw/*249.36*/("""{"""),format.raw/*249.37*/("""
            """),format.raw/*250.13*/("""$('.flexslider').flexslider("""),format.raw/*250.41*/("""{"""),format.raw/*250.42*/("""
                """),format.raw/*251.17*/("""animation: "slide",
                start: function (slider) """),format.raw/*252.42*/("""{"""),format.raw/*252.43*/("""
                    """),format.raw/*253.21*/("""$('body').removeClass('loading');
                """),format.raw/*254.17*/("""}"""),format.raw/*254.18*/("""
            """),format.raw/*255.13*/("""}"""),format.raw/*255.14*/(""");
        """),format.raw/*256.9*/("""}"""),format.raw/*256.10*/(""");
</script>
    <!-- FlexSlider -->
</body>
</html>"""))
      }
    }
  }

  def render(batches:Seq[Batches]): play.twirl.api.HtmlFormat.Appendable = apply(batches)

  def f:((Seq[Batches]) => play.twirl.api.HtmlFormat.Appendable) = (batches) => apply(batches)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 30 16:27:54 CST 2017
                  SOURCE: /home/fan/sbtProject/MANAGER/app/views/common/AllProjcet.scala.html
                  HASH: 351e7a5ebfca8519fff4a08f31d30343c553a4e4
                  MATRIX: 747->1|865->24|893->26|946->54|968->68|1007->70|1047->83|1105->115|1119->121|1165->147|1249->205|1263->211|1315->243|1467->367|1496->368|1545->389|1635->451|1664->452|1725->485|1904->636|1933->637|2003->679|2032->680|2093->713|2270->862|2299->863|2348->884|2395->903|2424->904|2547->1000|2562->1006|2610->1033|2679->1075|2694->1081|2749->1115|2833->1172|2848->1178|2901->1210|2985->1267|3000->1273|3046->1298|3130->1355|3145->1361|3190->1385|3290->1458|3305->1464|3359->1497|3398->1506|3426->1507|3464->1519|3490->1524|3526->1533|4062->2042|4077->2048|4118->2068|4542->2465|4579->2486|4619->2488|4676->2517|4879->2693|4893->2698|4919->2703|4948->2704|5283->3012|5332->3045|5372->3047|5437->3084|5529->3149|5547->3158|5572->3162|5724->3287|5880->3422|6117->3628|6178->3661|6275->3727|6328->3752|8672->6068|8688->6074|8737->6100|9254->6589|9270->6595|9319->6621|9836->7110|9852->7116|9901->7142|10418->7631|10434->7637|10483->7663|11257->8409|11273->8415|11322->8441|11839->8930|11855->8936|11904->8962|12421->9451|12437->9457|12486->9483|13003->9972|13019->9978|13068->10004|13815->10723|13831->10729|13880->10755|14397->11244|14413->11250|14462->11276|14979->11765|14995->11771|15044->11797|15561->12286|15577->12292|15626->12318|16211->12876|16241->12884|16278->12893|16343->12930|16359->12936|16413->12968|16502->13029|16518->13035|16577->13072|16635->13102|16651->13108|16701->13136|16759->13166|16775->13172|16829->13204|16937->13283|16967->13284|17009->13297|17066->13325|17096->13326|17142->13343|17232->13404|17262->13405|17312->13426|17391->13476|17421->13477|17463->13490|17493->13491|17532->13502|17562->13503
                  LINES: 21->1|26->1|28->3|30->5|30->5|30->5|31->6|32->7|32->7|32->7|33->8|33->8|33->8|37->12|37->12|38->13|39->14|39->14|40->15|42->17|42->17|43->18|43->18|44->19|46->21|46->21|47->22|48->23|48->23|51->26|51->26|51->26|52->27|52->27|52->27|53->28|53->28|53->28|54->29|54->29|54->29|55->30|55->30|55->30|56->31|56->31|56->31|57->32|58->33|59->34|59->34|60->35|70->45|70->45|70->45|83->58|83->58|83->58|84->59|87->62|87->62|87->62|87->62|94->69|94->69|94->69|95->70|96->71|96->71|96->71|98->73|100->75|104->79|105->80|107->82|108->83|154->129|154->129|154->129|162->137|162->137|162->137|170->145|170->145|170->145|178->153|178->153|178->153|191->166|191->166|191->166|199->174|199->174|199->174|207->182|207->182|207->182|215->190|215->190|215->190|228->203|228->203|228->203|236->211|236->211|236->211|244->219|244->219|244->219|252->227|252->227|252->227|267->242|267->242|268->243|269->244|269->244|269->244|270->245|270->245|270->245|271->246|271->246|271->246|272->247|272->247|272->247|274->249|274->249|275->250|275->250|275->250|276->251|277->252|277->252|278->253|279->254|279->254|280->255|280->255|281->256|281->256
                  -- GENERATED --
              */
          