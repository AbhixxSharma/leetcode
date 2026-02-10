class Solution {
    public int longestBalanced(int[] nums) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            Map<Integer,Integer> map= new HashMap<>();
            int cntEvn=0;
            int cntOdd=0;
            for(int j=i;j<nums.length;j++){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);

                if(map.get(nums[j])==1){
                    if(nums[j]%2==0){
                        cntEvn++;
                    }
                    else{
                        cntOdd++;
                    }
                }

                if(cntEvn==cntOdd){
                    cnt=Math.max(cnt,j-i+1);
                }
            }

        }
        return cnt;
        
    }
}