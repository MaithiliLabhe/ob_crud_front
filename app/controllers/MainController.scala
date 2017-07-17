package controllers

import javax.inject.Inject

import models.User
import play.api.data.Form
import play.api.data.Forms._
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api.libs.json.{JsArray, Json}
import play.api.mvc.{Controller, _}

import scala.concurrent.Future
import javax.inject.Inject
import scala.concurrent.Future
import scala.concurrent.duration._

import play.api.mvc._
import play.api.libs.ws._
import play.api.http.HttpEntity

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import akka.stream.scaladsl._
import akka.util.ByteString
import play.api.libs.json._
import play.api.libs.functional.syntax._
import scala.concurrent.ExecutionContext

class MainController @Inject() (ws: WSClient) extends Controller {

  def index = Action {
    Ok(views.html.index())
  }

  val personForm: Form[User] = Form {
    mapping(
      "name" -> text,
      "email" -> text
    )(User.apply)(User.unapply)
  }

  def addUser = Action { implicit request =>
    val user = personForm.bindFromRequest.get
    val futureResponse: Future[WSResponse] = ws.url("http://localhost:9000/addUser").post(Json.toJson(user))
    Redirect(routes.MainController.index())
  }

  def getUserByName = Action.async { implicit request =>
    val name = request.body.asFormUrlEncoded.get("searchString").mkString("")
    ws.url(s"http://localhost:9000/getUserByName/$name").get() map {
      response => Ok(response.body)
    }
  }

  def getUsers = Action.async{
    ws.url(s"http://localhost:9000/getAllUsers").get() map {
      response => Ok(response.body)
    }
  }

  def deleteUser(name: String) = Action.async { implicit request =>
    ws.url(s"http://localhost:9000/deleteUser/$name").delete() map {
      response =>
        Redirect(routes.MainController.index())
    }
  }
}
