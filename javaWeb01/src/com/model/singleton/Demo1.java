package com.model.singleton;

/**
 * @author kelvin
 * @date 2020/3/6 - 11:51
 */
// 饿汉式
public class Demo1 {

    private static Demo1 instance = new Demo1();

    private Demo1(){

    }

    public static Demo1 getInstance(){
        return instance;
    }
}
