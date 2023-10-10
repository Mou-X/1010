package com.ma.ma1010.test;

import java.util.Random;
import java.util.Scanner;

public class 猜数字游戏 {
    public static void main(String[] args) {

        guss();
    }
    public static void guss(){
        Random x = new Random();
        Scanner sc = new Scanner(System.in);

//      产生随机数
        int randomNumber = x.nextInt(101);




        while (true){
            //        输入随机数
            System.out.println("请输入数字");
            int scNumber = sc.nextInt();

//        提示循环

            if(scNumber > randomNumber){
                System.out.println("大了");
            }else if (scNumber < randomNumber){
                System.out.println("小了");
            }else if(scNumber == randomNumber){
                System.out.println("对了");
                break;
            }

        }
        System.out.println("========================================================================");
        System.out.println("6");



    }
}
