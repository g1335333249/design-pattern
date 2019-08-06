package com.g1335333249.abstractfactorypattern;

/**
 * 抽象工厂
 *
 * @author guanpeng
 * @date 2019-08-06 16:18
 */
public abstract class AbstractFactory {
    /**
     * 颜色的抽象工厂方法
     *
     * @param color
     * @return
     */
    public abstract Color getColor(String color);

    /**
     * 形状的抽象工厂方法
     *
     * @param shapeType
     * @return
     */
    public abstract Shape getShape(String shapeType);
}
