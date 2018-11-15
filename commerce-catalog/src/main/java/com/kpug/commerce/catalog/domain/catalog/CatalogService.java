package com.kpug.commerce.catalog.domain.catalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CatalogService {

    @Autowired
    private CatalogRepository catalogRepository;

    public Optional<Catalog> findById(Long id) {
        return catalogRepository.findById(id);
    }

    public Iterable<Catalog> findAll() {
        return catalogRepository.findAll();
    }

    public void deleteOne(Long id) {
        catalogRepository.deleteById(id);
    }
}
