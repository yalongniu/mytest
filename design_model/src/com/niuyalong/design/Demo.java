package com.niuyalong.design;

/**
 * @author niuyalong
 * @version v1.0
 * @date 2019/6/3 20:32
 * @description TODO
 */
public class Demo {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();

        System.out.println(singleton.toString());

        Singleton singleton1 = Singleton.getSingleton();

        System.out.println(singleton1);
    }
}
