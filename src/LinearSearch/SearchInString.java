package LinearSearch;

public class SearchInString {
    public static void main(String[] args){
String str="Bhavana";
int target='a';
int ans=LSearch(str,target);
System.out.println(ans);

}
static int LSearch(String str,int target){
        if(str.length()==0){
            return -1;//which means not found
        }
        for(int index=0;index<str.length();index++){
            if(str.charAt(index)==target){
                return index;
            }
        }
        return Integer.MAX_VALUE;
    }
}