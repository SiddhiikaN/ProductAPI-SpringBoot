package com.siddhika.productapi.service;

import java.util.List;
import com.siddhika.productapi.entity.Product;
import com.siddhika.productapi.exception.ProductNotFoundException;
import com.siddhika.productapi.repository.ProductRepository;

import org.springframework.stereotype.Service;


@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(String id) {
        return productRepository.findById(id)
        .orElseThrow(() -> new ProductNotFoundException("Product not found."));
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(String id, Product updatedProduct) {

        Product existingProduct = productRepository.findById(id)
        .orElseThrow(() -> new ProductNotFoundException("Product not found."));
        existingProduct.setName(updatedProduct.getName());
        existingProduct.setPrice(updatedProduct.getPrice());

        return productRepository.save(existingProduct);
    }

    public void deleteProduct(String id) {
        Product existingProduct = productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException("Product not found."));
        
        productRepository.deleteById(id);
    }
}
