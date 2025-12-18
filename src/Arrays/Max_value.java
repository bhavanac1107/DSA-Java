package Arrays;

import java.util.Arrays;
class Max_value{
    public static void main(String[] args){
        int[] arr={3,4,687,6,78};
        System.out.println(Arrays.toString(arr));
        System.out.println(Max(arr));
        int a=Max(arr,3,4);
        System.out.println(a);
    }
    

static int Max(int[] arr){
    int max_val=arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]>max_val){
            max_val=arr[i];
        }
    }
    return max_val;
} 
static int Max(int[] arr,int start,int end){
    int max_val=arr[start];
    for(int i=start;i<=end;i++){
        if(arr[i]>max_val){
            max_val=arr[i];
        }
    }
    return max_val;
} 

}