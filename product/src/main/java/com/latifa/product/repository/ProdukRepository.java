package com.latifa.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.latifa.product.model.Produk;

@Repository
public interface ProdukRepository extends JpaRepository<Produk, Long> { 

    
} 