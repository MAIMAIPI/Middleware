
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/fan/sbtProject/MANAGER/conf/routes
// @DATE:Sat Dec 30 14:23:35 CST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  Application_1: controllers.Application,
  // @LINE:13
  Api_2: controllers.Api,
  // @LINE:16
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    Application_1: controllers.Application,
    // @LINE:13
    Api_2: controllers.Api,
    // @LINE:16
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, Api_2, Assets_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Api_2, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project""", """controllers.Application.project"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projectinfo""", """controllers.Application.projectInfo"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """allproject""", """controllers.Application.allProject"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """selectProjectPageByBatch""", """controllers.Api.SelectProjectPageByBatch(bid:String, page:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_project1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project")))
  )
  private[this] lazy val controllers_Application_project1_invoker = createInvoker(
    Application_1.project,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "project",
      Nil,
      "GET",
      this.prefix + """project""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_projectInfo2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projectinfo")))
  )
  private[this] lazy val controllers_Application_projectInfo2_invoker = createInvoker(
    Application_1.projectInfo,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "projectInfo",
      Nil,
      "GET",
      this.prefix + """projectinfo""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_allProject3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("allproject")))
  )
  private[this] lazy val controllers_Application_allProject3_invoker = createInvoker(
    Application_1.allProject,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "allProject",
      Nil,
      "GET",
      this.prefix + """allproject""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Api_SelectProjectPageByBatch4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("selectProjectPageByBatch")))
  )
  private[this] lazy val controllers_Api_SelectProjectPageByBatch4_invoker = createInvoker(
    Api_2.SelectProjectPageByBatch(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Api",
      "SelectProjectPageByBatch",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """selectProjectPageByBatch""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Assets_at5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at5_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_Application_index0_route(params@_) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index)
      }
  
    // @LINE:7
    case controllers_Application_project1_route(params@_) =>
      call { 
        controllers_Application_project1_invoker.call(Application_1.project)
      }
  
    // @LINE:9
    case controllers_Application_projectInfo2_route(params@_) =>
      call { 
        controllers_Application_projectInfo2_invoker.call(Application_1.projectInfo)
      }
  
    // @LINE:11
    case controllers_Application_allProject3_route(params@_) =>
      call { 
        controllers_Application_allProject3_invoker.call(Application_1.allProject)
      }
  
    // @LINE:13
    case controllers_Api_SelectProjectPageByBatch4_route(params@_) =>
      call(params.fromQuery[String]("bid", None), params.fromQuery[String]("page", None)) { (bid, page) =>
        controllers_Api_SelectProjectPageByBatch4_invoker.call(Api_2.SelectProjectPageByBatch(bid, page))
      }
  
    // @LINE:16
    case controllers_Assets_at5_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at5_invoker.call(Assets_0.at(path, file))
      }
  }
}
