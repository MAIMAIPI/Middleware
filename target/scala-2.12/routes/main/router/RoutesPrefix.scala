
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/fan/sbtProject/MANAGER/conf/routes
// @DATE:Tue Dec 19 21:30:04 CST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}