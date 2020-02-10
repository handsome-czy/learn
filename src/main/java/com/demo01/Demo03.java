package com.demo01;

public class Demo03 {
    public static void main(String[] args) {
        method1(10, 10);
        System.out.println("-----------");
        method2();

    }

    //两个数相乘，必须知道两个数各自是多少，否则无法计算
    //有参数
    public static void method1(int a, int b) {
        int result = a * b;
        System.out.println("结果是:" + result);
    }

    //例如固定打印10次文本字符串
    //无参数
    public static void method2() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello,World" + i);

        }
    }
}
