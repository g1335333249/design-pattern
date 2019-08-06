package com.g1335333249.abstractfactorypattern;

/**
 * 工厂创造者
 *
 * @author guanpeng
 * @date 2019-08-06 16:21
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
