// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/naren/IdeaProjects/Play - Framework/jdbi-example-proyect/conf/routes
// @DATE:Fri Jan 25 10:45:18 COT 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseTrackController TrackController = new controllers.ReverseTrackController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseTrackController TrackController = new controllers.javascript.ReverseTrackController(RoutesPrefix.byNamePrefix());
  }

}
