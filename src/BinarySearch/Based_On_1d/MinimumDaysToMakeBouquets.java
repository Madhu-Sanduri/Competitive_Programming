package BinarySearch.Based_On_1d;

import java.util.Arrays;
import java.util.Map;
//import java.util.stream.Stream;

public class MinimumDaysToMakeBouquets {

    public static int solution(int []a,int m,int k){
        System.out.println(a.length);
        if(m*k>a.length) return -1;
        int min= Arrays.stream(a).min().getAsInt();
        int max = Arrays.stream(a).max().getAsInt();

        return binarySearch(a,m,k,new int[]{min,max});
    }
    static int binarySearch(int []a,int m,int k,int []range){

        int s=range[0];
        int e=range[1];

        int min=Integer.MAX_VALUE;
        while (s<=e){
            int mid=s+(e-s)/2;
            int isValid=validation(a,m,k,mid);
            if(isValid>=m) {
                min=Math.min(mid,min);
            }

            if(isValid>=m){
                e=mid-1;
            }
            else s=mid+1;
        }

        return min;
    }

    static int validation(int []a,int m,int k,int currentDay){
        int count=0;
        int sum=0;
        for(int i:a){

            if(currentDay>=i){
                count++;
            }
            else {
                sum+= (int) Math.floor((double) count/k);
                count=0;
            }
        }
        sum+= count/k;
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,10,3,10,2},3,1));
        System.out.println(solution(new int[]{1,2,3,4,5,6,6,7,8,9,10},10,1));
        System.out.println(solution(new int[]{1000000000,1000000000},1,1));
        System.out.println(solution(new int[]{1,10,3,10,2},3,2));
        System.out.println(solution(new int[]{7,7,7,7,12,7,7},2,3));
        System.out.println(solution(new int[]{7,7,7,7,13,11,12,7},2,3));
    }
}

//Brute Force Solution
//package BinarySearch.Based_On_1d;
//
//import java.util.Arrays;
//import java.util.Map;
////import java.util.stream.Stream;
//
//public class MinimumDaysToMakeBouquets {
//
//    public static int solution(int []a,int m,int k){
//        if(m*k>a.length) return -1;
//        int min= Arrays.stream(a).min().getAsInt();
//        int max = Arrays.stream(a).max().getAsInt();
//
//        return binarySearch(a,m,k,new int[]{min,max});
//    }
//    static int binarySearch(int []a,int m,int k,int []range){
//
//        int s=range[0];
//        int e=range[1];
//
//        for(int i=s;i<=e;i++){
//            if(validation(a,m,k,i)) return i;
//        }
//        return -1;
//    }
//
//    static boolean validation(int []a,int m,int k,int currentDay){
//        int count=0;
//        int sum=0;
//        for(int i:a){
//
//            if(currentDay>=i){
//                count++;
//            }
//            else {
//                sum+= (int) Math.floor((double) count/k);
//                count=0;
//            }
//        }
//        sum+= (int) Math.floor((double) count/k);
//        return sum>=m;
//    }
//
//
//    public static void main(String[] args) {
//        System.out.println(solution(new int[]{1,2,3,4,5,6,6,7,8,9,10},10,1));
//        System.out.println(solution(new int[]{1000000000,1000000000},1,1));
//        System.out.println(solution(new int[]{1,10,3,10,2},3,1));
//        System.out.println(solution(new int[]{1,10,3,10,2},3,2));
//        System.out.println(solution(new int[]{7,7,7,7,12,7,7},2,3));
//        System.out.println(solution(new int[]{7,7,7,7,13,11,12,7},2,3));
//    }
//}
