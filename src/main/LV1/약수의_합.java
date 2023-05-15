package main.LV1;

public class 약수의_합 {

    public int solution(int n){
        int answer =0;

        for(int i=1 ; i <= n ; i++){
            if(n % i == 0){
                answer += i;
            }
        }
    return answer;

    }


    public static void main(String args[]){
        약수의_합 A = new 약수의_합();


        int a  = 100;
        int a1 = 1000;
        int a2 = 3000;

        System.out.println(A.solution(a));
        System.out.println(A.solution(a1));
        System.out.println(A.solution(a2));
    }


    //** 다른 사람의 풀이중에 조금 신기한 부분이 있어서 가저옴.

//    public int sumDivisor(int num) {
//        int answer = 0;
//        for(int i =1 ; i<=num/2;i++){
//            if(num%i==0){
//                answer+=i;}}
//
//
//        return answer+num;
//    }

    // i 값에  num / 2  값을 넣어주면 기존에의 절반 값만 돌려서 매우 효율적으로 된다.
    // 기존에는 3000이하의 조건 이지만 1억 이된다면 1억번을 연산 >> 5천만번의 연산으로 줄일수 있다!


}

