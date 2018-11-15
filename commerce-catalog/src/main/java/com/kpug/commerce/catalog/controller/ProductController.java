package com.kpug.commerce.catalog.controller;

import com.kpug.commerce.catalog.domain.catalog.Catalog;
import com.kpug.commerce.catalog.domain.product.Product;
import com.kpug.commerce.catalog.domain.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1.0/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("{id}")
    public Product showOne(@PathVariable(name = "id") Long id) {
        Optional<Product> product = productService.findById(id);

        return product.get();
    }

    @GetMapping("list")
    public Iterable<Product> showAll() {
        return productService.findAll();
    }

    @PostMapping("new")
    public Catalog addOne() {
        return null;
    }

    @PutMapping("{id}/increase/{count}")
    public Product increaseStock(@PathVariable(name = "id") Long id,
                             @PathVariable(name = "count") Integer count) {
        return productService.increasePorudctCount(id, count);
    }

    @PutMapping("{id}/decrease/{count}")
    public Product decreaseStock(@PathVariable(name = "id") Long id,
                                 @PathVariable(name = "count") Integer count) {
        return productService.decreasePorudctCount(id, count);
    }

    @DeleteMapping("{id}")
    public void deleteOne(@PathVariable(name = "id") Long id) {
        productService.deleteOne(id);
    }
}
