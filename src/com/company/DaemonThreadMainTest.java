package com.company;

public class DaemonThreadMainTest {
    public static void main(String[] args) {
        System.out.println("메인 Thread 시작");

        DaemonThreadTest01 Test01 = new DaemonThreadTest01() ;
        DaemonThreadTest02 Test02 = new DaemonThreadTest02() ;

        Test01.setDaemon(true);//데몬스레드 실행
        Test02.setDaemon(false);//실행하지 않음

        Test01.start();
        Test02.start();

        try {
            Thread.sleep(500);//메인스레드 500 밀리초 만큼 현재 쓰레드 대기
        }catch (Exception e){

        }
        System.out.println("메인 Thread 종료");
    }
}
