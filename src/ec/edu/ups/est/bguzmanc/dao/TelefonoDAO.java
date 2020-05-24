package ec.edu.ups.est.bguzmanc.dao;

import java.util.List;
import java.util.Set;

import ec.edu.ups.est.bguzmanc.modelo.Telefono;
import ec.edu.ups.est.bguzmanc.modelo.Usuario;

public interface TelefonoDAO extends GenericDAO<Telefono, Integer> {
	
	public abstract Telefono read(String numero);


	
}
