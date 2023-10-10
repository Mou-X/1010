package com.ma.ma1010.方法重载1010;

public class 类型转换 {
    public static void main(String[] args) {

                /*
        类型转换-隐式转换
        取值范围小的小给大，直接给

        数据类型取值范围从小到大：
            byte-short-int-long-float-double
            虽然float占用四个字节，但是取值范围比8个字节的long要大
            原因：小鼠的二进制存储i形式更加节省空间
                 */
        int a = 10;
        double b = a;

        System.out.println(b);
/*
        运算过程中的隐式转换
        取值范围小的数据类型和取值范围大的数据类型计算，小的会先将自己转换为大的数据类型之后再计算
        例如int先将自己转换为double再计算
 */
        double c = 1.4;
        int d = 1;
        System.out.println(c + d);


   /*
   byte,short,char这三种数据类型会直接转换为int，再计算
    */
        byte aa = 10;
        byte bb = 20;
//      byte cc = aa + bb 报错
        int cc = aa + bb;
        System.out.println(cc);


//        强制转换
        double e = 13.3;
        int f = (int)e;
        System.out.println(f);
//        f = 12
//        强制转换 有可能出现 精度损失

        int num1 = 130;
        byte num2 = (byte) num1;
        System.out.println(num2);
//        -126
    }
}
