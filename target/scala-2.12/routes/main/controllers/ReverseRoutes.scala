
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/fan/sbtProject/MANAGER/conf/routes
// @DATE:Sat Dec 30 14:23:35 CST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:5
package controllers {

  // @LINE:16
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:13
  class ReverseApi(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def SelectProjectPageByBatch(bid:String, page:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "selectProjectPageByBatch" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("bid", bid)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("page", page)))))
    }
  
  }

  // @LINE:5
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def allProject(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "allproject")
    }
  
    // @LINE:9
    def projectInfo(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "projectinfo")
    }
  
    // @LINE:5
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:7
    def project(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project")
    }
  
  }


}
