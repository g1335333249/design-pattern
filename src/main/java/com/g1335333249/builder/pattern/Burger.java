package com.g1335333249.builder.pattern;

/**
 * 汉堡
 *
 * @author guanpeng
 * @date 2019-08-06 17:42
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
