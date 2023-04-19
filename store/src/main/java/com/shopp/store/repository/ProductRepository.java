package com.shopp.store.repository;

import com.shopp.store.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    public List<Product> findByProductNameContainingIgnoreCase(String searchKey);
    public Product findByProductName(String productName);
}
