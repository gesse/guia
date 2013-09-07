package controllers;

import models.Categoria;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class CategoriaController extends Controller {
	
	static Form<Categoria> categoriaForm = Form.form(Categoria.class);
	  
    public static Result index() {
    	
    	return redirect(routes.CategoriaController.categorias());

    }
    
    public static Result categorias(){
    	return ok(
    		views.html.categoria.render(Categoria.all(), categoriaForm )
    	);
    }
    
    public static Result novaCategoria(){
    	Form<Categoria> filledForm = categoriaForm.bindFromRequest();
    	if(filledForm.hasErrors()){
    		return badRequest(views.html.index.render(Categoria.all(), categoriaForm));
    	}else{
    		Categoria.create(filledForm.get());
    		return redirect(routes.CategoriaController.categorias());
    	}
    }
    
    public static Result deleteCategoria(Long id){
    	Categoria.delete(id);
    	return redirect(routes.CategoriaController.categorias());
    }


}
