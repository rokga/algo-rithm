package main.LV0;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열만들기4 {

    public static void main(String[] args){
        int[] a = {1,4,2,5,3};

        System.out.println(Arrays.toString(solution(a)));
    }


    public static int[] solution(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int i=0 ;

        while ( i < arr.length){

            if(list.size() == 0){
                list.add(arr[i]);
                i = i + 1;
            } else {
                int last = list.get(list.size()-1);
                if(last < arr[i]){
                    list.add(arr[i]);
                    i = i + 1;
                } else if (last >= arr[i]) {
                    list.remove(list.get(list.size()-1));
                }
            }
        }
        int[] stk = new int[list.size()];
        for(int j=0; j<list.size(); j++){
            stk[j]= list.get(j);
        }
        return stk;
    }
}
