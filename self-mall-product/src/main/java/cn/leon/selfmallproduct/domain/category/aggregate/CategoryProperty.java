package cn.leon.selfmallproduct.domain.category.aggregate;

/**
 * 实体
 */
public class CategoryProperty {
    private Long id;
    private Long categoryId;
    private String propertyName;
    private int Status;
    /**
     * 是否必须
     */
    private boolean requeire;
    /**
     * 属性类型
     */
    private int propertyType;
    /**
     * 属性输入类型
     */
    private int inputType;
    /**
     * 是否支持多选
     */
    private int muti;
    /**
     * 排序
     */
    private int sortOrder;




}
