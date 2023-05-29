package main.LV1;

public class 옹알이2 {

    public static void main(String[] args){

        String[] a = new String[]{"aya", "yee", "u", "maa"};
        String[] b = new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        System.out.println(solution(a));
        System.out.println(solution(b));
    }


    //   처음에 "" 로 변경했다가, 오류가 생겼다.
    //    만약에 "mamao" 라는 단어를 바꾸면 "o" 로 단어로 인식을 해서 틀렸다고 함.
    //  그래서 .  으로 변경한 후 > 다시 ""로 변경을 하고, 그 이후에 "" 와 같은 값을 찾아 answer을 ++ 한다.

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


