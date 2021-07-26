package com.company;

public class RunnableThreadMainTest {
    public static void main(String[] args) {
        //RunnableThreadTest 클래스 tick객체 생성 및 인수 문자열 tick , 1000밀리초,3회 count 입력
        RunnableThreadTest tick = new RunnableThreadTest("tick",1000,3);
        RunnableThreadTest tack = new RunnableThreadTest("tack",1000,2);
        //Thread 클래스 tickThread 객체 생성 및 인수는 위에서 만든 객체 tick 넣어줌
        Thread tickThread = new Thread(tick);
        Thread tackThread = new Thread(tack);

        tickThread.start();
        try {
            Thread.sleep(500);// 500 밀리초 만큼 쓰레드 대기
        }catch (Exception e){
            //예외 발생시 예외 출력
        }
        tackThread.start();
    }
}
