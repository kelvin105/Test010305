package com.model.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author kelvin
 * @date 2020/3/6 - 12:00
 */
public class Client1 {

    public static void main(String[] args) throws Exception {

        Demo2 d1 = Demo2.getInstance();
        Demo2 d2 = Demo2.getInstance();
        System.out.println(d1);
        System.out.println(d2);

//        System.out.println("--反射--");
        /*使用反射来破解单列模式*/
        // 解决方式：在对应类中的私有构造方法中添加对单实例对象的非空判断
//        Class<?> clazz = Class.forName("com.model.singleton.Demo2");
//        Constructor<?> c = clazz.getDeclaredConstructor(null);
//        c.setAccessible(true);
//        Demo2 d3 = (Demo2) c.newInstance();
//        System.out.println(d3);

        System.out.println("---序列化---");
        /*序列化的方式来破解单例模式*/
        // 序列化
        FileOutputStream fos = new FileOutputStream("d:/a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);
        oos.close();
        fos.close();

        // 反序列化
        FileInputStream fis = new FileInputStream("d:/a.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Demo2 d4 = (Demo2) ois.readObject();
        System.out.println(d4);

    }
}
