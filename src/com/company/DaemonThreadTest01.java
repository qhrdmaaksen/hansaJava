package com.company;

public class DaemonThreadTest01 extends Thread{
    public void run(){
        System.out.println("DaemonThread 데몬Test01 시작");
        try {
            Thread.sleep(700);//10000 밀리초 현재 스레드 대기
        }catch (Exception e){

        }
        System.out.println("DaemonThread 데몬Test01 종료");
    }
}
