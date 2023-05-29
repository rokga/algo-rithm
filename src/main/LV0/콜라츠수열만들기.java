package main.LV0;

import java.util.ArrayList;
import java.util.Arrays;

public class 콜라츠수열만들기 {

    public static void main(String[] args){

        System.out.println(Arrays.toString(solution(10)));
    }
    public static int[] solution(int n){
        ArrayList<Integer> list =new ArrayList<>();
        list.add(n);
        while (n != 1){
            if(n % 2 == 0){
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            list.add(n);
        }

        int[] answer = new int[list.size()];
        for(int i=0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
