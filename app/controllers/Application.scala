package controllers

import javax.inject._

import play.api.mvc._
import models.Format._
import models._
import play.api.libs.ws.WSClient
import App._

import scala.concurrent.{ExecutionContext, Future}


@Singleton
class Application @Inject()(cc: MessagesControllerComponents, ws: WSClient)
                           (implicit ec: ExecutionContext) extends MessagesAbstractController(cc) {

  def index: Action[AnyContent] = Action.async {
    Future.successful(Ok(views.html.index()))
  }

  def project: Action[AnyContent] = Action.async {
    Future.successful(Ok(views.html.common.PersonProject()))
  }

  def projectInfo: Action[AnyContent] = Action.async {
    Future.successful(Ok(views.html.common.ProjectInfo()))
  }

  def allProject: Action[AnyContent] = Action.async {
    ws.url(BATCH).get.map(_.json.as[Seq[Batches]]).map(data => Ok(views.html.common.AllProjcet(data)))
  }

}
