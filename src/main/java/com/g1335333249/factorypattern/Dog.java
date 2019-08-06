package com.g1335333249.factorypattern;

/**
 * 狗
 *
 * @author guanpeng
 * @date 2019-08-06 15:53
 */
public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("I'm a dog, I'm eating!");
    }
}
