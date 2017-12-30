package controllers

import javax.inject.{Inject, Singleton}

import models.App._
import play.api.libs.ws.WSClient
import play.api.mvc.{MessagesAbstractController, MessagesControllerComponents}

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class Api @Inject()(cc: MessagesControllerComponents, ws: WSClient)
                   (implicit ec: ExecutionContext) extends MessagesAbstractController(cc) {

  def SelectProjectPageByBatch(bid: String, page: String) = Action.async { implicit request =>
    ws.url(SELECT_PROJECT_PAGE_BY_PATCH).addQueryStringParameters("bid" -> bid, "page" -> page).get().map(data => Ok(data.json))
  }
}
