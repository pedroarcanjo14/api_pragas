package com.apiadev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiadev.domain.Curso;



public interface ICursoRepository extends JpaRepository<Curso, Long> {

}
