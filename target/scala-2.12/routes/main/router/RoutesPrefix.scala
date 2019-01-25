// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/naren/IdeaProjects/Play - Framework/jdbi-example-proyect/conf/routes
// @DATE:Fri Jan 25 10:45:18 COT 2019


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
