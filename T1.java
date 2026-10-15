package com.lingrui.question.T1;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        long money = 0;
        long moneyin;
        long moneyout;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1.存款");
            System.out.println("2.取款");
            System.out.println("3.查询余额");
            System.out.println("4.退出");
            System.out.println("请输入你要进行的操作：");
            int state = sc.nextInt();
            switch (state) {
                case 1:
                    while (true){
                        System.out.println("请输入你的存款金额：");
                        moneyin = sc.nextLong();
                        if(moneyin <= 0){
                            System.out.println("请输入正确的取款金额！");
                        } else {
                            money = money + moneyin;
                            System.out.println("当前余额为：" + money);
                            break;
                        }
                    }
                    break;
                case 2:
                    while (true){
                        System.out.println("请输入你的取款金额：");
                        moneyout = sc.nextLong();
                        if(moneyout > money){
                            System.out.println("余额不足");
                        } else {
                            money = money - moneyout;
                            System.out.println("当前余额为：" + money);
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("你的余额为：" + money);
                    break;
                case 4:
                    System.out.println("谢谢使用！");
                    return;
                default:
                    System.out.println("请输入正确的操作！");
                    break;
            }
        }
    }
}
