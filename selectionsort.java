import java.util.Arrays;
public class selectionsort {
    public static void main(String[] args) {
        int[] arr={23,89,1,34,-9,81,0,-34};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[]arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int start=0;
            int maxIndex= getMaxIndex(arr,start,last);
            swap(arr,maxIndex,last);
        
        }
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
    static void swap(int[]arr,int first, int second){
        int temp= arr[first];
        arr[first]= arr[second];
        arr[second]=temp;
    }

    
    static int getMaxIndex(int[] arr, int start, int end){
        int max=start;
        for (int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
