package com.kpug.commerce.catalog.controller;

import com.kpug.commerce.catalog.domain.catalog.Catalog;
import com.kpug.commerce.catalog.domain.catalog.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1.0/catalog")
public class CatalogController {

    @Autowired
    private CatalogService catalogService;

    @GetMapping("{id}")
    public Catalog showOne(@PathVariable(name = "id") Long id) {
        Optional<Catalog> catalog = catalogService.findById(id);

        return catalog.get();
    }

    @GetMapping("list")
    public Iterable<Catalog> showAll() {
        return catalogService.findAll();
    }

    @PostMapping("new")
    public Catalog addOne() {
        return null;
    }

    @DeleteMapping("{id}")
    public void deleteOne(@PathVariable(name = "id") Long id) {
        catalogService.deleteOne(id);
    }
}
