package ec.edu.ups.est.bguzmanc.mysql.jdbc;

import java.util.List;

import ec.edu.ups.est.bguzmanc.dao.UsuarioDAO;
import ec.edu.ups.est.bguzmanc.modelo.Usuario;

public class JDBCUsuarioDAO extends JDBCGenericDAO<Usuario, Integer> implements UsuarioDAO{

	@Override
	public void createTable() {
		// TODO Auto-generated method stub
		conexionUno.update("DROP TABLE IF EXISTS User_Detail");
		conexionUno.update("DROP TABLE IF EXISTS User");
		conexionUno.update("CREATE TABLE User (" + "ID INT NOT NULL, LEVEL INT, "
				+ "NAME VARCHAR(255), PASSWORD VARCHAR(255), PRIMARY KEY (ID))");
		//DAOFactory.getFactory().getUserDetailDAO().createTable();
	}

	@Override
	public void create(Usuario entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Usuario entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Usuario entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> find() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
