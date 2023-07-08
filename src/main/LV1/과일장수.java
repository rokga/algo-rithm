package main.LV1;

import java.util.Arrays;

public class 과일장수 {
    public static int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int answer = 0;

        for(int i=score.length; i>=m; i-= m ){
            answer += score[i-m] * m;
        }
        return answer;
    }

    public static void main(String[] args){
        int a = 3;
        int b = 4;
        int[] c = {1,2,3,1,2,3,1};

        int a1=4;
        int b1=3;
        int[] c1 = {4,1,2,2,4,4,4,4,1,2,4,2};


        System.out.println(solution(a,b,c));
        System.out.println(solution(a1,b1,c1));

    }
}
