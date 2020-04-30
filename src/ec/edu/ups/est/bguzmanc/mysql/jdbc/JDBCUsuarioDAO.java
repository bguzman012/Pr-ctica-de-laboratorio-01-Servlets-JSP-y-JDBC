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
		conexionUno.update("CREATE TABLE Usuario (" + "CEDULA VARCHAR(10) NOT NULL UNIQUE, "
				+ "NOMBRE VARCHAR(50) NOT NULL, APELLIDO VARCHAR(50) NOT NULL, "
				+ "CORREO VARCHAR(100) NOT NULL, CONTRASENIA VARCHAR(25) NOT NULL"
				+ " PRIMARY KEY (CEDULA))");
		DAOGuia.getGuia().getUsuarioDAO().createTable();

	}

	@Override
	public void create(Usuario usuario) {
		// TODO Auto-generated method stub
		conexionUno.update("INSERT User VALUES ('" + usuario.getCedula() + "', '" + usuario.getNombre() + "', '" + usuario.getApellido()
		+ "', '" + usuario.getCorreo() + "', '" + usuario.getContrasenia() + "')");
		Set<Telefono> telefonos = usuario.getTelefonos();
		if (telefonos != null) {
			for (Telefono telefono : telefonos) {
				DAOGuia.getGuia().getTelefonoDAO().create(telefono);
			}
		}

	}

	@Override
	public Usuario read(String id) {
		// TODO Auto-generated method stub
		Usuario usuario = null;
		ResultSet rs = conexionUno.query("SELECT * FROM Usuario WHERE contrasenia= '" + id + "'");
		try {
			usuario = new Usuario(rs.getString("cedula"), rs.getString("nombre"), rs.getString("apellido"), rs.getString("correo"), 
					rs.getString("contrasenia"));

		}catch(SQLException e){
			System.out.println(">>>WARNING (JDBCUserDAO:read): " + e.getMessage());

		}if(usuario == null) {
			return null;
		}
		Set<Telefono> telefonos = DAOGuia.getGuia().getTelefonoDAO().findByUsuario(usuario.getCedula());

		if(telefonos != null) {
			usuario.setTelefonos(telefonos);
		}

		return usuario;

	}

	@Override
	public void update(Usuario usuario) {
		// TODO Auto-generated method stub
		TelefonoDAO telefonoDAO = DAOGuia.getGuia().getTelefonoDAO();
		Set<Telefono> telefonos = telefonoDAO.findByUsuario(usuario.getContrasenia());	
		conexionUno.update("UPDATE Usuario SET nombre = '" + usuario.getNombre() + "', apellido = '" + usuario.getApellido() + "', correo = '" 
				+ usuario.getCorreo() + "', contrasenia ='" + usuario.getContrasenia() + "' WHERE cedula = '" + usuario.getCedula() + "'");

		if (usuario.getTelefonos() == null && telefonos != null) {
			for (Telefono telefono : telefonos) {
				telefonoDAO.delete(telefono);
			}
		} else if(usuario.getTelefonos() != null && telefonos == null) {
			for (Telefono telefono : usuario.getTelefonos()) {
				telefonoDAO.create(telefono);
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
		conexionUno.update("DELETE FROM Usuario WHERE contrasenia = '" + usuario.getContrasenia() + "'");

	}

	@Override
	public List<Usuario> find() {

		List<Usuario> list = new ArrayList<Usuario>();
		ResultSet rs = conexionUno.query("SELECT * FROM Usuario");
		try {
			while (rs.next()) {
				Usuario usuario = new Usuario(rs.getString("cedula"), rs.getString("nombre"), rs.getString("apellido"), rs.getString("correo"), 
						rs.getString("contraenia"));

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

	}
