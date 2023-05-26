package main.LV0;

public class startsWith_endsWith {



    public static void main(String[] args){

        String a = "안녕하세요";
        System.out.println(a.startsWith("안")); //true

        System.out.println(a.endsWith("요"));  //true

        String b = " 오늘도 배가 고프다 ";

        System.out.println(b.startsWith("오")); //false
        System.out.println(b.startsWith(" ")); //true
        System.out.println(b.startsWith(" 오")); // true

        System.out.println(b.endsWith("다")); // false
        System.out.println(b.endsWith(" ")); // true
        System.out.println(b.endsWith("다 ")); // true



    }



}
