import java.util.Arrays;
public class insertionsort {
    public static void main(String[] args) {
        int[] arr={23,89,1,34,-9};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        for(int i=0;i<=arr.length-2;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{break;}

            }
        }
    }
    static void swap(int[]arr,arr[first],arr[second]){
        int temp= int arr[first];
        int arr[first]=arr[second];
        int[second]= int temp;
    }
}
