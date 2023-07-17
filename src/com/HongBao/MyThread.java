package com.HongBao;

import java.util.Random;

public class MyThread extends Thread {
//一个红包100块钱，可以抢三次

//    定义红包金额
    static double money = 100;
    static int count = 3;

//    最小中将金额
    static final double MIN = 0.01;

    @Override
    public void run() {
//        同步代码块
        synchronized (MyThread.class){
//            如果抢完了就直接打印信息
            if (count == 0){
                System.out.println(getName()+"没有强到！");
            }else {
//                如果还有红包得判断是不是最后一个
//                 因为最后一个不是随机数，而是剩下红包的全部金额
                double prize = 0;
                if (count == 1){

                }else {
//                    最少要抽到最小值
                    Random random = new Random();
                    double x = money-(count-1)*MIN;
                    prize = random.nextDouble();
                }
            }
        }
    }
}
