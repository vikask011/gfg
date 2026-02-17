class Solution {
    int missingNum(int arr[]) {
        int n=arr.length+1;
        int sum=0;
        
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
           
            
        }
         long totalsum=(long)n*(n+1)/2;
         long missing = totalsum-sum;
         return (int)missing;
        
    }

    
}