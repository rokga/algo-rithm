package main.LV0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 카운트_업 {



    public int[] solution(int start, int end){
        int[] answer = new int[end-start+1];

        for(int i=0; i < answer.length ; i++){
            answer[i] = start++;
        }
        return answer;

    }

    // 솔루션 2  - 배열
    public int[] solition2(int start, int end){
        List<Integer> answer = new ArrayList<>();
        for(int i=start ; i <= end ; i++){
            answer.add(i);
        }

        int[] arr = new int[answer.size()];
        for(int i=0; i < answer.size(); i++){
            arr[i] = answer.get(i).intValue();
        }
        return arr;
    }

  // 위에 문제는 배열로 바꿀 필요가 없고,, public List solution2   <<< 로 바꾸면 반복문을 사용하지 않아도 되는 부분이다.. ㅎ




    public static void main(String args[]){
        카운트_업 A = new 카운트_업();

        int s = 3;
        int e = 10;

        int s1 = 100;
        int e1 = 150;


        System.out.println(Arrays.toString(A.solution(s,e)));
        System.out.println(Arrays.toString(A.solution(s1,e1)));

    }
}
