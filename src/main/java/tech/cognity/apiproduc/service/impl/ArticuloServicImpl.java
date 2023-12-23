package tech.cognity.apiproduc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import tech.cognity.apiproduc.entity.Articulo;
import tech.cognity.apiproduc.repository.ArticuloRepository;
import tech.cognity.apiproduc.service.ArticuloService;

public class ArticuloServicImpl implements ArticuloService {
	@Autowired
	private ArticuloRepository repository;
	@Override
	@Transactional(readOnly=true)
	public List<Articulo> findAll(Pageable page) {
		
		try {
			return repository.findAll(page).toList();
		
		}catch(Exception e) {
			return null;
		}
	}

	
	@Override
	@Transactional(readOnly=true)
	public List<Articulo> findByNombre(String nombre, Pageable page) {
		try {
			return repository.findByNombreContaining(nombre, page);
		
		}catch(Exception e) {
			return null;
		}
	}

	@Override
	@Transactional(readOnly=true)
	public Articulo findByID(int id) {
		try {
			Articulo registro=repository.findById(id).orElseThrow();
		return registro;
		}catch(Exception e) {
			return null;
		}
	}

	@Override

	public Articulo save(Articulo articulo) {
		try {
		
			articulo.setActivo(true);
			Articulo registro=repository.save(articulo);
			return registro;
			
		}catch(Exception e) {
			return null;
		}
	}

	@Override
	public Articulo update(Articulo articulo) {
		try {
			
			Articulo registro = repository.findById(articulo.getId()).orElseThrow();
			registro.setNombre(articulo.getNombre());
			
			registro.SetPrecio(articulo.getPrecio());
			
			repository.save(registro);
			}catch(Exception e) {
			return null;
		}
		return articulo;
	
	}

	@Override
	public void delete(int id) {
		try {
			Articulo registro=repository.findById(id).orElseThrow();
		
			repository.delete(registro);
			
		}catch(Exception e) {
			
		}

		
		
}
	}










