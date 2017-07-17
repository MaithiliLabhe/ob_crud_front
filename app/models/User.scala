package models

case class User(name: String, email: String)

object User {

  import play.api.libs.json.Json
  import play.api.libs.json.Json
  import play.api.data._
  import play.api.data.Forms._

  implicit val personFormat = Json.format[User]
}
