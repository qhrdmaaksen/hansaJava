package com.company;

public class MultiThreadTest extends Thread{
    private String word ;
    private int time ;
    private int count ;

    /**
     * construct
     * */
    public MultiThreadTest(String w , int t , int c){
        word = w ;
        time = t ;
        count = c ;
    }
    /***
     * start method execute
     * */
    public void run(){
        for(int n = 0 ; n < count ; n++){
            System.out.println(word);

            try {
                //time 밀리초 만큼 현재 쓰레드 대기
                Thread.sleep(time);
            }
            catch (Exception e){

            }
        }
    }
}
