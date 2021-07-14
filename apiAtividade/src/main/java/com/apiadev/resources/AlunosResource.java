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

import com.apiadev.domain.Aluno;
import com.apiadev.repository.IAlunoRepository;



@RestController
@RequestMapping("/alunos")
public class AlunosResource {
	
	
	@Autowired
	private IAlunoRepository repository;
	

	@GetMapping()

		public ResponseEntity<List<Aluno>> listarAlunos() {
		
		
		return ResponseEntity.status(HttpStatus.OK).
				body(repository.findAll());
		
	}   		
    	
    	
    	@PostMapping()
    	public void SalvarAluno(@RequestBody Aluno a ) {
	
    		repository.save(a); //salvar nova pessoa
    		
    	}
    	
    	@PutMapping()
    	public void AtualizarAlunos() {
    		
    	}
    	
    	@DeleteMapping(value = "/{id}")
    	public void ExcluirAluno(@PathVariable Long id) {
    		
    		repository.deleteById(id);
    		
    	}
}