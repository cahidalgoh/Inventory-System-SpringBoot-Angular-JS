package com.hidalgocarlos.inventory.repository;

import com.hidalgocarlos.inventory.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    // Additional query methods can be defined here if needed
    // For example, you can add methods to find products by name, price range, etc
    // JpaRepository provides basic CRUD operations out of the box
    // No additional methods are required for basic functionality
}
