package LinearSearch;

import java.util.Arrays;
public class SearchIn2DArray {
    public static void main(String[] args){
     int[][] arr={
        {56,34,23},
        {56,68,4,45},
        {67,89}
     };
     int target=34; 
       System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][] arr,int target){
     for(int row=0;row<arr.length;row++){
        for(int col=0;col<arr[row].length;col++){
            if(arr[row][col]==target){
                return new int[] {row,col};
            }
        }
     }
     return new int[]{-1,-1};
    }
}
