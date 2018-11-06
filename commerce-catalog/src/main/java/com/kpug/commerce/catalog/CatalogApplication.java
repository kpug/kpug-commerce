package com.kpug.commerce.catalog;

import com.kpug.commerce.catalog.domain.catalog.Catalog;
import com.kpug.commerce.catalog.domain.catalog.CatalogRepository;
import com.kpug.commerce.catalog.domain.product.Product;
import com.kpug.commerce.catalog.domain.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;

@SpringBootApplication

public class CatalogApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CatalogApplication.class, args);
    }

    @Autowired
    ProductRepository productRepository;
    @Autowired
    CatalogRepository catalogRepository;

    @Override
    public void run(String... args) throws Exception {

        Catalog c1 = new Catalog("c1");
        c1.addProduct(new Product("p1c1", 100, 100));
        c1.addProduct(new Product("p2c1", 101, 101));
        c1.addProduct(new Product("p3c1", 102, 102));
        catalogRepository.save(c1);

        Catalog c2 = new Catalog("c2");
        c2.addProduct(new Product("p4c2", 103, 103));
        c2.addProduct(new Product("p5c2", 104, 104));

        Catalog c3 = new Catalog("c3");

        catalogRepository.save(c2);
        catalogRepository.save(c3);



    }
}
