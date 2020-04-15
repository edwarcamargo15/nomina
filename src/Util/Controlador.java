package Util;





import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import Dao.ConceptoDao;
import Dao.EmpleadoDao;
import Dao.GenericDao;
import Entities.Concepto;
import Entities.Empleado;


public class Controlador {
	
	
		public void registrarEmpleado(String nombre,String codigo,String cedula, String fechanac, String fechaingreso, String Fechareti) throws ParseException {
		
			Empleado e= new Empleado();
			
			e.setNombre(nombre);
			e.setCodigo(codigo);
			e.setCedula(cedula);
			
			e.setFechanacimiento(crearFecha(fechanac));
			e.setFechaingreso(crearFecha(fechaingreso));
			e.setFecharetiro(crearFecha(Fechareti));
		
			EmpleadoDao eDao=new EmpleadoDao();
			eDao.insert(e);

		}
		
		private Date crearFecha(String fecha) throws ParseException{
	        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
	        Date date = formatter.parse(fecha);
	        return date;
	    }
	 
	
	     public Concepto buscarConcepto(String codConcepto) {
		
		GenericDao<Concepto> us= new ConceptoDao();
		Concepto u = us.find(codConcepto);
		return u;
		}

}
