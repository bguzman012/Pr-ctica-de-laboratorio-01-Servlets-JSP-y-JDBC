package ec.edu.ups.est.bguzmanc.servelts;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;
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

		
    	UsuarioDAO usuarioDAO = DAOGuia.getGuia().getUsuarioDAO();
		usuarioDAO.createTable(); 
		TelefonoDAO telefonoDAO = DAOGuia.getGuia().getTelefonoDAO();
		telefonoDAO.createTable(); 
        // TODO Auto-generated constructor stub

		Usuario u = new Usuario("0123456753", "Bryam", "Guzman", "bryamgmfn@gmail.com", "Magaly00");

		Usuario u1 = new Usuario("0102541487", "Wilson", "Guzman", "wilson@gmail.com", "LIGAdequito00");

		Telefono tel = new Telefono("0984966328", "Movil", "Movistar");
		Telefono tel2 = new Telefono("0968420404", "Movil", "Claro");
		Telefono tel3 = new Telefono("0987654321", "Movil", "Claro");

		Set<Telefono> telefonos1 = new HashSet<Telefono>();
		telefonos1.add(tel);
		telefonos1.add(tel2);
		telefonos1.add(tel3);

		u.setTelefonos(telefonos1);

		usuarioDAO.create(u);
		usuarioDAO.create(u1);
		// TODO Auto-generated constructor stub

		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//getServletContext().getRequestDispatcher("IniciarSesion.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		UsuarioDAO usuarioDAO = DAOGuia.getGuia().getUsuarioDAO();
		String url = "";
		url = "IniciarSesion.jsp";
		List<Usuario> usuarios = usuarioDAO.find();
		System.out.println(usuarios);
		String user = request.getParameter("user");
		String pass = request.getParameter("password");

		String validaciones = "";
		String validaciones2 = "";


		boolean vacio = false;

		if(user.equals("")) 
			validaciones += "El correo esta vacio";



		if(pass.equals("")) 
			validaciones2 += "La contraseña esta vacia";{
				if (pass.length() >= 8) { 

					boolean espacios = false;
					boolean banMayus = false;
					boolean banMinus = false;
					for (int i = 0; i < pass.length(); i++) {
						char codigo = pass.charAt(i);
						if(codigo > 64 && codigo < 91 && !banMayus) { 
							banMayus= true;

						}
						else if(codigo > 96 && codigo < 123 && !banMinus) {
							banMinus = true;

						}else if(codigo == 255) {
							espacios = true;

						}
					}

					if (espacios)
						validaciones2 += "<br>La contraseña no puede contener espacios en blanco";
					if (!banMayus)
						validaciones2 += "<br>Debe Contener una mayuscula";

					if (!banMinus)

						validaciones2 += "<br>Debe contener una minuscula";
				} else if(!vacio) {

					validaciones2 += "<br>Contraseña debe tener minimo 8 caracteres";
				}
			}

			/*
			 *  document.getElementById("mensajePassword").innerHTML = "";

        "<br>Debe contener una minuscula";
  } else {
    document.getElementById("mensajePassword").innerHTML =
      "<br>";
    return false;
  }
			 */


			if (validaciones.equals("") && validaciones2.equals(""))  {
				boolean ok = false;
				for (Usuario usuario : usuarios) {
					if (usuario.getCorreo().equals(user)) 
						ok= true;
					else
						validaciones = "Correo incorrecto!";


					if(usuario.getContrasenia().equals(pass)) 

						ok = true;
					else
						validaciones2 = "Contraseña incorrecta!";

				}

				if(ok) {


					HttpSession session = request.getSession(true); 
					System.out.println("Buen trabajo");

					session.setAttribute("accesos", 1); 
					url = "ModificarInformacion.jsp";

				}


			}
			Usuario usuario = null;
			usuario = usuarioDAO.readByAddress(user);


			System.out.println(validaciones2);

			request.setAttribute("user", user);
			request.setAttribute("usuario", usuario);
			System.out.println(pass);
			request.setAttribute("password", pass);
			request.setAttribute("validaciones", validaciones);
			request.setAttribute("validaciones2", validaciones2);
			request.getRequestDispatcher(url).forward(request, response);


	}


}
