class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
      int n=arr.length;
      Arrays.sort(arr);
      int lar=arr[n-1];
      
      for(int i=n-2;i>=0;i--){
          if(arr[i]!=lar){
              return arr[i];
          }
      }
      return -1;
    }
}