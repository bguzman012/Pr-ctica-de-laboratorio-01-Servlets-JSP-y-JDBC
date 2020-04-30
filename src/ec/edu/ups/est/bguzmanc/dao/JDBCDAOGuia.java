package ec.edu.ups.est.bguzmanc.dao;

import ec.edu.ups.est.bguzmanc.mysql.jdbc.JDBCTelefonoDAO;
import ec.edu.ups.est.bguzmanc.mysql.jdbc.JDBCUsuarioDAO;

public class JDBCDAOGuia extends DAOGuia{

	@Override
	public void createTables() {
		this.getUsuarioDAO().createTable();
		this.getTelefonoDAO().createTable();
		
	}

	@Override
	public UsuarioDAO getUsuarioDAO() {
		// TODO Auto-generated method stub
		return new JDBCUsuarioDAO();
	}

	@Override
	public TelefonoDAO getTelefonoDAO() {
		// TODO Auto-generated method stub
		return new JDBCTelefonoDAO();
	}

}
