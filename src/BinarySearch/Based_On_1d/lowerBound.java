package BinarySearch.Based_On_1d;

public class lowerBound {

    public static int solution(int []a,int target){
        int s=0,e=a.length-1;

        while (s<e){

            int mid=s+(e-s)/2;
            if(a[mid]>=target){
                e=mid;
            }
            else s=mid+1;
        }
        if(s>=a.length || a[s]!=target) return -1;
        return s;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{5,7,7,8,8,10},8));
        System.out.println(solution(new int[]{5,7,7,8,8,10},6));
        System.out.println(solution(new int[]{1,2,2,3,3,3,4,4,5,5,5},3));
    }
}
