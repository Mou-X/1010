package com.ma.ma1010.控制流程语句;

import java.util.Scanner;

public class 跳转控制语句 {
    public static void main(String[] args) {

        initMenu();
    }
//    break 结束循环
//    continue  跳过

//    break与continue下边都不能写代码，因为会跳过
    public static void initMenu(){

        Scanner sc = new Scanner(System.in);

        lo: //标号
        while (true){
            System.out.println("请输入选择：1：添加学生  2.删除学生  3.更改学生信息  4.查询学生  5.退出");

//        录入用户所输入信息
            int choice = sc.nextInt();


            switch (choice){
                case 1:
                    System.out.println("添加学生逻辑执行...");
                    break;
                case 2:
                    System.out.println("删除学生逻辑执行...");
                    break;
                case 3:
                    System.out.println("更改学生逻辑执行...");
                    break;
                case 4:
                    System.out.println("查询逻辑执行...");
                    break;
                case 5:
                    System.out.println("退出逻辑执行...");
                    break lo;
                default:
                    System.out.println("输入有误");
                    break;
            }
        }



    }
}
