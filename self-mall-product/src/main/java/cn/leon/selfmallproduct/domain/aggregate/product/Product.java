package cn.leon.selfmallproduct.domain.aggregate.product;

public class Product {
    private String id;

    /**
     * 工厂方法
     *
     * @return
     */
    public static Product product() {
        return new Product();
    }
}
