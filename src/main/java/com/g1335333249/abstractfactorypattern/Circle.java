package com.g1335333249.abstractfactorypattern;

/**
 * 圆
 *
 * @author guanpeng
 * @date 2019-08-06 16:15
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}