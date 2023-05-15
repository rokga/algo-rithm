package main.LV1;

public class 시저암호 {


    public String solution(String s, int n) {
        String answer ="" ;
        for(int i=0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isLowerCase(ch)) {
                ch = (char)((ch-'a'+ n ) % 26 + 'a');   // 대
            } else if (Character.isUpperCase(ch)) {
                ch = (char)((ch-'A'+ n ) % 26 + 'A');  // 소
            }
            answer += ch;
        }
        return  answer ;
    }


    public static void main(String args[]){

        시저암호 A = new 시저암호();
        String s1 = "AB";
        String s2 = "z";
        String s3 = "a B z";
        int n1 = 1;
        int n2 = 1;
        int n3 = 4;


        System.out.println(A.solution(s1,n1));
        System.out.println(A.solution(s2,n2));
        System.out.println(A.solution(s3,n3));

    }
}


// 아스키 코드때문에 고민한다고 반나절은 걸린거같다.