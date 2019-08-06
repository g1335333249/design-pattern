package com.g1335333249.abstractfactorypattern;

/**
 * 绿色
 *
 * @author guanpeng
 * @date 2019-08-06 16:17
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}