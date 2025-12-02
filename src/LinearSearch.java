public class LinearSearch {
    public static void main(String[] args){
        int[] arr={23,4,5,67,8,9,-1};
        int target=56;
        int ans=LSearch(arr,target);
        System.out.println("The index of the target is: "+ans);
    }
    //return index if item is found
    //return -1 if item not found
    static int LSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index]==target){
                return index;
            }
        }
        return-1;
    }
}
