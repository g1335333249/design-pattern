package com.g1335333249.builder.pattern;

/**
 * @author guanpeng
 * @date 2019-08-06 17:35
 */
public interface Item {
    /**
     * 名称
     *
     * @return
     */
    String name();

    /**
     * 包装类型
     *
     * @return
     */
    Packing packing();

    /**
     * 价钱
     *
     * @return
     */
    float price();
}
