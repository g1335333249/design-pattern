package com.g1335333249.builder.pattern;

/**
 * 鸡肉汉堡
 *
 * @author guanpeng
 * @date 2019-08-06 17:47
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
