package com.apiadev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiadev.domain.Fatura;

public interface IFaturaRepository extends JpaRepository<Fatura, Long> {

}
