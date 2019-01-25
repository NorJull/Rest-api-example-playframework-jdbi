// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/naren/IdeaProjects/Play - Framework/jdbi-example-proyect/conf/routes
// @DATE:Fri Jan 25 10:45:18 COT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:9
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:11
  class ReverseTrackController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def getTrack(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tracks/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:11
    def getTracks(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tracks")
    }
  
    // @LINE:17
    def updateTrack(id:String): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "tracks/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:15
    def addTrack(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tracks")
    }
  
  }


}
