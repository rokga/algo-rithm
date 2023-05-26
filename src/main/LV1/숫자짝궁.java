package main.LV1;



public class 숫자짝궁 {

    public static   String solution(String x , String y ){
        StringBuilder sb = new StringBuilder();

        int[] a = new int[10];
        int[] b = new int[10];

        for(int i=0; i < x.length(); i++){ //
            a[x.charAt(i) - '0'] ++;
        }

        for(int i=0; i < y.length(); i++){
            b[y.charAt(i) - '0'] ++;
        }

        for(int i= 9 ; i>=0 ; i--){

            int min = Math.min(a[i],b[i]);
            for(int j=0; j < min; j++){

                sb.append(i);
            }
        }
        if(sb.length() == 0){
            return "-1";
        } else if (sb.toString().startsWith("0")) {
            return  "0";
        } else {
            return sb.toString();
        }
    }


    public static void main(String[] args){
        System.out.println(solution("100", "2345"));
        System.out.println(solution("100", "203045"));
        System.out.println(solution("100", "123450"));
        System.out.println(solution("12321", "42531"));
        System.out.println(solution("5525", "1255"));
    }
}
