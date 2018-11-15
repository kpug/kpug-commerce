package com.kpug.commerce.catalog.domain.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    public Product increasePorudctCount(Long id, Integer count) {
        Optional<Product> product = findById(id);
        product.ifPresent(p -> {
            Integer c = Math.max(0, p.getCount() + count);
            p.setCount(c);
            productRepository.save(p);
        });

        return product.get();
    }

    public Product decreasePorudctCount(Long id, Integer count) {
        Optional<Product> product = findById(id);
        product.ifPresent(p -> {
            Integer c = Math.max(0, p.getCount() - count);
            p.setCount(c);
            productRepository.save(p);
        });

        return product.get();
    }

    public void deleteOne(Long id) {
        productRepository.deleteById(id);
    }
}
