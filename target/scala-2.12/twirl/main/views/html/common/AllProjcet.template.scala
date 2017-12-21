
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
                            """),_display_(/*57.30*/for(batch <- batches) yield /*57.51*/ {_display_(Seq[Any](format.raw/*57.53*/("""
                                """),format.raw/*58.33*/("""<li class="account1">
                                    <a id="west1" class="actived">
                                        <i class="fa fa-tasks"></i>
                                        <span>"""),_display_(/*61.48*/batch/*61.53*/.year),format.raw/*61.58*/(""" """),format.raw/*61.59*/("""年</span>
                                        <i class="fa fa-angle-down"></i>
                                    </a>
                                </li>

                                <div class="submenu1" style="display: none; ">
                                    <ul class="root">
                                    """),_display_(/*68.38*/for(batchItem <- batch.batchList) yield /*68.71*/ {_display_(Seq[Any](format.raw/*68.73*/("""
                                        """),format.raw/*69.41*/("""<li>
                                            <a id="batch """),_display_(/*70.59*/batchItem/*70.68*/.bid),format.raw/*70.72*/("""" class="actived">
                                                <i class="fa fa-leaf"></i>
                                                <span>"""),_display_(/*72.56*/{
                                                    batchItem.level + batchItem.name + "学期"
                                                }),format.raw/*74.50*/("""</span>
                                                <i class="fa fa-angle-right"></i>
                                            </a>
                                        </li>
                                    """)))}),format.raw/*78.38*/("""
                                    """),format.raw/*79.37*/("""</ul>
                                </div>
                            """)))}),format.raw/*81.30*/("""
                        """),format.raw/*82.25*/("""</ul>
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
                                    <div class="name_col"><a href=""""),_display_(/*127.69*/routes/*127.75*/.Application.projectInfo()),format.raw/*127.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a>
                                    </div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*135.69*/routes/*135.75*/.Application.projectInfo()),format.raw/*135.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a>
                                    </div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*143.69*/routes/*143.75*/.Application.projectInfo()),format.raw/*143.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a>
                                    </div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*151.69*/routes/*151.75*/.Application.projectInfo()),format.raw/*151.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a>
                                    </div>
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
                                    <div class="name_col"><a href=""""),_display_(/*167.69*/routes/*167.75*/.Application.projectInfo()),format.raw/*167.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a>
                                    </div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*175.69*/routes/*175.75*/.Application.projectInfo()),format.raw/*175.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a>
                                    </div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*183.69*/routes/*183.75*/.Application.projectInfo()),format.raw/*183.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a>
                                    </div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*191.69*/routes/*191.75*/.Application.projectInfo()),format.raw/*191.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a>
                                    </div>
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
                                    <div class="name_col"><a href=""""),_display_(/*207.69*/routes/*207.75*/.Application.projectInfo()),format.raw/*207.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a>
                                    </div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*215.69*/routes/*215.75*/.Application.projectInfo()),format.raw/*215.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a>
                                    </div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*223.69*/routes/*223.75*/.Application.projectInfo()),format.raw/*223.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a>
                                    </div>
                                    <div class="member_col">灿&nbsp;烈</div>
                                    <div class="grade_col">9.9</div>
                                </li>
                                <li class="clearfix">
                                    <div class="id_col">001</div>
                                    <div class="name_col"><a href=""""),_display_(/*231.69*/routes/*231.75*/.Application.projectInfo()),format.raw/*231.101*/("""">
                                        Super&nbsp;图书馆管理系统（结合现代流行元素）</a>
                                    </div>
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
    """),_display_(/*249.6*/footer()),format.raw/*249.14*/("""
        """),format.raw/*250.9*/("""<!-- FlexSlider -->
    <link href=""""),_display_(/*251.18*/routes/*251.24*/.Assets.at("css/flexslider.css")),format.raw/*251.56*/("""" rel='stylesheet' type='text/css'/>
    <script defer src=""""),_display_(/*252.25*/routes/*252.31*/.Assets.at("js/jquery.flexslider.js")),format.raw/*252.68*/(""""></script>
    <script src=""""),_display_(/*253.19*/routes/*253.25*/.Assets.at("js/allResources.js")),format.raw/*253.57*/(""""></script>
<script type="text/javascript">
        $(function () """),format.raw/*255.23*/("""{"""),format.raw/*255.24*/("""
            """),format.raw/*256.13*/("""SyntaxHighlighter.all();
        """),format.raw/*257.9*/("""}"""),format.raw/*257.10*/(""");
        $(window).load(function () """),format.raw/*258.36*/("""{"""),format.raw/*258.37*/("""
            """),format.raw/*259.13*/("""$('.flexslider').flexslider("""),format.raw/*259.41*/("""{"""),format.raw/*259.42*/("""
                """),format.raw/*260.17*/("""animation: "slide",
                start: function (slider) """),format.raw/*261.42*/("""{"""),format.raw/*261.43*/("""
                    """),format.raw/*262.21*/("""$('body').removeClass('loading');
                """),format.raw/*263.17*/("""}"""),format.raw/*263.18*/("""
            """),format.raw/*264.13*/("""}"""),format.raw/*264.14*/(""");
        """),format.raw/*265.9*/("""}"""),format.raw/*265.10*/(""");
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
                  DATE: Thu Dec 21 21:38:05 CST 2017
                  SOURCE: /home/fan/sbtProject/MANAGER/app/views/common/AllProjcet.scala.html
                  HASH: a8b444a192af9e8ace141aecc9970958a31ce59d
                  MATRIX: 747->1|865->24|893->26|946->54|968->68|1007->70|1047->83|1105->115|1119->121|1165->147|1249->205|1263->211|1315->243|1467->367|1496->368|1545->389|1635->451|1664->452|1725->485|1904->636|1933->637|2003->679|2032->680|2093->713|2270->862|2299->863|2348->884|2395->903|2424->904|2547->1000|2562->1006|2610->1033|2679->1075|2694->1081|2749->1115|2833->1172|2848->1178|2901->1210|2985->1267|3000->1273|3046->1298|3130->1355|3145->1361|3190->1385|3260->1425|3288->1426|3326->1438|3352->1443|3388->1452|3924->1961|3939->1967|3980->1987|4408->2388|4445->2409|4485->2411|4546->2444|4777->2648|4791->2653|4817->2658|4846->2659|5205->2991|5254->3024|5294->3026|5363->3067|5453->3130|5471->3139|5496->3143|5672->3292|5836->3435|6089->3657|6154->3694|6259->3768|6312->3793|8655->6108|8671->6114|8720->6140|9237->6629|9253->6635|9302->6661|9819->7150|9835->7156|9884->7182|10401->7671|10417->7677|10466->7703|11398->8607|11414->8613|11463->8639|11980->9128|11996->9134|12045->9160|12562->9649|12578->9655|12627->9681|13144->10170|13160->10176|13209->10202|14141->11106|14157->11112|14206->11138|14723->11627|14739->11633|14788->11659|15305->12148|15321->12154|15370->12180|15887->12669|15903->12675|15952->12701|16722->13444|16752->13452|16789->13461|16854->13498|16870->13504|16924->13536|17013->13597|17029->13603|17088->13640|17146->13670|17162->13676|17216->13708|17311->13774|17341->13775|17383->13788|17444->13821|17474->13822|17541->13860|17571->13861|17613->13874|17670->13902|17700->13903|17746->13920|17836->13981|17866->13982|17916->14003|17995->14053|18025->14054|18067->14067|18097->14068|18136->14079|18166->14080
                  LINES: 21->1|26->1|28->3|30->5|30->5|30->5|31->6|32->7|32->7|32->7|33->8|33->8|33->8|37->12|37->12|38->13|39->14|39->14|40->15|42->17|42->17|43->18|43->18|44->19|46->21|46->21|47->22|48->23|48->23|51->26|51->26|51->26|52->27|52->27|52->27|53->28|53->28|53->28|54->29|54->29|54->29|55->30|55->30|55->30|56->31|57->32|58->33|58->33|59->34|69->44|69->44|69->44|82->57|82->57|82->57|83->58|86->61|86->61|86->61|86->61|93->68|93->68|93->68|94->69|95->70|95->70|95->70|97->72|99->74|103->78|104->79|106->81|107->82|152->127|152->127|152->127|160->135|160->135|160->135|168->143|168->143|168->143|176->151|176->151|176->151|192->167|192->167|192->167|200->175|200->175|200->175|208->183|208->183|208->183|216->191|216->191|216->191|232->207|232->207|232->207|240->215|240->215|240->215|248->223|248->223|248->223|256->231|256->231|256->231|274->249|274->249|275->250|276->251|276->251|276->251|277->252|277->252|277->252|278->253|278->253|278->253|280->255|280->255|281->256|282->257|282->257|283->258|283->258|284->259|284->259|284->259|285->260|286->261|286->261|287->262|288->263|288->263|289->264|289->264|290->265|290->265
                  -- GENERATED --
              */
          