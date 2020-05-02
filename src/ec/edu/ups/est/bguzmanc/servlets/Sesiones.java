package ec.edu.ups.est.bguzmanc.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ec.edu.ups.est.bguzmanc.dao.DAOGuia;
import ec.edu.ups.est.bguzmanc.dao.TelefonoDAO;
import ec.edu.ups.est.bguzmanc.dao.UsuarioDAO;
import ec.edu.ups.est.bguzmanc.modelo.Telefono;
import ec.edu.ups.est.bguzmanc.modelo.Usuario;

/**
 * Servlet implementation class Sesiones
 */
@WebServlet("/Sesiones")
public class Sesiones extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sesiones() {
        
    	super();
      
        //Solo crea una sola vez las tablas
    	//UsuarioDAO usuarioDAO = DAOGuia.getGuia().getUsuarioDAO();
		//usuarioDAO.createTable(); 
		//TelefonoDAO telefonoDAO = DAOGuia.getGuia().getTelefonoDAO();
		//telefonoDAO.createTable(); 
        // TODO Auto-generated constructor stub
		
		//Usuario u = new Usuario("0123456753", "Bryam", "Guzman", "bryamgmfn@gmail.com", "1234");
		
		//Usuario u1 = new Usuario("0102541487", "Wilson", "Guzman", "wilson@gmail.com", "12534");
		
		//Telefono tel = new Telefono(3, "0984966328", "Movil", "Movistar");
		//Telefono tel2 = new Telefono(4, "0968420404", "Movil", "Claro");
		
		//Set<Telefono> telefonos1 = new HashSet<Telefono>();
		//telefonos1.add(tel);
		//telefonos1.add(tel2);
		
		
		//u.setTelefonos(telefonos1);
		
		//usuarioDAO.create(u);
		//usuarioDAO.create(u1);
		
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html"); 
		
		PrintWriter out = response.getWriter(); 
		out.println("<html><head><title>Sesiones</title></head></html><body>");
		String user = request.getParameter("user");
		String pass = request.getParameter("password");
		if ("bryam".equals(user) && "1234".equals(pass)) {
			
			response.sendRedirect("index.html");
			HttpSession session = request.getSession(true);
			request.setAttribute("user", "Hola");

			session.setAttribute("accesos", 1); 

			//response.sendRedirect("Operaciones");
		}else {
			//out.println("<a href='index.html'><h1>Incorrecto, digite correctamente los datos</h1></a>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
