import java.util.Arrays;

public class search2d {
    public static void main(String[] args){
        int[][] arr={
            {1,32,45,6,4},
            {34,54,21,6},
            {87,3,13,5}
        };
        int target=13;
        int[] ans= search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][] arr, int target){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for(int r=0;r<arr.length;r++){
            for( int c=0;c<arr[r].length;c++){
                if (arr[r][c]==target){
                    return new int[]{r,c} ;
                }
            }
        }
        return new int[]{-1,-1};
        }
}
    

