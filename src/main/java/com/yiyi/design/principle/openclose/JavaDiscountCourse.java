package com.yiyi.design.principle.openclose;

/**
 * <pre>
 * Created with IntelliJ IDEA.
 * User: yiyi
 * Date: 2018/11/23
 * Time: 22:08
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer Id, String name, Double price) {
        super(Id, name, price);
    }

    public Double getOriginPrice(){
        return super.getPrice();
    }

    @Override
    public Double getPrice(){
        return super.getPrice() * 0.8;
    }

}
