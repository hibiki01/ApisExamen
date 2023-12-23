package tech.cognity.apiproduc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tech.cognity.apiproduc.service.ArticuloService;
;



@RestController
@RequestMapping("/v1/articulos")

public class ArticuloControler {
	
	@Autowired
	private ArticuloService service;
	
	@GetMapping()
	public <Articulo> ResponseEntity<List<Articulo>>  findAll(
		
		
	@RequestParam(value="nombre",required = false, defaultValue="")String nombre,
	@RequestParam(value="offset",required = false, defaultValue="0")int pageNumber,
	@RequestParam(value="limit",required = false, defaultValue="")int pageSize	
		
	){
		
	PageRequest page= PageRequest.of(pageNumber, pageSize);
	List<Articulo> articulos;
		
	if(nombre==null) {
			articulos=service.findAll(page);
			
	}else {
		articulos=service.findByNombre(nombre,page);
			
	}
	}

}









