package com.Thread;

public class TestThread {
    public static void main(String[] args) {
//        第一种方法：继承Thread
//        ThreadStrata threadStrata1 = new ThreadStrata();
//        ThreadStrata threadStrata2 = new ThreadStrata();
//
//        threadStrata1.setName("111");
//        threadStrata2.setName("222");
//
//        threadStrata1.start();
//        threadStrata2.start();


        ThreadRunnable t1 = new ThreadRunnable();
        ThreadRunnable t2 = new ThreadRunnable();

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.setPriority(1);
        thread2.setPriority(10);

        thread1.setName("111");
        thread2.setName("222");

        thread1.start();
        thread2.start();
    }
}
