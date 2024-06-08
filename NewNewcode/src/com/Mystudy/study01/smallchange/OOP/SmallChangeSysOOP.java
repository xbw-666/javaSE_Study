package com.Mystudy.study01.smallchange.OOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOOP {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";
    String details = "-------------------零钱通明细------------------\n";
    double money = 0;
    double balance = 0;
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  //String note = "";
    public void mainMenu(){
        do{
            System.out.println("-------------------零钱通系统-");
            System.out.println("1.收入");
            System.out.println("2.支出");
            System.out.println("3.明细");
            System.out.println("4.退出");
            System.out.println("请输入选项：");
            key = scanner.next();
            switch (key){
                case "1":
                    income();
                    break;
                case "2":
                    outcome();
                    break;
                case "3":
                    detail();
                    break;
                case "4":
                    exit();
                    break;
                default:
                    System.out.println("输入错误！");
                    break;
            }
        }while(loop);
    }
    public void detail(){
        System.out.println(details);
    }

    public void income(){
        System.out.println("请输入收入金额：");
        money = scanner.nextDouble();
        if(money <= 0){
            System.out.println("收入金额必须大于0！");
            return;
        }
        date = new Date();
        balance += money;
        details += "\n收益入账\t" + sdf.format(date) + " 收入 " + money + " 元\n" + "\t余额" + balance + " 元";
    }

    public void outcome(){
         System.out.println("请输入支出金额：");
         money = scanner.nextDouble();
         if(money <= 0 || money > balance){
             System.out.println("支出金额必须大于0！");
             return;
         }
         date = new Date();
         balance -= money;
         details += "\n支出\t" + sdf.format(date) + " 支出 " + money + " 元\n" + "\t余额" + balance + " 元";
    }
    public void exit(){
        String choice;
        while(loop){
            System.out.println("你确定要退出么？(y/n)");
            choice = scanner.next();
            if(choice.equals("y")) {
                loop = false;
                return;
            }
            else if(choice.equals("n")) {
                return;
            }
            else{
                System.out.println("输入错误！");
            }
        }

    }
}
