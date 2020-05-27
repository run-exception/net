package cn.leon.selfmallproduct.domain.category.aggregate;

/**
 * 类目 聚合根
 */
public class Category {
    private Long id;
    private String name;
    private String parentId;
    private int leaf;
    private int status;
    private String catePath;

}
