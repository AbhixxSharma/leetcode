class Solution {
    public int sumSubarrayMins(int[] arr) {


        // Previous Smaller Element
          int MOD = 1_000_000_007;

        int nums[]= new int[arr.length];
        Stack<Integer> st= new Stack<>();
        Stack<Integer> st1= new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()){
                nums[i]=st.peek();
            }
            else{
                nums[i]=-1;
            }
            st.push(i);
        }
        // Next Smaller Element>>>>>
        int next[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!st1.isEmpty() && arr[i]<arr[st1.peek()]){
                st1.pop();
            }
             if(!st1.isEmpty()){
                next[i]=st1.peek();
            }
            else{
                next[i]=arr.length;
            }
            st1.push(i);
        }

        // Finalize the answer
        long sum=0;
        for(int i=0;i<nums.length;i++){
            long left= i-nums[i];
            long right= next[i]-i;

           sum = (sum + arr[i] % MOD * left % MOD * right % MOD) % MOD;

        }
        return (int) sum;









        //   int MOD = 1_000_000_007;
    //    long ans=0;
    //     for(int i=0;i<arr.length;i++){
    //         int min=Integer.MAX_VALUE;
    //         for(int j=i;j<arr.length;j++){

    //             min=Math.min(min,arr[j]);
    //             ans+=min;

    //         }
    //     }
    //     return (int)(ans%MOD);
        
    }
}