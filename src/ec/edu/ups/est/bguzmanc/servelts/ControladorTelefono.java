package ec.edu.ups.est.bguzmanc.servelts;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.est.bguzmanc.dao.DAOGuia;
import ec.edu.ups.est.bguzmanc.dao.TelefonoDAO;
import ec.edu.ups.est.bguzmanc.dao.UsuarioDAO;
import ec.edu.ups.est.bguzmanc.modelo.Telefono;
import ec.edu.ups.est.bguzmanc.modelo.Usuario;

/**
 * Servlet implementation class Telefono
 */
@WebServlet("/ControladorTelefono")
public class ControladorTelefono extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControladorTelefono() {
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

		UsuarioDAO usuarioDAO = DAOGuia.getGuia().getUsuarioDAO();
		TelefonoDAO telefonoDAO = DAOGuia.getGuia().getTelefonoDAO();
		String telefono11 = "";
		String tipo = request.getParameter("tipo");
		String operadora = request.getParameter("operadoras");
		telefono11 = request.getParameter("telefono");
		String cc = request.getParameter("cc");
		String validacionTelefono = "";
		Usuario usuario = usuarioDAO.read(cc);
		boolean ban = true;
		if(telefono11 == "") {
			validacionTelefono += "Por favor ingresar datos!";
		}
		if(!telefonoDAO.validarNumero(telefono11)) {
			validacionTelefono += "Ingrese solo numeros";
			ban=false;
		}
		
		Set<Telefono> telefonos = telefonoDAO.findByUsuario(cc); 
		for (Telefono telefono : telefonos) {
			if(telefono11.equals(telefono.getNumero())) { 
				validacionTelefono += "Numero Existente";
				ban = false;
			}
		}

		if(validacionTelefono=="") {
			
			Telefono tel = new Telefono(telefono11, tipo, operadora);
			telefonoDAO.createTabla(tel, cc);
			usuario = usuarioDAO.read(cc);
			request.setAttribute("bien", "Se ha registrado exitosamente el Numero ");

			request.setAttribute("num", tel.getNumero());
		}
 
		
		request.setAttribute("usuario", usuario);

		request.setAttribute("validacionTelefono", validacionTelefono);

		request.getRequestDispatcher("ModificarInformacion.jsp").forward(request, response);

	}
}
