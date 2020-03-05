package com.test;

//import com.test.controller.Customer;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author kelvin
 * @date 2020/3/5 - 16:59
 */
public class Hello01 {

    public static void main(String[] args) {

//  将不需要的引用注释掉
//        Customer c = new Customer();

        System.out.println("a");
        System.out.println("a");
        System.out.println("a");

        Date date = new Date();


        ArrayList<Object> list = new ArrayList<>();
list.add(1);
list.add(2);
list.add(3);
list.add(4);

        for (Object o : list) {
            
        }

        for (int i = 0; i < list.size(); i++) {
            
        }

        for (int i = list.size() - 1; i >= 0; i--) {

        }

        if (list == null) {

        }

        if (list != null) {

        }

        if (list == null) {

        }
        if (list != null) {

        }

        if (list == null) {

        }



        System.out.printf("f");
        System.err.println("err");

        System.out.println("args = [" + args + "]");

        System.out.println("Hello01.main");

        String[] arr= {"a,","b","c"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[1]);
        }

        for (String str : arr) {
            System.out.println(arr[0]);
        }

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println("s = " + s);
        }

    }
    
    public void method(){
        System.out.println("\"ss\" = " + "ss");
        System.out.println("Hello01.method");
    }

    private static final int a = 90;

    public static final int b=0;

    public static final int c=0;
    public static final String s = "";

}
