package com.company;

import java.util.ArrayList;
import java.util.Collections;


/***
 * test
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList <String> alist = new ArrayList <String> () ;//ArrayList class object new constructor create
        String a = "A" , b = "B" , c = "C" ; // String a in substitute capital letter the "A" and b="B" , c="C"

        String d = "X" ; //String d in substitute capital letter the "X"

        alist.add(a) ;//object alist in add String the a
        alist.add(b) ;//object alist in add String the b
        alist.add(c) ;//object alist in add String the c
        System.out.println(alist);//print object alist

        alist.add(2 , d) ;//객체 alist 에 add 메소드로 2번째 요소에 d를 추가
        System.out.println(alist);//출력, 객체 alist

        Collections.sort(alist);//컬렉션 클래스에 sort 메소드로 크기 순서대로 정렬
        System.out.println(alist);//출력, alist
    }
}
