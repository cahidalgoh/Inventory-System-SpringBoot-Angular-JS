package com.hidalgocarlos.inventory.service;

import com.hidalgocarlos.inventory.model.Product;
import com.hidalgocarlos.inventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    private final ProductRepository productRepository;

    /**
     * Constructor for ProductServiceImpl.
     * Autowires the ProductRepository to perform CRUD operations on Product entities.
     */
    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return this.productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer productId) {
        return this.productRepository.findById(productId).orElse(null);
    }

    @Override
    public void saveOrUpdateProduct(Product product) {
        this.productRepository.save(product);
    }

    @Override
    public void deleteProduct(Integer productId) {
        this.productRepository.deleteById(productId);
    }
}
