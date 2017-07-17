
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/maithili/Desktop/final-ob/ms-frontend/conf/app.routes
// @DATE:Tue May 10 19:50:58 BST 2016

package app

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  MainController_0: controllers.MainController,
  // @LINE:10
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    MainController_0: controllers.MainController,
    // @LINE:10
    Assets_1: controllers.Assets
  ) = this(errorHandler, MainController_0, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    app.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, MainController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.MainController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.MainController.getUsers"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.MainController.addUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchUser""", """controllers.MainController.getUserByName"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteUser/""" + "$" + """name<[^/]+>""", """controllers.MainController.deleteUser(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_MainController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_MainController_index0_invoker = createInvoker(
    MainController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "app",
      "controllers.MainController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:2
  private[this] lazy val controllers_MainController_getUsers1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_MainController_getUsers1_invoker = createInvoker(
    MainController_0.getUsers,
    HandlerDef(this.getClass.getClassLoader,
      "app",
      "controllers.MainController",
      "getUsers",
      Nil,
      "GET",
      """""",
      this.prefix + """users"""
    )
  )

  // @LINE:4
  private[this] lazy val controllers_MainController_addUser2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_MainController_addUser2_invoker = createInvoker(
    MainController_0.addUser,
    HandlerDef(this.getClass.getClassLoader,
      "app",
      "controllers.MainController",
      "addUser",
      Nil,
      "POST",
      """""",
      this.prefix + """users"""
    )
  )

  // @LINE:5
  private[this] lazy val controllers_MainController_getUserByName3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchUser")))
  )
  private[this] lazy val controllers_MainController_getUserByName3_invoker = createInvoker(
    MainController_0.getUserByName,
    HandlerDef(this.getClass.getClassLoader,
      "app",
      "controllers.MainController",
      "getUserByName",
      Nil,
      "POST",
      """""",
      this.prefix + """searchUser"""
    )
  )

  // @LINE:6
  private[this] lazy val controllers_MainController_deleteUser4_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteUser/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MainController_deleteUser4_invoker = createInvoker(
    MainController_0.deleteUser(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "app",
      "controllers.MainController",
      "deleteUser",
      Seq(classOf[String]),
      "DELETE",
      """""",
      this.prefix + """deleteUser/""" + "$" + """name<[^/]+>"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Assets_versioned5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "app",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_MainController_index0_route(params) =>
      call { 
        controllers_MainController_index0_invoker.call(MainController_0.index)
      }
  
    // @LINE:2
    case controllers_MainController_getUsers1_route(params) =>
      call { 
        controllers_MainController_getUsers1_invoker.call(MainController_0.getUsers)
      }
  
    // @LINE:4
    case controllers_MainController_addUser2_route(params) =>
      call { 
        controllers_MainController_addUser2_invoker.call(MainController_0.addUser)
      }
  
    // @LINE:5
    case controllers_MainController_getUserByName3_route(params) =>
      call { 
        controllers_MainController_getUserByName3_invoker.call(MainController_0.getUserByName)
      }
  
    // @LINE:6
    case controllers_MainController_deleteUser4_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_MainController_deleteUser4_invoker.call(MainController_0.deleteUser(name))
      }
  
    // @LINE:10
    case controllers_Assets_versioned5_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
