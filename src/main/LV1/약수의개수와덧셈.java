package main.LV1;



public class 약수의개수와덧셈 {


    // 테스트 케이스의값을 넣었더니, 음수값이 나와서 잠깐 당황했다 ㅎ,ㅎ
    // 다시 생각해보니 cnt 의 값을 외부에서 선언해줘서 초기화 되지 않고 계속 돌아가서 값이 오류가 났다.

    // 다른

    public static void main(String[] args){
        System.out.println(solution(13,17));
        System.out.println(solution(24,27));
        System.out.println(solution2(13,17));
        System.out.println(solution2(24,27));
    }

    public static int solution(int left , int right){
        int answer = 0;

        for( int i= left ; i <= right ; i++){
            int cnt = 0;
            for( int j = 1 ; j <= i ; j++){
                if ( i % j == 0){
                    cnt ++;
                }
            }
            if( cnt % 2 == 0 ) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
    //   Math.sqrt() 를 사용해서 제곱근이 정수로 나누어 떨어진다면 i 는 완전 제곱수 이므로
    //    answer 에서 i를 뺀다.  >> 완전 제곱수는 약수의 개수가 홀수 이기 때문에
    public static int solution2(int left, int right) {
        int answer = 0;
        for(int i = left ; i <= right ; i++) {
            double a = Math.sqrt(i);
            if(a%1 == 0) answer -= i;
            else answer += i;
        }
        return answer;
    }
}

