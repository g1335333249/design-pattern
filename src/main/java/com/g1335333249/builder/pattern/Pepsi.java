package com.g1335333249.builder.pattern;

/**
 * 百事可乐
 *
 * @author guanpeng
 * @date 2019-08-06 17:48
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}