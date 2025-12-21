package BinarySearch;

public class BinarySearch {
    public static void main(String args[]){
     int[] arr={-10,-1,2,3,4,5,6,7,8,10,54,67,90};
     int target=54;
     int ans=binarySearch(arr,target);
     System.out.println(ans);
    }
    //return the index
    static int binarySearch(int[] arr,int target){
        int start =6;
        int end=arr.length-1;
        while(start<=end){
            //find the middle element
            //  int mid=(start/end)/2;  //might be possible that (start+End) exceeds the range og int in java
            int mid =start+(end -start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
             else if(target>arr[mid]){
                start=mid+1;
             }
             else{
                //answer found
                return mid;
             }
        }
        return -1;
    }
}
