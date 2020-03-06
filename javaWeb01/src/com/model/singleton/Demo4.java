package com.model.singleton;

/**
 * @author kelvin
 * @date 2020/3/6 - 11:51
 */
// 双重校验
public class Demo4 {

    private volatile static Demo4 instance;

    private Demo4(){

    }

    public static Demo4 getInstance(){
        if (instance == null) {
            synchronized (Demo4.class){
                if (instance == null){
                    instance = new Demo4();
                }
            }
        }
        return instance;
    }

}
