import java.util.Arrays;

public class findmin {
    public static void main(String[] args) {
        int[] arr={82,56,3,-5,-56,23,90,-45,2};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int minVal=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minVal){
                minVal=arr[i];
            }
        }
        return minVal;

    }
}
