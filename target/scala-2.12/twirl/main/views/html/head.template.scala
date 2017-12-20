
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

object head extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(otherHead: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*3.1*/("""<head>
    <title>"""),_display_(/*4.13*/title),format.raw/*4.18*/("""</title>
    <link rel="shortcut icon" href=""""),_display_(/*5.38*/routes/*5.44*/.Assets.at("images/logo.ico")),format.raw/*5.73*/(""""/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <script type="application/x-javascript"> addEventListener("load", function () """),format.raw/*7.83*/("""{"""),format.raw/*7.84*/("""
        """),format.raw/*8.9*/("""setTimeout(hideURLbar, 0);
    """),format.raw/*9.5*/("""}"""),format.raw/*9.6*/(""", false);

    function hideURLbar() """),format.raw/*11.27*/("""{"""),format.raw/*11.28*/("""
        """),format.raw/*12.9*/("""window.scrollTo(0, 1);
    """),format.raw/*13.5*/("""}"""),format.raw/*13.6*/(""" """),format.raw/*13.7*/("""</script>
    <link href=""""),_display_(/*14.18*/routes/*14.24*/.Assets.at("css/bootstrap-3.1.1.min.css")),format.raw/*14.65*/("""" rel='stylesheet' type='text/css'/>
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src=""""),_display_(/*16.19*/routes/*16.25*/.Assets.at("js/jquery.min.js")),format.raw/*16.55*/(""""></script>
    <script src=""""),_display_(/*17.19*/routes/*17.25*/.Assets.at("js/bootstrap.min.js")),format.raw/*17.58*/(""""></script>
        <!-- Custom Theme files -->
    <link href=""""),_display_(/*19.18*/routes/*19.24*/.Assets.at("css/style.css")),format.raw/*19.51*/("""" rel='stylesheet' type='text/css'/>
    <link rel="stylesheet" href=""""),_display_(/*20.35*/routes/*20.41*/.Assets.at("css/jquery.countdown.css")),format.raw/*20.79*/(""""/>
    <link href='https://fonts.googleapis.com/css?family=PT+Sans+Narrow:400,700' rel='stylesheet' type='text/css'>
        <!----font-Awesome----->
    <link rel="stylesheet" href=""""),_display_(/*23.35*/routes/*23.41*/.Assets.at("css/font-awesome.css")),format.raw/*23.75*/("""">

    """),_display_(/*25.6*/otherHead),format.raw/*25.15*/("""
"""),format.raw/*26.1*/("""</head>"""))
      }
    }
  }

  def render(title:String,otherHead:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(otherHead)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (otherHead) => apply(title)(otherHead)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 19 20:59:12 CST 2017
                  SOURCE: /home/fan/sbtProject/MANAGER/app/views/head.scala.html
                  HASH: bf1b4129eccb94d2f30e45dadf40e5d8cef064f2
                  MATRIX: 733->1|860->33|888->35|933->54|958->59|1030->105|1044->111|1093->140|1279->299|1307->300|1342->309|1399->340|1426->341|1491->378|1520->379|1556->388|1610->415|1638->416|1666->417|1720->444|1735->450|1797->491|1950->617|1965->623|2016->653|2073->683|2088->689|2142->722|2234->787|2249->793|2297->820|2395->891|2410->897|2469->935|2681->1120|2696->1126|2751->1160|2786->1169|2816->1178|2844->1179
                  LINES: 21->1|26->1|28->3|29->4|29->4|30->5|30->5|30->5|32->7|32->7|33->8|34->9|34->9|36->11|36->11|37->12|38->13|38->13|38->13|39->14|39->14|39->14|41->16|41->16|41->16|42->17|42->17|42->17|44->19|44->19|44->19|45->20|45->20|45->20|48->23|48->23|48->23|50->25|50->25|51->26
                  -- GENERATED --
              */
          