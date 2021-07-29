package com.company;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

class ServerTCP_CommunicationTest {
    public static void main(String args[]) throws IOException {
        int port = Integer.parseInt(args[0]) ;
        //서버 소켓 객체 생성
        ServerSocket serverSocket = new ServerSocket(port) ;

        System.out.println("서버 실행중 !");
        while (true){
            //연결수락 , 클라이언트 소켓 객체 생성
            Socket clientSocket = serverSocket.accept();
            //소켓 출력 스트림 생성
            OutputStream Ostream = clientSocket.getOutputStream();
            //스트림 변환
            DataOutputStream DOstream = new DataOutputStream(Ostream);

            for (int imsg = 1; imsg <= 5; imsg++)
                //데이터 전송
                DOstream.writeInt(imsg);
                //소켓 닫기
            clientSocket.close();
        }
    }
}
