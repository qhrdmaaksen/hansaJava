package com.company;

public class DaemonThreadTest02 extends Thread{
    public void run() {
        System.out.println("독립 Thread Test02 시작");
        try {
            Thread.sleep(10000);
        }catch (Exception e){

        }
        System.out.println("독립 Thread Test02 종료");
    }
}
