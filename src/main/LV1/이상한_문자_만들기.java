package main.LV1;

public class 이상한_문자_만들기 {


    public String solution(String s ){
        String answer = "";
        String [] arr = s.split("");
        int idx = 0;

        for(int i=0; i< arr.length; i++){
            if(arr[i].equals(" ")){
                idx = 0;
                answer += " ";
            } else {
                idx ++;
                answer += idx % 2 == 0 ? arr[i].toLowerCase() : arr[i].toUpperCase();
            }

        }
        return  answer;
    }

    public static void main(String  args[]){
        이상한_문자_만들기 A = new 이상한_문자_만들기();
        String s = "try hello world";
        String s1 = "do not try this at home";


        System.out.println(A.solution(s));
        System.out.println(A.solution(s1));
    }

}
