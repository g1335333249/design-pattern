package com.g1335333249.singleton;

/**
 * @author guanpeng
 * @date 2019-08-06 16:25
 */
public class SingleObject {
    private SingleObject() {
    }

    private static SingleObject instance = new SingleObject();

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage(){
        System.out.println("hello world!");
    }
}
