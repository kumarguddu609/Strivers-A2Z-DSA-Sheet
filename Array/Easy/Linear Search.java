//find if K is present in a sorted array or not by linear Search
////Time Complexity --O(n)
//Space Complexity --O(1)

class Solution{
    static int searchInSorted(int arr[], int N, int K)
    {
      for(int i=0;i<N;i++){
            if(arr[i]==K)
            return 1;
        }
        return -1;
    }
}
