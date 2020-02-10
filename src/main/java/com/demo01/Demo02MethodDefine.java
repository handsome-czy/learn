package com.demo01;

/*
参数：进入方法的数据
返回值：出来的数据

定义方法完整格式：
修饰符 返回值类型 方法名称（参数类型 参数名称，...）{
    方法体
    return 返回值；
}
 */
public class Demo02MethodDefine {
    public static void main(String[] args) {
        //单独调用
        sum(10, 20);
        System.out.println("----------");

        //打印调用
        System.out.println(sum(10, 20));
        System.out.println("----------");

        //赋值调用
        int number = sum(20, 20);
        number += 100;
        System.out.println("变量的值" + number);
    }

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }
}
