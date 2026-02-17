class Solution {
    public static int largest(int[] arr) {
        
        // code here
        int n=arr.length;
       Arrays.sort(arr);
       int res=arr[n-1];
        return res;
    }
   
}
