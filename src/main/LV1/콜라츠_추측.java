package main.LV1;

public class 콜라츠_추측 {

    public static int solution(int num){
        int answer = 0;
        long n = num;

        while(true) {
            if (n == 1) break;
            answer++;
            if (n % 2 == 0)
                n /= 2;
            else
                n = n * 3 + 1;

            if (answer > 500)
                return -1;
        }
        return answer;

    }

    public static void main(String[] args){
        System.out.println(solution(6));
        System.out.println(solution(16));
        System.out.println(solution(626331));
    }
}

// long 타입 때문에 뻘짓한 문제ㅠㅠ