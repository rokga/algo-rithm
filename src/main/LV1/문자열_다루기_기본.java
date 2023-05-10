package main.LV1;

public class 문자열_다루기_기본 {


        public boolean solution(String s) {
                boolean answer = true;

                if(s.length() != 4 && s.length() != 6){
                        return false ;
                }
                for(int i=0 ; i< s.length(); i++){
                        if(!Character.isDigit(s.charAt(i))){
                                return false;
                        }
                }
                return answer;
        }

        public static void main(String arg[]){
                문자열_다루기_기본 A = new 문자열_다루기_기본();


                System.out.println(A.solution("1234"));       // true
                System.out.println(A.solution("a234"));       // false
                System.out.println(A.solution("b234"));       // false
                System.out.println(A.solution("a1s234"));     // false
                System.out.println(A.solution("123726"));     // true
        }



}
