package models

import play.api.libs.json.{Json, OFormat}

object Format {
  implicit val person = Json.format[Person]

  implicit val batchFormat = Json.format[Batch]

  implicit val batchesFormat = Json.format[Batches]
}
