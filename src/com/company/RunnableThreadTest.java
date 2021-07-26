package com.company;

public class RunnableThreadTest implements Runnable {
    private String word ;
    private int time ;
    private int count ;

    public RunnableThreadTest(String w, int t, int c) {//생성자
        this.word = w;
        this.time = t;
        this.count = c;
    }
    public void run(){
        for (int n = 0 ; n < count ; n++){//int i 는 0 이며 , count 가 i 보다 낮을 때까지 i 는 1씩 늘어난다.
            System.out.println(word);//넘겨온 문자열을 count 만큼 출력

            try {
                Thread.sleep(time);// time (밀리초) 만큼 현재 쓰레드 대기
            }catch (Exception e){
                //예외 발생시 예외 출력
            }
        }
    }
}
