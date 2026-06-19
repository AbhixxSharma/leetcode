class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        int arr[]= new int[gain.length+1];
        arr[0]=0;

        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            arr[i+1]=sum;
        }
       for(int i=0;i<arr.length;i++){
        max=Math.max(arr[i],max);
        
       }
       return max;
    
    }
}