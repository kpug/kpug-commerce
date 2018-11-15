package com.kpug.commerce.catalog.domain.catalog;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.kpug.commerce.catalog.domain.product.Product;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class Catalog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "catalog", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Product> products = new ArrayList<Product>();

    public void addProduct(final Product product) {
        products.add(product);
        product.setCatalog(this);
    }

    public Catalog(final String name) {
        this.name = name;
    }
}
