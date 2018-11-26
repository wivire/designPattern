package com.yiyi.design.principle.openclose;

/**
 * <pre>
 * Created with IntelliJ IDEA.
 * User: yiyi
 * Date: 2018/11/23
 * Time: 22:05
 */
public class JavaCourse implements ICourse {

    private Integer Id;
    private String name;
    private Double price;

    public JavaCourse(Integer Id, String name, Double price) {
        this.Id = Id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.Id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }
}
