import java.util.Arrays;
public class Swap{
    public static void main(String[] args){
        int[] arr={3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        Swaping(arr,2,3);
    
        System.out.println(Arrays.toString(arr));
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            Swaping(arr,start,end);
        start++;
        end--;
        }
    }
    static void Swaping(int arr[], int index2, int index3){
        int temp=arr[index2];
        arr[index2]=arr[index3];
        arr[index3]=temp;
    }
}
