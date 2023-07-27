import java.util.Arrays;

public class maxarray {
    public static void main(String[] args) {
        int[] arr= {2,54,23,1,5,77,98,92};
        System.out.println(max(arr));
        
    }
    static int max(int[] arr){
        int maxVal=arr[0];
        for( int i=0;i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}
