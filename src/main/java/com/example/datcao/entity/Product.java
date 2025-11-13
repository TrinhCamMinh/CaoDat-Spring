package com.example.datcao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Products")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @Column(name = "ProductID")
    private Integer productId;

    @Column(name = "ProductName", nullable = false, length = 100)
    private String productName;

    @ManyToOne
    @JoinColumn(name = "CategoryID")
    private Category category;

    @Column(name = "UnitsInStock")
    private Integer unitsInStock;

    @Column(name = "UnitPrice", precision = 10, scale = 2)
    private BigDecimal unitPrice;
}
