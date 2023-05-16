package main.LV1;

import java.util.Arrays;

public class 예산 {


    public int solution(int[] d , int budget){
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);

        for(int i=0 ; i < d.length; i++){
            sum += d[i];

            if(sum > budget) {
                answer = i;
                return answer;
            }

        }
        if( sum <= budget)
            answer = d.length;

            return answer;


    }


    public static void main(String args[]){
        예산 A = new 예산();

        int[] d = {1,3,2,5,4};
        int b = 9;

        int[] d1 = {2,2,3,3,};
        int b1 = 10;

        int[] d2 = {4,3,2,5,4};
        int b2 = 12;


        System.out.println(A.solution(d,b));
        System.out.println(A.solution(d1,b1));
        System.out.println(A.solution(d2,b2));
    }
}
