package ec.edu.ups.est.bguzmanc.servelts;

import java.io.IOException;
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
 * Servlet implementation class LlenarTabla
 */
@WebServlet("/LlenarTabla")
public class LlenarTabla extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LlenarTabla() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("opcion");
		String parametro = request.getParameter("parametro");
		UsuarioDAO usuarioDAO = null;
		Usuario usuario = null;
		if(name.equals("parametro")) {	
			usuarioDAO = DAOGuia.getGuia().getUsuarioDAO();
			usuario = usuarioDAO.read(parametro);
			request.setAttribute("usuario", usuario);
			if(usuario.getTelefonos().size() == 0) {
				String error = "Cedula incorrecta";

				request.setAttribute("error", error);
			}

		}else if(name.equals("correo")){
			usuarioDAO = DAOGuia.getGuia().getUsuarioDAO();
			usuario = usuarioDAO.readByAddress(parametro);
			request.setAttribute("usuario", usuario);
			
			if(usuario.getTelefonos().size() == 0) {
				String error = "Correo invalido";

				request.setAttribute("error", error);
			}

		}

		request.getRequestDispatcher("PerfilUser.jsp").forward(request, response);
	}

}
