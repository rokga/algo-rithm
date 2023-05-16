package main.LV1;

import java.util.Arrays;

public class 최대공약수와_최소공배수 {

    public int[] solution (int n, int m){
        int[] answer = new int [2];

        int a = Math.max(n,m);
        int b = Math.max(n,m);

        answer[0] = getGCD(n,m);
        answer[1] = lcm(n,m);

    return answer;

    }

    public static int getGCD(int n , int m){
        if( n % m == 0) {
            return m;
        }
        return getGCD(m , n % m);
    }

    static int lcm(int n, int m){
        return n*m / getGCD(n,m);
    }


    public static void main(String args[]){
        최대공약수와_최소공배수 A = new 최대공약수와_최소공배수();


        int n = 3;
        int m = 12;
        int n1 = 2;
        int m1 = 5;

        System.out.println(Arrays.toString(A.solution(n,m)));
        System.out.println(Arrays.toString(A.solution(n1,m1)));
    }
}
