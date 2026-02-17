class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int newarr[]=new int[arr.length];
        int index=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                newarr[index]=arr[i];
                index++;
                
            }
        }
        for(int i=0;i<arr.length;i++){
        arr[i]=newarr[i];
    }}
}