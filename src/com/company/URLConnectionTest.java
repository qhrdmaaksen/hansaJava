package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class URLConnectionTest {
    public static void main(String[] args) throws IOException {
        URL naver = new URL("http://www.naver.com/") ;
        URLConnection naverOn = naver.openConnection() ;

        System.out.println("문서의 타입 : " + naverOn.getContentType());
        System.out.println("문서의 최종 수정 일자 : " + new Date(naverOn.getLastModified()));

        System.out.println("문서 내용 : ");
        InputStream input = naverOn.getInputStream();

        int i = 500 ;
        int c ;
        while (((c = input.read()) != -1) && (--i > 0)){
            System.out.print((char)c);
        }
        input.close();
    }
}
