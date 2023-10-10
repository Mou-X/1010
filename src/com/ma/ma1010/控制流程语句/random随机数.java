package com.ma.ma1010.控制流程语句;

import java.util.Random;

public class random随机数 {
    public static void main(String[] args) {
        randomTest();
    }
    /*
    random产生随机数
     */

    public static void randomTest(){
        Random r = new Random();

        for (int i = 0; i <= 20; i++){
            int num = r.nextInt(101);
            System.out.println(num);
        }

    }
}
