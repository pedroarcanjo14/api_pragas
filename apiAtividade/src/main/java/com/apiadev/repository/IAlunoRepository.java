package com.apiadev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apiadev.domain.Aluno;

@Repository
public interface IAlunoRepository extends JpaRepository<Aluno, Long>{
	
	

}
