package com.keyword.interfacetest;

/**
 * @author jiajinshuo
 * @create 2020-01-02 17:23
 * 定义一个Circle类，声明redius属性，提供getter和setter方法
 */
public class Circle {

    private Double redius;

    public Circle() {
    }

    public Circle(Double redius) {
        this.redius = redius;
    }

    public Double getRedius() {
        return redius;
    }

    public void setRedius(Double redius) {
        this.redius = redius;
    }
}
