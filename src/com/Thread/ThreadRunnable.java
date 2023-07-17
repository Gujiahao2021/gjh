package com.Thread;

public class ThreadRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName()+"张欣");
        }
    }
}
