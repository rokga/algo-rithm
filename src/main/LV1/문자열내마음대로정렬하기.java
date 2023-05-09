package main.LV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 문자열내마음대로정렬하기 {

        public String[] solution(String[] strings,int n) {
            String[] answer = new String[strings.length];

            ArrayList<String> list = new ArrayList<>();

            for(int i=0 ; i < strings.length ; i++){
                list.add(strings[i].charAt(n)+strings[i]);
                Collections.sort(list);
            }
            for(int i=0; i<list.size(); i ++){
                answer[i] = list.get(i).substring(1);
            }


            return answer;
        }

        // ArrayList 첫글자 + 문자열을 List에 추가
        // ex) 정렬 전 : asun , ebed, acar 정렬 후 : acar, asun, ebed

 public static void main(String[] args){
        문자열내마음대로정렬하기 B = new 문자열내마음대로정렬하기();

        String[] t1 = {"sun","bed","car"};
        int n1 = 1 ;

        String[] t2 = {"abce","abcd","cdx"};
        int n2 = 2 ;

     System.out.println(Arrays.toString(B.solution(t1,n1)));
     System.out.println(Arrays.toString(B.solution(t2,n2)));



 }



}
