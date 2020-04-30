package ec.edu.ups.est.bguzmanc.modelo;

import java.io.Serializable;
import java.util.Set;

public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String cedula;
	private String nombre;
	private String apellido;
	private String correo;
	private Set<Telefono> telefonos;
	private Set<Usuario> usuarios;


	public Usuario() {
		
		// TODO Auto-generated constructor stub
	}
		
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}



	/**
	 * @return the usuarios
	 */
	public Set<Usuario> getUsuarios() {
		return usuarios;
	}


	/**
	 * @param usuarios the usuarios to set
	 */
	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}


	/**
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}
	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}
	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	/**
	 * @return the telefonos
	 */
	public Set<Telefono> getTelefonos() {
		return telefonos;
	}
	/**
	 * @param telefonos the telefonos to set
	 */
	public void setTelefonos(Set<Telefono> telefonos) {
		this.telefonos = telefonos;
	}



	@Override
	public String toString() {
		return "Usuario [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", correo=" + correo + ", telefonos=" + telefonos + ", usuarios=" + usuarios + "]";
	}
	
	

}
