# 方法

## 方法的定义与调用
 方法：若干语句的功能集合

> 1. 参数： （原料）；进入方法的数据       			2.返回值（产出物）；从方法中出来的数据
>
> 3. 定义完整格式：修饰符 返回值类型 方法名称（参数类型 参数名称....）{
>
> 方法体
>
> return(返回值)；
>
> }
>
> 4. 修饰符：现阶段固定写法，public  static
>
> 5. 返回值类型：方法最终产生的数据结果是什么类型
>
> 6. 方法名称：方法的名字（小驼峰）
>
> 7.  参数类型：进入数据类型
>
> 8. 参数名称：进入方法数据对应名称（多个用逗号隔开）
>
> 9. return：第一：停止当前方法，第二：将后面的结果返回调用出（后面的返回值，必须和方法名称前面的返回值类型保持对应）
>
10. 方法的调用：
>
> ```
> public class Demo02MethodDefine {
>     public static void main(String[] args) {
>         //单独调用
>         sum(10, 20);
>         System.out.println("----------");
> 
>         //打印调用
>         System.out.println(sum(10, 20));
>         System.out.println("----------");
> 
>         //赋值调用
>         int number = sum(20, 20);
>         number += 100;
>         System.out.println("变量的值" + number);
>     }
> 
>     public static int sum(int a, int b) {
>         int result = a + b;
>         return result;
>     }
> }
> ```
