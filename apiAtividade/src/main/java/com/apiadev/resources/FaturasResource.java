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

import com.apiadev.domain.Fatura;
import com.apiadev.repository.IFaturaRepository;

@RestController
@RequestMapping("/faturas")
public class FaturasResource {

	@Autowired
	private IFaturaRepository repository;
	
	@GetMapping()
		public ResponseEntity<List<Fatura>> listarFaturas() {
			return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
	}   		
    	
    	@PostMapping()
    	public void SalvarFatura(@RequestBody Fatura f) {
    		
    		repository.save(f);
    		
    	}
    	
    	@PutMapping()
    	public void AtualizarFatura() {
    		
    	}
    	
    	@DeleteMapping(value = "/{id}")
    	public void ExcluirFatura(@PathVariable Long id) {
    		
    		repository.deleteById(id);
    		
    	}
}