package com.hidalgocarlos.inventory.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "product_name", nullable = false, length = 100)
    @NonNull
    //@Setter(AccessLevel.NONE) // Prevents Lombok from generating a setter for productName
    @Getter(AccessLevel.NONE) // Prevents Lombok from generating a getter for
    private String productName;

    @Column(length = 150)
    private String description;

    @Column(precision = 10, scale = 2)
    @NonNull
    private BigDecimal price;

    @Column(nullable = false, columnDefinition = "int default 0")
    @NonNull
    private Integer stock;

}
