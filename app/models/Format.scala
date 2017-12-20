package models

import play.api.libs.json.{Json, OFormat}

object Format {
  implicit val person: OFormat[Person] = Json.format[Person]
}
