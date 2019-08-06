package com.g1335333249.builder.pattern;

/**
 * 蔬菜汉堡
 *
 * @author guanpeng
 * @date 2019-08-06 17:46
 */
public class VegBurger extends Burger{
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
