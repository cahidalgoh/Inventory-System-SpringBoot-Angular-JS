package com.hidalgocarlos.inventory.service;

import com.hidalgocarlos.inventory.model.Product;

import java.util.List;

public interface IProductService {

    // Define methods for product management, e.g., create, read, update, delete products

    /**
     * Retrieve all products from the inventory.
     * @return List of all products.
     */
    List<Product> getAllProducts();

    /**
     * Retrieve a product by its ID.
     * @param productId The ID of the product to retrieve.
     * @return The product with the specified ID, or null if not found.
     */
    Product getProductById(Integer productId);

    /**
     * Save a new product or update an existing one.
     * @param product The product to save or update.
     */
    void saveOrUpdateProduct(Product product);

    /**
     * Delete a product by its ID.
     * @param productId The ID of the product to delete.
     */
    void deleteProduct(Integer productId);

}
