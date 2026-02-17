class Solution {
    static ArrayList<Integer> preGreaterEle(int[] arr) {
        // code here
        int n=arr.length;
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> result= new ArrayList<>();
        
        for(int i=0;i<=n-1;i++){
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                result.add(-1);
            }else{
                result.add(stack.peek());
            }
            stack.push(arr[i]);
        }
        return result;
    }
}