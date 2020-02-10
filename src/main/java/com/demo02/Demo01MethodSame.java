package com.demo02;
/*
题目要求：
判断两个数是否相同
 */
public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(x(10,20));
        System.out.println("-------");
        System.out.println(x(10,10));

    }

    public static boolean x(int a, int b) {
//        boolean some;
//        if (a==b){
//            some=true;
//        }else {
//            some=false;
//        }
//        boolean some = a == b ? true : false;
//        boolean some = a == b;
        return a==b;
    }
}
