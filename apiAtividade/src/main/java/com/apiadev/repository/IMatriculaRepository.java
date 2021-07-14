package com.apiadev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiadev.domain.Matricula;



public interface IMatriculaRepository extends JpaRepository<Matricula, Long> {

}
