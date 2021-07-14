package com.apiadev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiadev.domain.Endereco;

public interface IEnderecoRepository extends JpaRepository<Endereco, Long> {

}
