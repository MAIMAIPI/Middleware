
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/fan/sbtProject/MANAGER/conf/routes
// @DATE:Tue Dec 19 21:30:04 CST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:5
package controllers {

  // @LINE:14
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
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
