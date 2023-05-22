package main.LV1;

import java.util.Arrays;

public class 체육복 {


    //제한사항
    //전체 학생의 수는 2명 이상 30명 이하입니다.
    //체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
    //여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
    //여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
    //여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며, 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.

    // 13 , 18 번 실패로 인한 코드 수정
    //    원인 1. 여벌의 체육복을 가진 학생이 체육복을 도난 당한 경우에 대한 문제.
    //        2. 중복된 번호를 가지는 경우의 문제
//        해결. Arrats.sort()를 이용해 정렬을 통해 도난당한 학생과 여벌의 체육복을 가진 학생들의 배열을 순서대로 정렬해
//    순사적으로 비교해서 결과를 얻음 !
    // 탐욕알고리즘 에 대해서 잘 모르고 접근했다가 시간을 너무 많이 허비 했다 ..ㅎ
    // https://jellili.tistory.com/23 의 자료르 보고 문제를 보니까 이해는 갔지만 다른 방법들을 보면서 조금씩 이해하면서 해결 할 수 있었던 것 같다.


    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        // 체육복을 가지고 있는 학생의 수 = 전체학생 수 - 잃어버린 학생의 수
        Arrays.sort(lost);
        Arrays.sort(reserve);

        //여벌의 체육복을 가지고 있는 학생이 도난당하는 경우
        for(int i=0; i < lost.length; i++){
            for(int j = 0 ; j < reserve.length; j++){
                if(lost[i] == reserve[j]){
                    reserve[j] = -1;
                    lost[i] = -1;
                    answer++;
                    break;
                }

            }
        }
        // 도난당한 학생에게 체육복을 빌려주는 경우
        for(int i= 0; i < lost.length; i++){
            for(int j = 0 ; j < reserve.length; j++){

                // 여벌 체육복을 가져온 학생이 자기번호 앞,뒤 학생에게 체육복을 빌려줌
                if((lost[i] -1 == reserve[j])  || (lost[i]+1 == reserve[j])){
                    answer++;
                    reserve[j] = -1 ;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String [] args ){
        int a= 5;
        int[] a2 = {2,4};
        int[] a3 = {1,3,5};

        int b= 5;
        int[] b2 = {2,4};
        int[] b3 = {3};

        int c= 3;
        int[] c2 = {3};
        int[] c3 = {1};


        System.out.println(solution(a,a2,a3));
        System.out.println(solution(b,b2,b3));
        System.out.println(solution(c,c2,c3));

    }
}
