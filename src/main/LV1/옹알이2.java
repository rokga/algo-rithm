package main.LV1;

public class 옹알이2 {

    public static void main(String[] args){

        String[] a = new String[]{"aya", "yee", "u", "maa"};
        String[] b = new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        System.out.println(solution(a));
        System.out.println(solution(b));
    }




    public static int solution(String[] babbling){
       int answer = 0;

        for (String s : babbling) {
            if (!s.contains("ayaaya")&&s.contains("aya")) {
                s = s.replace("aya", ".");
            }
            if (!s.contains("yeye")&&s.contains("ye")) {
                s = s.replace("ye", ".");
            }
            if (!s.contains("woowoo")&&s.contains("woo")) {
                s = s.replace("woo", ".");
            }
            if (!s.contains("mama")&&s.contains("ma")) {
                s = s.replace("ma", ".");
            }
            s = s.replace(".", "");
            if (s.equals("")) {

                answer++;

            }
        }
        return answer;
    }


        }


