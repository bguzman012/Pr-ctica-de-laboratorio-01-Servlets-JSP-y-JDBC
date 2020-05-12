package ec.edu.ups.est.bguzmanc.dao;

import ec.edu.ups.est.bguzmanc.modelo.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario, String>{
	
	public abstract Usuario readByAddress(String id);
	
		

}
