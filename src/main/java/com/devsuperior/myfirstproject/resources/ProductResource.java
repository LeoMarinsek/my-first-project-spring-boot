package com.devsuperior.myfirstproject.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.myfirstproject.entities.Product;
import com.devsuperior.myfirstproject.repositories.ProductRepository;

@RestController    // Define que essa classe será um recurso REST
@RequestMapping(value = "/products")   // Define o caminho pelo qual esse recurso vai responder
public class ProductResource {

	@Autowired     // Resolve as dependências por debaixo dos panos
	private ProductRepository categoryRepository;
	
	@GetMapping    // Método que será chamado quando se executar uma requisição GET pelo caminho acima
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = categoryRepository.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product cat = categoryRepository.findById(id).get();
		return ResponseEntity.ok().body(cat);
	}
	
}