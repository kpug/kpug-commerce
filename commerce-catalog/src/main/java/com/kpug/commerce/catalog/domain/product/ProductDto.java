package com.kpug.commerce.catalog.domain.product;

import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@EqualsAndHashCode
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    @NotEmpty
    private String name;

    @Min(0)
    private Integer price;

    @Min(0)
    private Integer count;
}
