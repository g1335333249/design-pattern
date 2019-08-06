package com.g1335333249.builder.pattern;

/**
 * 可乐
 *
 * @author guanpeng
 * @date 2019-08-06 17:47
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}