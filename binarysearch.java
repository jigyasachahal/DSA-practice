import java.util.Arrays;

public class binarysearch {
    public static void main(String[] args){
        int[] arr= {-23,-12,-10,-6,9,27,45,89,91,109};
        int target= 32;
        int ans= binarysearch(arr,target);
        System.out.println(ans);
    }    
    static int binarysearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
            return mid;
        } 
    }
        return -1;
    }
}
