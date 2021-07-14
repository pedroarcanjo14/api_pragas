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

import com.apiadev.domain.Curso;
import com.apiadev.repository.ICursoRepository;

@RestController
@RequestMapping("/cursos")
public class CursosResource {

	@Autowired
	private ICursoRepository repository;
	

	@GetMapping()

		public ResponseEntity<List<Curso>> listarCursos() {
		
		
		return ResponseEntity.status(HttpStatus.OK).
				body(repository.findAll());
		
	}   	
    	
    	
    	@PostMapping()
    	public void SalvarCurso(@RequestBody Curso c ) {
    		
    		repository.save(c); //salvar nova pessoa
    	}
    	@PutMapping()
    	public void AtualizarCurso() {
    		
    	}
    	
    	@DeleteMapping(value = "/{id}")
    	public void ExcluirCurso(@PathVariable Long id) {
    		
    		repository.deleteById(id);
    		
    	}
}
