package com.company;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ClientUDP_CommunicationTest {
    public static void main(String[] args) throws IOException {
        int port = Integer.parseInt(args[0]);
        //client 1번 수행
        DatagramSocket ds = new DatagramSocket(port);
        String q ;
        do{
            byte buffer[] = new byte[60];
            //client 2번 수행
            DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
            //client 3번 수행
            ds.receive(dp); //패킷 수신
            String msg = new String(dp.getData()) ;//바이트 배열을 문자열로 변환
            System.out.println("수신 메세지 : " + msg);

            q = msg.substring(0,3);
        }while (!q.equals("finish"));
        //client 4번 수행
        ds.close(); //소켓 닫음
    }
}
