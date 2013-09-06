package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {
  
    public static Result index() {
        return ok(index.render("Your new application is ready."));
        //Isso é um teste de commit remoto
        //Mais uma mudança
    }
  
}
