package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class ServerUDP_CommunicationTest {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(); //소켓 생성
        InetAddress ia = InetAddress.getByName(args[0]); //주소 생성
        int port = Integer.parseInt(args[1]); //포트번호

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("전송할 메세지를 입력하세요.(끝내려면 finish 입력");

        String buf ;
        do {
            buf = br.readLine(); //키보드로 부터 한 줄 입력
            byte buffer[] = buf.getBytes(StandardCharsets.UTF_8); //바이트 배열로 변환
            //패킷화
            DatagramPacket dp = new DatagramPacket(buffer, buffer.length,ia,port);
            ds.send(dp);//패킷을 소캣으로 전송
        } while (!buf.equals("finish"));

        ds.close();
    }
}
