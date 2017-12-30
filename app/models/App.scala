package models

object App {
  val SOURCE_URL = "http://10.0.0.30:8888/"

  val TEST_URL: String = SOURCE_URL + "api/hero"

  val BATCH: String = SOURCE_URL + "jsu/project/selectAll"

  val SELECT_PROJECT_PAGE_BY_PATCH = SOURCE_URL + "jsu/project/selectProjectPageByBatch"
}
