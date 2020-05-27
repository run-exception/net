package cn.leon.selfmallproduct.domain.product.aggregate;

public class ProductAdjustLog {
    private Long id;
    private String productTitle;
    private String imgs;
    private String desc;
    /**
     * 审核状态
     */
    private int status;
}
