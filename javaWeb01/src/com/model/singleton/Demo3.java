package com.model.singleton;

/**
 * @author kelvin
 * @date 2020/3/6 - 11:51
 */
// 枚举
public enum Demo3 {

    INSTANCE;

    public void say(){
        System.out.println("---enum实例---");
    }

}
