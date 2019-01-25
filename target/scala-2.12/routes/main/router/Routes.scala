// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/naren/IdeaProjects/Play - Framework/jdbi-example-proyect/conf/routes
// @DATE:Fri Jan 25 10:45:18 COT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:9
  Assets_1: controllers.Assets,
  // @LINE:11
  TrackController_2: controllers.TrackController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:9
    Assets_1: controllers.Assets,
    // @LINE:11
    TrackController_2: controllers.TrackController
  ) = this(errorHandler, HomeController_0, Assets_1, TrackController_2, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, TrackController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tracks""", """controllers.TrackController.getTracks"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tracks/""" + "$" + """id<[^/]+>""", """controllers.TrackController.getTrack(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tracks""", """controllers.TrackController.addTrack"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tracks/""" + "$" + """id<[^/]+>""", """controllers.TrackController.updateTrack(id:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_TrackController_getTracks2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tracks")))
  )
  private[this] lazy val controllers_TrackController_getTracks2_invoker = createInvoker(
    TrackController_2.getTracks,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TrackController",
      "getTracks",
      Nil,
      "GET",
      this.prefix + """tracks""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_TrackController_getTrack3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tracks/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TrackController_getTrack3_invoker = createInvoker(
    TrackController_2.getTrack(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TrackController",
      "getTrack",
      Seq(classOf[String]),
      "GET",
      this.prefix + """tracks/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_TrackController_addTrack4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tracks")))
  )
  private[this] lazy val controllers_TrackController_addTrack4_invoker = createInvoker(
    TrackController_2.addTrack,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TrackController",
      "addTrack",
      Nil,
      "POST",
      this.prefix + """tracks""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_TrackController_updateTrack5_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tracks/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TrackController_updateTrack5_invoker = createInvoker(
    TrackController_2.updateTrack(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TrackController",
      "updateTrack",
      Seq(classOf[String]),
      "PUT",
      this.prefix + """tracks/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:11
    case controllers_TrackController_getTracks2_route(params@_) =>
      call { 
        controllers_TrackController_getTracks2_invoker.call(TrackController_2.getTracks)
      }
  
    // @LINE:13
    case controllers_TrackController_getTrack3_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_TrackController_getTrack3_invoker.call(TrackController_2.getTrack(id))
      }
  
    // @LINE:15
    case controllers_TrackController_addTrack4_route(params@_) =>
      call { 
        controllers_TrackController_addTrack4_invoker.call(TrackController_2.addTrack)
      }
  
    // @LINE:17
    case controllers_TrackController_updateTrack5_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_TrackController_updateTrack5_invoker.call(TrackController_2.updateTrack(id))
      }
  }
}
