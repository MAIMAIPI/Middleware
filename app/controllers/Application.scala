package controllers

import javax.inject._

import models.App._
import models.Format._
import models._
import play.api.data.Form
import play.api.data.Forms.{tuple, _}
import play.api.libs.json.Json
import play.api.libs.ws.WSClient
import play.api.mvc._

import scala.concurrent.{ExecutionContext, Future}


@Singleton
class Application @Inject()(cc: MessagesControllerComponents, ws: WSClient)
                           (implicit ec: ExecutionContext) extends MessagesAbstractController(cc) {

  def index: Action[AnyContent] = Action.async { implicit request =>
    Future.successful(Ok(views.html.index()))
  }

  def project: Action[AnyContent] = Action.async { implicit request =>
    Future.successful(Ok(views.html.common.PersonProject()))
  }

  def projectInfo: Action[AnyContent] = Action.async { implicit request =>
    Future.successful(Ok(views.html.common.ProjectInfo()))
  }

  def allProject: Action[AnyContent] = Action.async { implicit request =>
    ws.url(BATCH).get.map(_.json.as[Seq[Batches]]).map(data => Ok(views.html.common.AllProjcet(data)))
  }

  def personalProject = Action.async { implicit request =>
    Future.successful(Ok(views.html.common.PersonProject()))
  }

  def userInfo = Action.async { implicit request =>
    Future.successful(Ok(views.html.common.userinfo()))
  }

  def register = Action.async { implicit request =>
    Future.successful(Ok(views.html.common.register()))
  }

  def doRegister() = Action.async { implicit request =>
    Form(tuple("name" -> nonEmptyText, "id" -> nonEmptyText, "tel" -> nonEmptyText, "password" -> nonEmptyText, "repassword" -> nonEmptyText)).bindFromRequest.fold(
      _ => Future.successful(Ok(Json.obj("ok" -> 0, "cause" -> "输入项不能为空"))),
      tuple => {
        val (name, id, tel, password, repassword) = tuple
        if (password.equals(repassword)) {
          ws.url(HAS_EXISTS).addQueryStringParameters("username" -> id).get.map(_.json.\("status").as[Boolean]).flatMap {
            case true => Future.successful(Ok(Json.obj("ok" -> 0, "cause" -> "该学号已经注册过了")))
            case false => ws.url(REGISTER).addQueryStringParameters("realname" -> name, "username" -> id, "phone" -> tel, "password" -> password).post("").map(_.json.\("status").as[Boolean]).map {
              case true => Ok(Json.obj("ok" -> 1))
              case false => Ok(Json.obj("ok" -> 0, "cause" -> "学号格式不正确"))
            }
          }
        } else {
          Future.successful(Ok(Json.obj("ok" -> 0, "cause" -> "两次输入密码不一致")))
        }
      }
    )
  }

  def login = Action.async { implicit request =>
    Future.successful(Ok(views.html.common.login()))
  }

  def doLogin() = Action.async { implicit request =>
    Form(tuple("id" -> nonEmptyText, "password" -> nonEmptyText)).bindFromRequest.fold(
      _ => Future.successful(Ok(Json.obj("ok" -> 0, "cause" -> "输入项不能为空"))),
      tuple => {
        val (id, password) = tuple
        ws.url(LOGIN).addQueryStringParameters("username" -> id, "password" -> password).post("").map(_.json.\("status").as[Boolean]).map {
          case true => Ok(Json.obj("ok" -> 1)).withSession("user" -> id)
          case false => Ok(Json.obj("ok" -> 0, "cause" -> "账号或密码错误"))
        }
      }
    )
  }

  def exit = Action.async { implicit request =>
    Future.successful(Redirect(routes.Application.index()).withNewSession)
  }

  def user = Action.async { implicit request =>
    Future.successful(Ok(views.html.common.user()))
  }

}
