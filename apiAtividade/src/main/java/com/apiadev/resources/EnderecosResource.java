package com.apiadev.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.apiadev.domain.Endereco;
import com.apiadev.repository.IEnderecoRepository;

@RestController
@RequestMapping("/enderecos")
public class EnderecosResource {
	
	@Autowired
	private IEnderecoRepository repository;

	@GetMapping()

	public ResponseEntity<List<Endereco>> listarEnderecos() {
	
	
	return ResponseEntity.status(HttpStatus.OK).
			body(repository.findAll());
	
}   		
	
    	
    	
	@PostMapping()
	public void SalvarEndereco(@RequestBody Endereco e ) {

		repository.save(e); //salvar nova pessoa
	}
    	
    	@PutMapping()
    	public void AtualizarEndereco() {
    		
    	}
    	
    	@DeleteMapping(value = "/{id}")
    	public void ExcluirEndereco(@PathVariable Long id) {
    		
    		repository.deleteById(id);
    		
    	}
}