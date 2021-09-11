package com.pedroanjos.pdrvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedroanjos.pdrvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
