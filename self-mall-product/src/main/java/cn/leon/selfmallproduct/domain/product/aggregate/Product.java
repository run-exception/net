package cn.leon.selfmallproduct.domain.product.aggregate;

public class Product {
    private Long id;
    private String title;
    private int status;
    private int stock;
    private Long categoryId;
    private Long brandId;

    /**
     * 工厂方法
     *
     * @return
     */
    public static Product product() {
        return new Product();
    }
}
