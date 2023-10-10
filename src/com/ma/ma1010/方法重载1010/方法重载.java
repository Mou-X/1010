package com.ma.ma1010.方法重载1010;

public class 方法重载 {
    public static void main(String[] args) {

        int method = add(1, 3, 4);
//        int method = add(3, 4);
    }

    /*
    方法的名字相同，参数不同（个数，类型，顺序）是可以的，
    方法的名字相同，参数也相同是不可以的
    方法名相同时，主要看调用方法的参数,但调用方法不能同名
    这就是重载：在一个类中，定义了多个同名方法，但每个方法的参数是不同的，这些同名方法就构成了重载关系。
    判断重载关系只看方法名，与返回值无关
     public static int add(int a, int b){
        return a + b;
    }
    public static void add(int a, int b){
        return a + b;
    }
    以上两个方法不是重载

    重载的好处：不用记住繁琐的方法名
     */

    public static int add(int a, int b){
        return a + b;
    }

    public static int add(int a, int b, int c){
        return a + b + c;
    }
}
