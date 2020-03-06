package com.model.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author kelvin
 * @date 2020/3/6 - 11:51
 */
// 懒汉式
public class Demo2 implements Serializable {

    private static Demo2 instance;

    private Demo2(){
        if (instance != null) {
            throw new RuntimeException();
        }
    }

    public static synchronized Demo2 getInstance(){
        if (instance == null) {
            instance = new Demo2();
        }
        return instance;
    }

    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
