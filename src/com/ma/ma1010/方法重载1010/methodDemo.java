package com.ma.ma1010.方法重载1010;

public class methodDemo {
    public static void main(String[] args) {
        eat();


//
        /*
        方法（函数）
        便于管理
        提高复用性

        方法与方法之间平级，不可嵌套
         */
    }


    /*
    public static void 方法名(){
        逻辑代码
    }

    方法名()（在main方法中调用}
     */
    public static void eat(){
        System.out.println("开始");
        System.out.println("饿了");
        System.out.println("饱了");

        int result = myMath(88, 99);
        System.out.println(result);
    }

    /*
    参数调用：
        让方法中使用的数据更加灵活

    返回值：
        我们会经常根据一个方法产出的结果，来组织另外一段代码逻辑，为了拿到这个方法产生的结果，
        就需要定义带有返回值的方法
        public static 数据类型 方法名(数据类型 变量名, 数据类型 变量名){
        return 数据值
        }
     */
    public static int myMath(int a, int b){
        int c = a + b;
        return c;



    }




}
