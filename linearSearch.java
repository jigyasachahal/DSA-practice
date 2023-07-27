import java.util.Arrays;
public class linearSearch {
    public static void main(String[] args) {
        int[] arr={3,54,-7,42,45,67,21,43,99};
        int target= 167;
        int ans= linearSearch(arr,target);
        System.out.println(ans);
        
    }
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int i=0;i<arr.length;i++){
            int element= arr[i];
            if(element==target){
                return i;
            }

        }
        return -1;

    }
    
}
