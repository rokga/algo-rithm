package main.LV0;

import java.util.Arrays;

public class 수열과_구간_쿼리4 {

    public int[] solution(int[] arr, int[][] queries) {
        for(int[] query : queries){
            int s = query[0];
            int e = query[1];
            int k = query[2];

            for(int i=0; i< arr.length; i++){
                if( s <= i && i <= e && i % k == 0){
                    arr[i] += 1;
                }
            }
        }

        return arr;
    }

    public static void main(String args[]){

        수열과_구간_쿼리4 A = new 수열과_구간_쿼리4();
        int[] arr = {0,1,2,4,3};
        int[][] queries = {{0,4,1},{0,3,2},{0,3,3}};

        System.out.println(Arrays.toString(A.solution(arr,queries)));


    }

}
