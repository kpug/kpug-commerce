package com.kpug.commerce.catalog.domain.catalog;

import lombok.*;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@EqualsAndHashCode
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CatalogDto {

    @NotEmpty
    private String name;
}
