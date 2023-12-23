package tech.cognity.apiproduc.service;

import java.util.List;
import org.springframework.data.domain.Pageable;

import tech.cognity.apiproduc.entity.Articulo;


public interface ArticuloService {
	
	public List<Articulo> findAll(Pageable page);
	public List<Articulo> findByNombre(String nombre, Pageable page);
	public Articulo findByID(int id);
	public Articulo save(Articulo articulo);
	public Articulo update (Articulo articulo);
	public void delete(int id);

}
