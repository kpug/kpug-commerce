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

    @Override
    public void run(String... args) throws Exception {

    }
}
