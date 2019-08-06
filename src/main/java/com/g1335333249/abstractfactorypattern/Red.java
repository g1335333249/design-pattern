package com.g1335333249.abstractfactorypattern;

/**
 * 红色
 *
 * @author guanpeng
 * @date 2019-08-06 16:16
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
