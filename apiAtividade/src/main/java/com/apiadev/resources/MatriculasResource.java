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


import com.apiadev.domain.Matricula;
import com.apiadev.repository.IMatriculaRepository;

@RestController
@RequestMapping("/matriculas")
public class MatriculasResource {

	@Autowired
	private IMatriculaRepository repository;
	
	@GetMapping()

	public ResponseEntity<List<Matricula>> listarMatriculas() {
	
	
	return ResponseEntity.status(HttpStatus.OK).
			body(repository.findAll());
	}
    	
    	
	@PostMapping()
	public void SalvarMatricula(@RequestBody Matricula m ) {

		repository.save(m); //salvar nova pessoa
	}
    	
    	@PutMapping()
    	public void AtualizarMatricula() {
    		
    	}
    	
    	@DeleteMapping(value = "/{id}")
    	public void ExcluirMatricula(@PathVariable Long id) {
    		
    		repository.deleteById(id);
    		
    	}
}
