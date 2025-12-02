public class SearchInRange {
    public static void main(String[] args){
        int[] arr={23,4,5,67,8,9,-1};
        int target=23;
        int ans=LSearch(arr,target,2,5);
        System.out.println("The index of the target is: "+ans);
    }
    static int LSearch(int[] arr,int target,int start,int end){
         if(arr.length==0){
            return -1;
        }
         for(start=2;start<=end;start++){
            if(arr[start]==target){
                return start;
            }
        }
        return-1;
    }
}
