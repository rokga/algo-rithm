package main.LV1;


import java.util.Arrays;

public class k번째수 {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];


        for (int i = 0; i < commands.length; i++) {
            int[] arr = new int[commands[i][1] - commands[i][0] + 1];

            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                int cnt = 0;
                arr[cnt] = array[j];
                cnt++;

                Arrays.sort(arr);
                answer[i] = arr[commands[i][2] - 1];

            }
        }
        return answer;
        }



        public static void main (String[]args){
            k번째수 A = new k번째수();

            int[] array = {1, 5, 2, 6, 3, 7, 4};
            int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

            System.out.println(Arrays.toString(A.solution(array, commands)));

            System.out.println(Arrays.toString(A.solution2(array,commands)));

        }

    // 각 commands를 처리할때마다 초기화되어야 해서  그렇지 않으면 값이 계속 추가추가 !
// cnt 를 밖에서선언 하면 오류나는 이유 !
// 다른 코드를 구경하다가 마음에 드는 코드가 있어 가져왔다
    public static int[] solution2(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0 ; i < commands.length; i++){
        int[] temp = Arrays.copyOfRange(array,commands[i][0] -1 , commands[i][1]);
    //  commands[i][0] -1;  // 시작 위치 인덱스
    //  commands[i][1] -1 // 끝 위치 인덱스
    //  commands[i][2] -1 // 정렬 후 위치 인덱스
        Arrays.sort(temp);
        answer[i] = temp[commands[i][2]-1];

        }
        return answer;
    }
    }



    //   Arrays.copyOfRange 를 사용하면 쉽게 배열을 자를수 있다!


