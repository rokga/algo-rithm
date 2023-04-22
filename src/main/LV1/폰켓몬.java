package main.LV1;

public class 폰켓몬 {
        public int solution(int[] nums) {
            int[] counts = new int[200001];
            int answer = 0;
            for(int i = 0; i < nums.length; i++) {
                if(counts[nums[i]] == 0) {
                    answer++;
                }
                counts[nums[i]]++;
            }
            if(answer > nums.length / 2) {
                answer = nums.length / 2;
            }
            return answer;

    }

    public static void main(String[] args){
            폰켓몬 A = new 폰켓몬();

        System.out.println(A.solution(new int[]{3,1,2,3}));
        System.out.println(A.solution(new int[]{3,3,3,2,2,4}));
        System.out.println(A.solution(new int[]{3,3,2,22}));
    }
}

