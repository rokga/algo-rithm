package main.LV1;

import java.util.Arrays;
import java.util.Collections;

public class 문자열_내림차순으로_배치하기 {

        public String solution(String s) {
            Character[] arr = new Character[s.length()];

            for(int i=0 ; i < s.length(); i++){
                arr[i] = s.charAt(i);
            }
            Arrays.sort(arr, Collections.reverseOrder());

            StringBuffer sb = new StringBuffer();
            for( Character a : arr){
                sb.append(a) ;
            }



            return sb.toString();
        }
        // StringBuffer 를 사용했는데 - 하나의 작업만 처리하는 클레스라면 StringBuffer 보다 StringBuilder 가 더 빠르다.

    public static void main(String[] args){
        문자열_내림차순으로_배치하기 A = new 문자열_내림차순으로_배치하기();

        String a = "Zbcdefg";
        String b = "AqweCfg";


        System.out.println(A.solution(a));
        System.out.println(A.solution(b));
    }


}
