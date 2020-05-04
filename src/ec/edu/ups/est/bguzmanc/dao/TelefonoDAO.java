package ec.edu.ups.est.bguzmanc.dao;

import java.util.Set;

import ec.edu.ups.est.bguzmanc.modelo.Telefono;

public interface TelefonoDAO extends GenericDAO<Telefono, Integer> {

	public abstract Set<Telefono> findByUsuario(String contrasena);

	public abstract void createTabla(Telefono telefono, String cedula);
	
	public abstract boolean validarNumero(String texto);
	
}
