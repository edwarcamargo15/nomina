package Util;

import Dao.ConceptoDao;
import Dao.GenericDao;
import Entities.Concepto;


public class Controlador {
	
	
	     public Concepto buscarConcepto(String codConcepto) {
		
		GenericDao<Concepto> us= new ConceptoDao();
		Concepto u = us.find(codConcepto);
		return u;
		}

}
