package main.LV1;

import java.util.ArrayList;
import java.util.Stack;

public class 햄버거만들기 {

    public static void main(String[] args){
        int[] a = {2,1,1,2,3,1,2,3,1};
        int[] b = {1,3,2,1,2,1,3,1,2};
        int []c = {1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1};

        System.out.println(solution2(a));
        System.out.println(solution2(b));
        System.out.println(solution2(c));
    }

    //   for 문을 이용해서  우선 스택에 ingerdient 의 모든 값을 스택에 쌓는다.
    //   길이가 4이상 이어야 햄버거가 완성되니까 길이가 4보다 큰값 의 조건과 ,
    //   순서쌍이 1,2,3,1 이 되어야 햄버거가 완성되는 값이니까
    //   스텍에서 1231 의 순서값이 완성된다면 answer 값을 +1 하고, 스택에 해당되는 값을 pop()을 통해 제거한다.


    // ArrayList 로도 값을 구해봐야지 .
    public static int solution2(int[] ingredient){
        int answer =0;
        Stack<Integer> kingburger = new Stack<>();
        for(int i=0; i < ingredient.length; i++) {
            kingburger.push(ingredient[i]);
            if (kingburger.size() >= 4) {
                if (kingburger.get(kingburger.size() - 1) == 1 &&
                        kingburger.get(kingburger.size() - 4) == 1 &&
                        kingburger.get(kingburger.size() - 3) == 2 &&
                        kingburger.get(kingburger.size() - 2) == 3) {
                    answer += 1;
                    kingburger.pop();
                    kingburger.pop();
                    kingburger.pop();
                    kingburger.pop();

                }
            }
        }
        return answer;
    }
}
