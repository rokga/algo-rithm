package 알고리즘.프로그래머스;

class Solution {
    public int solution(int n) {
        int i = 0;
        int fac = 1;

        while(true){
            if(fac <= n ){
                fac *= i+1;
                i++;
            } else{
                break;
            }
        }
        return i-1;
    }
}