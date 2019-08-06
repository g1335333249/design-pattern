package com.g1335333249.builder.pattern;

/**
 * 冷饮
 *
 * @author guanpeng
 * @date 2019-08-06 17:44
 */
public abstract class ColdDrink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
