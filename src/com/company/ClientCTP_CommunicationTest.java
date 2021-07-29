package com.company;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ClientCTP_CommunicationTest {
    public static void main(String[] args) throws IOException {
        String server = args[0];
        int port = Integer.parseInt(args[1]);
        //클라이언트 소켓 객체 생성 ( 서버에 연결 요청 )
        Socket clientSocket = new Socket(server, port);
        //소켓 입력 스트림 객체 생성
        InputStream Istream = clientSocket.getInputStream();
        //스트림 변환
        DataInputStream DIstream = new DataInputStream(Istream);

        for (int i = 1; i <= 5; i++){
            //데이터 수신
            int imsg = DIstream.readInt();
            System.out.println("서버로부터 받은 데이터 : " + imsg);
        }
        // 소켓 닫음
        clientSocket.close();
    }

}
