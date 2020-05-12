package ec.edu.ups.est.bguzmanc.mysql.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import ec.edu.ups.est.bguzmanc.dao.DAOGuia;
import ec.edu.ups.est.bguzmanc.dao.TelefonoDAO;
import ec.edu.ups.est.bguzmanc.dao.UsuarioDAO;
import ec.edu.ups.est.bguzmanc.modelo.Telefono;
import ec.edu.ups.est.bguzmanc.modelo.Usuario;

public class JDBCUsuarioDAO extends JDBCGenericDAO<Usuario, String> implements UsuarioDAO{

	@Override
	public void createTable() {
		// TODO Auto-generated method stub
		conexionUno.update("DROP TABLE IF EXISTS Telefono");
		conexionUno.update("DROP TABLE IF EXISTS Usuario");
		conexionUno.update("CREATE TABLE Usuario (" + "USU_CEDULA VARCHAR(10) NOT NULL UNIQUE, "
				+ "USU_NOMBRE VARCHAR(50) NOT NULL, USU_APELLIDO VARCHAR(50) NOT NULL, "
				+ "USU_CORREO VARCHAR(100) NOT NULL, USU_CONTRASENIA VARCHAR(25) NOT NULL, "
				+ "PRIMARY KEY (USU_CEDULA))");

	}

	@Override
	public void create(Usuario usuario) {
		// TODO Auto-generated method stub
		conexionUno.update("INSERT Usuario VALUES ('" + usuario.getCedula() + "', '" + usuario.getNombre() + "', '" + 
				usuario.getApellido() + "', '" + usuario.getCorreo() + "', '" + usuario.getContrasenia() + "')");



		Set<Telefono> telefonos = usuario.getTelefonos();
		if (telefonos != null) {
			for (Telefono telefono : telefonos) {

				DAOGuia.getGuia().getTelefonoDAO().createTabla(telefono, usuario.getCedula());
			}
		}

	}

	@Override
	public Usuario read(String id) {
		// TODO Auto-generated method stub
		Usuario usuario = null;
		ResultSet rs = conexionDos.query("Select * from Usuario where USU_CEDULA =" + id );
		System.out.println(rs.toString());
		try {
			if (rs != null && rs.next()) {
				usuario = new Usuario(rs.getString("USU_CEDULA"), rs.getString("USU_NOMBRE"), 
						rs.getString("USU_APELLIDO"), rs.getString("USU_CORREO"), 
						rs.getString("USU_CONTRASENIA"));


			}

		}catch(SQLException e){
			System.out.println(">>>WARNING (JDBCUserDAO:read): " + e.getMessage());

		}if(usuario == null) {
			return null;
		}
		Set<Telefono> telefonos = DAOGuia.getGuia().getTelefonoDAO().findByUsuario(usuario.getCedula());

		if(telefonos.size()>0) {
			usuario.setTelefonos(telefonos);
		}

		System.out.println(usuario);
		return usuario;

	}

	@Override
	public void update(Usuario usuario) {
		// TODO Auto-generated method stub
		TelefonoDAO telefonoDAO = DAOGuia.getGuia().getTelefonoDAO();
		Set<Telefono> telefonos = telefonoDAO.findByUsuario(usuario.getContrasenia());	
		conexionUno.update("UPDATE Usuario SET USU_NOMBRE = '" + usuario.getNombre() + "', USU_APELLIDO = '" + usuario.getApellido() + 
				"', USU_CORREO = '" + usuario.getCorreo() + "', USU_CONTRASENIA ='" + usuario.getContrasenia() + "' WHERE USU_CEDULA = '" +
				usuario.getCedula() + "'");

		if (usuario.getTelefonos() == null && telefonos != null) {
			for (Telefono telefono : telefonos) {
				telefonoDAO.delete(telefono);
			}
		} else if(usuario.getTelefonos() != null && telefonos == null) {
			for (Telefono telefono : usuario.getTelefonos()) {
				telefonoDAO.createTabla(telefono, usuario.getCedula()); ;
			}
		} else if(usuario.getTelefonos() !=null && telefonos != null) {
			for (Telefono telefono : usuario.getTelefonos()) {
				telefonoDAO.update(telefono);
			}
		}



	}

	@Override
	public void delete(Usuario usuario) {
		// TODO Auto-generated method stub
		if (usuario.getTelefonos() != null) {
			for (Telefono telefonos : usuario.getTelefonos()) {
				DAOGuia.getGuia().getTelefonoDAO().delete(telefonos);
			}
		}
		conexionUno.update("DELETE FROM Usuario WHERE USU_CEDULA = '" + usuario.getCedula() + "'");

	}

	@Override
	public List<Usuario> find() {

		List<Usuario> list = new ArrayList<Usuario>();
		ResultSet rs = conexionUno.query("SELECT * FROM Usuario");
		try {
			while (rs.next()) {
				Usuario usuario = new Usuario(rs.getString("USU_CEDULA"), rs.getString("USU_NOMBRE"), rs.getString("USU_APELLIDO"),
						rs.getString("USU_CORREO"), rs.getString("USU_CONTRASENIA"));

				Set<Telefono> telefonos = DAOGuia.getGuia().getTelefonoDAO().
						findByUsuario(usuario.getCedula());
				if(telefonos != null) {
					usuario.setTelefonos(telefonos);
				}
				list.add(usuario);
			}

		}catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCShoppingBasketDAO:find): " + e.getMessage());
		}

		return list;

	} 

	public Usuario readByAddress(String id) {
		// TODO Auto-generated method stub
		Usuario usuario = null;
		ResultSet rs = conexionDos.query("Select * from Usuario where USU_CORREO = '" + id + "'" );
		System.out.println(rs.toString());
		try {
			if (rs != null && rs.next()) {
				usuario = new Usuario(rs.getString("USU_CEDULA"), rs.getString("USU_NOMBRE"), 
						rs.getString("USU_APELLIDO"), rs.getString("USU_CORREO"), 
						rs.getString("USU_CONTRASENIA"));


			}

		}catch(SQLException e){
			System.out.println(">>>WARNING (JDBCUserDAO:read): " + e.getMessage());

		}if(usuario == null) {
			return null;
		}
		Set<Telefono> telefonos = DAOGuia.getGuia().getTelefonoDAO().findByUsuario(usuario.getCedula());

		if(telefonos.size()>0) {
			usuario.setTelefonos(telefonos);
		}

		System.out.println(usuario);
		return usuario;

	}

}
