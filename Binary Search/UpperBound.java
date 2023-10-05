//https://www.codingninjas.com/studio/problems/implement-upper-bound_8165383?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
//
//
//
public class Solution {
    public static int upperBound(int []arr, int x, int n){
         int start=0;
        int end=n-1;
        int ans=n;
        if(x<arr[0]){
            return 0;
        }
        if(x>arr[n-1]){
            return n;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>x){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    
    }
}
