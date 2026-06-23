class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> lst =new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            List<Integer> l2=new ArrayList<>();
            while(nums[i]>0){
                int rem=nums[i]%10;
                // lst.add(rem);
                l2.add(rem);
                nums[i]/=10;
            }
            for(int j = l2.size() - 1; j >= 0; j--) {
                lst.add(l2.get(j));
            }
        }
       int i=0;
       int arr[]= new int[lst.size()];
       for(int a:lst){
        arr[i++]=a;
       }
       return arr;
        
    }
}