package ec.edu.ups.est.bguzmanc.dao;

public abstract class DAOGuia {

	protected static DAOGuia guia = new JDBCDAOGuia();
	/**
	 * @return the guia
	 */
	public static DAOGuia getGuia() {
		return guia;
	}

	public abstract void createTables();

	public abstract UsuarioDAO getUsuarioDAO();

	public abstract TelefonoDAO getTelefonoDAO();
	
}
