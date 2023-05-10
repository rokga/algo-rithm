package main.LV1;

public class 소수찾기 {



    public int solution(int n) {
        int answer = 0;

        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                answer++;
            } else {
                continue;
            }
        }
        return answer;
    }

    static boolean isPrime(int n){
        for(int i= 2; i <= Math.sqrt(n); i++){
            if ( n % i == 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String args[]){

        소수찾기 A = new 소수찾기();


        System.out.println(A.solution(2));
        System.out.println(A.solution(10));
        System.out.println(A.solution(5));
        System.out.println(A.solution(1000000));

    }
}
