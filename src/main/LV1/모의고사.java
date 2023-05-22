package main.LV1;

import java.util.ArrayList;
import java.util.Arrays;

public class 모의고사{


    public static int[] solution(int[] answers){
        int[] answer = new int[3];

        int[] p1 = new int[]{1, 2, 3, 4, 5};
        int[] p2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] cnt = new int[3];
         for(int i=0 ; i< answers.length; i++ ){
             if(answers[i] == p1[i % 5]){
                 cnt[0] ++;
             }
             if(answers[i] == p2[i % 8]){
                 cnt[1] ++;
             }
             if(answers[i] == p3[i % 10]){
                 cnt[2] ++;
             }
         }
        int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
        int idx = 0;
        for (int i = 0; i < 3; i++) {
            if (max == cnt[i]) {
                answer[idx++] = i + 1;
            }
        }

        answer = Arrays.copyOfRange(answer, 0, idx);

        return answer;

    }






    public static void main(String[] args){
        int[] a  = {1,2,3,4,5};
        int[] b  = {1,3,2,4,2};
        System.out.println(Arrays.toString(solution(a)));
        System.out.println(Arrays.toString(solution(b)));
    }
}

 // 완전 탐색 문제