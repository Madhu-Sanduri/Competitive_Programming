package com.BinarySearch.Based_On_1d;

public class binarySearch {
    public static int solution(int []a,int target){
        int s=0,e=a.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(a[mid]==target) return mid;

            if(a[mid]>target){
                e=mid-1;
            }
            else s=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{-1,0,3,5,9,12},9));
        System.out.println(solution(new int[]{-1,0,3,5,9,12},2));
    }
}
