class Solution {
    public int maximumProduct(int[] nums) {
       insertion(nums);
        int n=nums.length;
        int x=nums[0]*nums[1]*nums[n-1];
        int y=nums[n-1]*nums[n-2]*nums[n-3];
        if(x>y) return x;
        else return y;

    }
    static void insertion(int nums[]){
       int n=nums.length;
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 && nums[j-1]>nums[j]){
                int temp=nums[j-1];
                nums[j-1]=nums[j];
                nums[j]=temp;
                j--;
            }
        }
    }
    // static void swap(int nums[],int first,int second){
    //     int temp =nums[first];
    //     nums[first]=nums[second];
    //     nums[second]=temp;

    // }
}