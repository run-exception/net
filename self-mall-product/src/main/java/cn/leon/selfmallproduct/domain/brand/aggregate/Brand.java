package cn.leon.selfmallproduct.domain.brand.aggregate;

import lombok.Data;

@Data
public class Brand {
    private Long id;
    private String cnName;
    private String imgSrc;
    private int Status;
    private int productCount;
    private String enName;

}
