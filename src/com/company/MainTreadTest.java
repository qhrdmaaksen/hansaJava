package com.company;
/***
* main multi thread
**/
public class MainTreadTest {
    public static void main(String[] args) {
        //뉴 생성자 호출 후 문자열 (tick , tack) , 밀리초 ( 1000 ) , 반복 횟수 ( tick 3 , tack 2 ) 입력
        MultiThreadTest tick = new MultiThreadTest("tick",1000,3) ;
        MultiThreadTest tack = new MultiThreadTest("tack",1000,2);

        tick.start();//start method 실행 시 500 밀리초 만큼 쓰레드 대기
        try {
            Thread.sleep(500);
        }
        catch (Exception e){

        }
        tack.start();
        //tick 작업 후 tack 작업 진행 , tack 의 쓰레드 시간만큼 대기 후
        // 다시 남은 반복 횟수가 tick에 남아있기에 tick 작업 실행 후
        // 다시 tack 작업 진행.모든 작업의 반복 횟수 만큼 작업 완료 후 자동 종료
    }
}
