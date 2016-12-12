
package models;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import play.data.format.Formats;
import play.data.validation.Constraints;
import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Find;
@Entity
public class Pedidos extends Model{
	private static final long serialVersionUID = 1L;
	@Id
    public Long id;
    
    @Constraints.Required
    public String nombre;
    
    @Constraints.Required
    public String orden;
    
    @Constraints.Required
    public String preferencia;
    
    @Constraints.Required
    public String precio;
    public static Find<Long,Pedidos> find = new Find<Long,Pedidos>(){};
  		public static List<Pedidos> listadoPedidos() {
  			// TODO Auto-generated method stub
  			return find.all();
  		}
    
	
}