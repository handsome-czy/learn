package com.demo03;
/*
对于功能类似的方法来说，因为参数列表不一样，却需要记住那么多不同的方法名称，太麻烦

方法重载（Overlood）多个方法名一样，但参数列表不同
好处：只需要记住唯一一个方法名称，就可以实现多个类似功能

相关因素：
1.参数个数不同
2.参数类型不同
3.参数多类型的顺序不同
 */
public class Demo01MethodOverload {
    public static void main(String[] args) {
//        System.out.println(sumOne(10, 10));
//        System.out.println(sumTwo(10, 10, 10));
//        System.out.println(sumThere(10, 10, 10, 10));
        System.out.println(sum(10,20));

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
