package com.Thread;

public class ThreadStrata extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"FileIO");
        }
    }
}
