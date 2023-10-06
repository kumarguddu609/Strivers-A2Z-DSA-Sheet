//https://www.codingninjas.com/studio/problems/search-in-rotated-sorted-array_1082554?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
//
//
//
import java.util.ArrayList;
public class Solution {
    public static int search(ArrayList<Integer> arr, int n, int k) {
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr.get(mid)==k){
                return mid;
            }
            //
            if(arr.get(start)<=arr.get(mid)){
                if(arr.get(start)<=k && k<=arr.get(mid)){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            else{
                if(arr.get(mid)<=k && k<=arr.get(end)){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
