package com.example.datcao.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;
import java.math.BigDecimal;
import lombok.*;

@Entity
@Table(name = "products")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @Column(name = "productid")
    private Integer productId;

    @Column(name = "productname", nullable = false, length = 100)
    private String productName;

    @ManyToOne
    @JoinColumn(name = "categoryid")
    private Category category;

    @Column(name = "unitsinstock")
    private Integer unitsInStock;

    @Column(name = "unitprice", precision = 10, scale = 2)
    private BigDecimal unitPrice;

    // ---------- JSON OUTPUT: shows categoryName ----------
    @JsonProperty("categoryName")
    public String getCategoryName() {
        return category != null ? category.getCategoryName() : null;
    }

    // ---------- JSON INPUT: accept categoryId in request ----------
    @JsonProperty("categoryId")
    public void setCategoryId(Integer categoryId) {
        if (categoryId != null) {
            this.category = new Category();
            this.category.setCategoryId(categoryId);
        }
    }

    // ---------- JSON OUTPUT: show only categoryId ----------
    @JsonProperty("categoryId")
    public Integer getCategoryId() {
        return category != null ? category.getCategoryId() : null;
    }
}
