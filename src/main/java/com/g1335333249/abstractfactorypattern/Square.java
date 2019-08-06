package com.g1335333249.abstractfactorypattern;

/**
 * 正方形
 *
 * @author guanpeng
 * @date 2019-08-06 16:14
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}