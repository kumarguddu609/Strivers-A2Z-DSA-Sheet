//https://www.codingninjas.com/studio/problems/algorithm-to-find-best-insert-position-in-sorted-array_839813?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0
//
//
public class Solution {
    public static int searchInsert(int [] arr, int m){
       int low =0;
       int high=arr.length-1;
       while(low<=high){
           int mid=low+(high-low)/2;
           if(arr[mid]==m){
               return mid;
           }else if(arr[mid]>m){
               high=mid-1;
           }else{
               low=mid+1;
           }
       }
       return low;
    }
}
