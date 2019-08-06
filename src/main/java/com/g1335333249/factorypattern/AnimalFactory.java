package com.g1335333249.factorypattern;

/**
 * 动物工厂
 *
 * @author guanpeng
 * @date 2019-08-06 15:55
 */
public class AnimalFactory {

    /**
     * 根据动物类型返回对应的动物实体类
     *
     * @param animalType
     * @return
     */
    public Animal getAnimal(String animalType) {
        if (animalType == null) {
            return null;
        }
        if (animalType.equalsIgnoreCase("cat")) {
            return new Cat();
        } else if (animalType.equalsIgnoreCase("dog")) {
            return new Dog();
        } else if (animalType.equalsIgnoreCase("pig")) {
            return new Pig();
        }
        return null;
    }
}
