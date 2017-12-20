
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

object nav extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<nav class="navbar navbar-default" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
            data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
                <!--<a class="navbar-brand" href="index.html">JSUCCW LIBRARY</a>-->
            <img src=""""),_display_(/*14.24*/routes/*14.30*/.Assets.at("images/logo.png")),format.raw/*14.59*/("""" alt="创新创业工作室" class="img-responsive"
            style="height: 50px;
                width: 250px;
                margin-top: 5px">
        </div>
            <!--/.navbar-header-->
        <div class="navbar-collapse collapse" id="bs-example-navbar-collapse-1" style="height: 1px;">
            <ul class="nav navbar-nav">
                <li class="dropdown set_btn user-card-box">
                    <a href="login.html"><i class="fa fa-user"></i><span>登录</span></a>
                        <!--<a id="header-avator" class="user-card-item js-header-avator">
                        <img width="40" height="40" src="images/head.jpg">
                    </a>-->
                    <ul class="dropdown-menu nav-head">
                        <li><a href="userinfo.html">个人中心</a></li>
                        <li><a href="user.html">个人主页</a></li>
                        <li><a href="#">退出登录</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i
                    class="fa fa-list"></i><span>点赞榜</span></a>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i
                    class="fa fa-globe"></i><span>活动</span></a>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i
                    class="fa fa-search"></i><span>搜索</span></a>
                    <ul class="dropdown-menu search-form">
                        <form>
                            <input type="text" class="search-text" name="s" placeholder="Search...">
                            <button type="submit" class="search-submit"><i class="fa fa-search"></i></button>
                        </form>
                    </ul>
                </li>
            </ul>
        </div>
        <div class="clearfix"></div>
    </div>
        <!--/.navbar-collapse-->
</nav>
<nav class="navbar nav_bottom" role="navigation">
    <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header nav_2">
            <button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse"
            data-target="#bs-megadropdown-tabs">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#"></a>
        </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
            <ul class="nav navbar-nav nav_1">
                <li><a href="index.html">首页</a></li>
                <li><a href="allProject.html">项目管理</a></li>
                <li><a href="#">ACM管理</a></li>
                <li><a href="#">读书管理</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">培训计划<span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="#">大一</a></li>
                        <li><a href="#">大二</a></li>
                        <li><a href="#">大三</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">学习计划<span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="#">大一</a></li>
                        <li><a href="#">大二</a></li>
                        <li><a href="#">大三</a></li>
                    </ul>
                </li>
                <li><a href="#">日常考勤</a></li>
                <li><a href="#">任务管理</a></li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div>
</nav>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 19 20:59:12 CST 2017
                  SOURCE: /home/fan/sbtProject/MANAGER/app/views/nav.scala.html
                  HASH: 968660db8c61a60352d3629ecdfb87446e4b2fcc
                  MATRIX: 720->1|816->3|844->5|1468->602|1483->608|1533->637
                  LINES: 21->1|26->1|28->3|39->14|39->14|39->14
                  -- GENERATED --
              */
          