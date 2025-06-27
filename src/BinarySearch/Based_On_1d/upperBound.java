package BinarySearch.Based_On_1d;

public class upperBound {

    public static int solution(int []a,int target) {

        int s=0,e=a.length-1;

        while (s<e){
            int mid= s+(e-s)/2;
            if(a[mid]>target){
                e=mid;
            }
            else s=mid+1;
        }

        return s-1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{5,7,7,8,8,10},8));
        System.out.println(solution(new int[]{5,7,7,8,8,10},6));
        System.out.println(solution(new int[]{1,2,2,3,3,3,4,4,5,5,5},3));
        System.out.println(solution(new int[]{1, 2, 8, 10, 10, 12, 19},0));
        System.out.println(solution(new int[]{1, 2, 8, 10, 10, 12, 19},11));
    }
}
