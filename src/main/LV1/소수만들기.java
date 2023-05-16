package main.LV1;

import java.util.Arrays;

public class 소수만들기 {


    public  int solution (int[]  nums){
         int answer = 0 ;


        for(int i=0; i < nums.length -2; i++){
            for(int j=i+1; j < nums.length -1; j++){
                for(int k=j+1; k < nums.length; k++){
                    if(isPrime(nums[i] + nums[j] + nums[k]))
                        answer ++;

                }
            }
        }

        return answer;
    }
    public boolean isPrime(int n) {
        for(int i= 2; i < n ; i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String args[]){

        소수만들기 A = new 소수만들기();

        int[] a = {1, 2, 3, 4};
        int[] a1 = {1,2,7,6,4};
        int[] a2 = {1,2,5,6,78,9,123,6,5,4,};


        System.out.println(A.solution(a));
        System.out.println(A.solution(a1));
        System.out.println(A.solution(a2));

    }


}
