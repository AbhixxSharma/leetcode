class Solution {
    public List<Long> mergeAdjacent(int[] nums) {


        Stack<Long> st= new Stack<>();
        for(int i=0;i<nums.length;i++){
            long curr=nums[i];
            while(!st.isEmpty()&& st.peek()==curr){
                curr+=st.pop();
            }
            st.push(curr);
        }
        List<Long> lst= new ArrayList<>();

        for(long i:st){
            lst.add(i);
        }
        return lst;
        // for(long val:nums){
        //     lst.add(val);
        // }
        // int i=0;
        // while(i<lst.size()-1){
        //     if(lst.get(i).equals(lst.get(i+1))){
        //         long sum=lst.get(i)+lst.get(i+1);

        //         lst.set(i,sum);
        //         lst.remove(i+1);
        //         i=0;
        //     }
        //     else{
        //     i++;
        //     }
        // }
        // return lst;

        
        
    }
}