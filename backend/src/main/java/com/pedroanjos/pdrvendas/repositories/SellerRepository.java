package com.pedroanjos.pdrvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedroanjos.pdrvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
