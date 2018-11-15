package com.kpug.commerce.catalog.domain.product;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.kpug.commerce.catalog.domain.catalog.Catalog;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer price;

    private Integer count;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "catalog_id", nullable = false)
    @JsonManagedReference
    private Catalog catalog;

    public Product(final String name, final Integer price, final Integer count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }
}
