package LinearSearch.MinMaxIn2DArray;

import java.util.Arrays;
public class MaxIn2DArray {
    public static void main(String[] args){
        int[][] arr={
        {56,34,23},
        {56,68,4,45},
        {67,89}
     };
     System.out.println(Arrays.deepToString(arr));
     System.out.println("max :"+Max(arr));
    }
static int Max(int[][] arr){
    int max_value = arr[0][0];
     for(int row=0;row<arr.length;row++){
        for(int col=0;col<arr[row].length;col++){
            if(arr[row][col]>max_value){
               max_value=arr[row][col];

            }
        }
     }
     return max_value;
    }
}