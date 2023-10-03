//Longest Subarray With Sum K
//https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_6682399?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0

import java.util.*;
public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
       int maxCount = 0;
       for(int i = 0; i<a.length; i++){
           long sum = 0;
           for(int j = i; j<a.length; j++){
               sum+=a[j];
               if(sum==k){
                   maxCount = Math.max(maxCount, j-i+1);
               }
           }
       }
       return maxCount;
    }
}
