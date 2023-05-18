package main.LV1;

public class 음양더하기 {

    public static int solution(int[] absolutes, boolean[] signs){
        int answer = 0;
        for(int i = 0 ; i < absolutes.length; i++) {
            if(signs[i]){
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        return answer;
    }
// 아래는 삼항연산자로 바꾸기
    public static int solution2(int[] absolutes, boolean[] signs){
        int answer = 0;
        for(int i = 0 ; i < absolutes.length; i++) {
         answer += (signs[i]) ? absolutes[i] :  -absolutes[i];
        }
        return answer;
    }



    public static void main(String[] args){

        int[] a = {4,7,12};
        boolean[] b = {true,false,true};
        System.out.println(solution(a,b));

        System.out.println(solution2(a,b));

    }
}
