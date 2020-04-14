package Dao;

import Entities.Concepto;
import Util.Conexion;



public class ConceptoDao extends Conexion<Concepto> implements GenericDao<Concepto>{
	
	
	public ConceptoDao() {
		super(Concepto.class);
	}


	
	
	
}