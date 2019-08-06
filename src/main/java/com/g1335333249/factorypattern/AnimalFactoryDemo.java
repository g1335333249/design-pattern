package com.g1335333249.factorypattern;

/**
 * Animal工厂Demo
 *
 * @author guanpeng
 * @date 2019-08-06 15:59
 */
public class AnimalFactoryDemo {

    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        // 获取cat
        Animal cat = animalFactory.getAnimal("cat");
        // 调用cat的eat方法
        cat.eat();
        // 获取dog
        Animal dog = animalFactory.getAnimal("dog");
        // 调用dog的eat方法
        dog.eat();
        // 获取pig
        Animal pig = animalFactory.getAnimal("pig");
        // 调用pig的eat方法
        pig.eat();
    }
}
