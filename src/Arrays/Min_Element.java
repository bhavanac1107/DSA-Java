package Arrays;

import java.util.Arrays;
public class Min_Element{
    public static void main(String[] args){
    int[] arr={23,45,19,45,67,89};
    System.out.println(Arrays.toString(arr));
    System.out.println(Minelement(arr));
    }
    
    static int Minelement(int[] arr){
        int min_value=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min_value){
                min_value=arr[i];
            }
        }
        return min_value;
    }
}