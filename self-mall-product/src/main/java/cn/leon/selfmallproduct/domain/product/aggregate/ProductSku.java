package cn.leon.selfmallproduct.domain.product.aggregate;

import java.math.BigDecimal;

public class ProductSku {
    private Long id;
    private Long productId;
    private Long propertyId;
    private int Stock;
    private BigDecimal price;
    private String cargoNum;
    private String barCode;
}
