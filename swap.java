import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr= {2,54,23,1,5,77,98,92};
        swapp(arr,3,4);
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void reverse( int[]arr){
        int start=0;
        int end= arr.length-1;
        while(start<end){
            swapp(arr, start, end);
            start++;
            end--;
        }
    }
    static void swapp (int[] arr, int index1, int index2) {
            int temp= arr[index1];
            arr[index1]= arr[index2];
            arr[index2]= temp;
            System.out.println(Arrays.toString(arr));


    }
    
}
