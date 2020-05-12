package ec.edu.ups.est.bguzmanc.dao;

import java.util.List;

import ec.edu.ups.est.bguzmanc.modelo.Telefono;

public interface GenericDAO <T, ID> {

	public void createTable();

	public void create(T entity);

	public T read(ID id);

	public void update(T entity);

	public void delete(T entity);

	public List<T> find();
	

}
