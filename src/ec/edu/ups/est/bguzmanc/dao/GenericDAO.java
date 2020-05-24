package ec.edu.ups.est.bguzmanc.dao;

import java.util.List;
import java.util.Set;

import ec.edu.ups.est.bguzmanc.modelo.Telefono;
import ec.edu.ups.est.bguzmanc.modelo.Usuario;

public interface GenericDAO <T, ID> {


	public void create(T entity);

	public T read(ID id);

	public void update(T entity);

	public void delete(T entity);

	public List<T> find();

	Telefono read(Usuario usuario);

	List<Telefono> findByUsuario(Usuario usuario);
	
	

}
