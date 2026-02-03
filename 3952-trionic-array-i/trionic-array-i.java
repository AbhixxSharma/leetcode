class Solution {
    public boolean isTrionic(int[] nums) {

        boolean flag=false;
        for(int i=1;i<=nums.length-3;i++){
            for(int j=i+1;j<=nums.length-2;j++){
                if(isInc(nums,0,i)&&isDec(nums,i,j)&&isInc(nums,j,nums.length-1)){
                    return true;
                }
            }
        }
        return false;
        
    }
    boolean isInc(int arr[],int left,int right){
        for(int i=left;i<right;i++){
            if(arr[i]>=arr[i+1]) return false;
        }
        return true;
    }
    boolean isDec(int arr[],int left ,int right){
        for(int i=left;i<right;i++){
            if(arr[i]<=arr[i+1]) return false;
        }
        return true;
    }
}