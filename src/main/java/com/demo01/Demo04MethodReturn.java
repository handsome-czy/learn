package com.demo01;

public class Demo04MethodReturn {
    public static void main(String[] args) {
        int num=getSum(10,10);
        System.out.println("返回值"+num);
        System.out.println("--------");

        prinSum(100,100);

    }
    //我是一个方法 我负责两个数相加。
    //我有返回值int，谁调用我，我就把计算结果告诉谁
    public static int getSum(int a,int b){
        int result=a+b;
        return result;
    }
    //无返回值，直接打印输出(只能单独调用)
    public static void prinSum(int a,int b){
        int result=a+b;
        System.out.println("结果是"+result);
    }
}
