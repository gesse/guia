package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.context.annotation.Lazy;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Categoria extends Model{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static List<Categoria> lista;
	
	@Id
	public Long id;
	
	@Required
	public String descricao;
	
	public static Finder<Long, Categoria> find = new Finder<Long, Categoria>(Long.class, Categoria.class);
	
	public static List<Categoria> all(){
		
		return find.all();
	}
	
	public static void create(Categoria categoria){
		categoria.save();
	}
	
	public static void delete(Long id){
		find.ref(id).delete();
	}

}
