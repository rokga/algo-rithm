package main.알고리즘;


//그리디 탐욕법 알고리즘
//어떤 문제에 대해서 탐욕적으로 즉 "현재 상황에서 지금 당장 좋은 것만 고르는 방법" 으로 문제를 해결하는 방법

// 1.거스름돈 문제
//    마트에서 계산하는 점원이 되었다.
//    손님에게 거슬러줘야할 돈이 N 원 일 때 거슬러줘야 할 동전의 최소 개수를 구하라.
//    이때 거스름돈으로 사용할 동전은 500원,100원,50원,10원으로 무한히 존재하고, N 은 10의 배수로 가정한다.

// 2. 1이 될떄 까지
//  N이 1이 될때까지 둘 중 하나를 선택해서 반복 수행.
//어떠한 수 N이 1이 될 때까지 다음의 두 과정 중 하나를 반복적으로 선택하여 수행하려고 한다.
//        단, 두 번째 연산은 N이 K로 나누어 떨어질 때만 선택할 수 있다.



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 그리디알고리즘 {
    public static void main(String[] args){
        System.out.println(solution(1460));
        System.out.println(solution(1890));
        System.out.println(solution2(25,5));
        System.out.println(solution2(30,10));


    }
    public static int solution(int n){
        int answer = 0;
        int coins[] = {500 , 100 ,50 , 10};

        for (int i=0 ; i< coins.length; i ++){
            answer += (n / coins[i]);
            n %= coins[i];

        }
        return answer;

    }

    public static int solution2(int n , int k){
        int resultCnt = 0;

        while(n != 1){
            if(n % k == 0){
                n /= k;
                resultCnt++;
            } else {
                n --;
            }
        }
        return resultCnt;
    }


}
