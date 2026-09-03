class Solution {
    public boolean uniformArray(int[] nums1) {

       
       boolean flag=false;
       int min=Integer.MAX_VALUE;
       for(int i=0;i<nums1.length;i++){
         min=Math.min(nums1[i],min);

       }
       if(min%2!=0) return true;
       for(int i=0;i<nums1.length;i++){
        if(min%2==0){
            if(nums1[i]%2!=0){
                return false;
            }
        }

       }

       return true;
    }

       

      
}