package com.g1335333249.factorypattern;

/**
 * 猫
 *
 * @author guanpeng
 * @date 2019-08-06 15:53
 */
public class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("I'm a cat, I'm eating!");
    }
}