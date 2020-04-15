package Controller;

import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Util.Controlador;

/**
 * Servlet implementation class RegistrarEmpleado
 */
@WebServlet("/RegistrarEmpleado")
public class RegistrarEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarEmpleado() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String nombre= request.getParameter("nombre");
		String codigo= request.getParameter("codigo");
		String cedula= request.getParameter("cedula");
		String fn= request.getParameter("fechaNac");
		String fi= request.getParameter("fechaIngreso");
		String fr= request.getParameter("fechaRetiro");
		
		Controlador c = new Controlador();
		
	    try {
			c.registrarEmpleado(nombre,codigo,cedula,fn,fi,fr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(nombre);
		System.out.println(codigo);
		System.out.println(cedula);
		System.out.println(fn);
		System.out.println(fi);
		System.out.println(fr);
		
	
		  //  c.registrarEmpleado(name,cod,ced,date,da,dat);
		
		    
		   // response.sendRedirect("views/index.jsp");
		 
		
		
	}

}
