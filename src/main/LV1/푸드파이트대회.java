package main.LV1;

public class 푸드파이트대회 {

    public static void main(String[] args){
        int[] a = {1,3,4,6};
        int[] b = {1,7,1,2};
        System.out.println(solution(a));
        System.out.println(solution(b));

    }
    public static String solution(int[] food){

        StringBuilder sb = new StringBuilder();

        for(int i=1; i< food.length; i++){
            for(int j=0; j < food[i]/ 2; j++){
                sb.append(i);
            }
        }

        StringBuilder answer = new StringBuilder();

        answer.append(sb);
        answer.append(0);
        answer.append(sb.reverse());


        return answer.toString();
    }

}
