class Solution {
    public int countTriplets(int[] arr) {
        // int a=0;
        // int b=0;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
          int a=0;
            // a^=arr[i];
            for(int j=i;j<arr.length;j++){
                  int b=0;
                  a^=arr[j];
                for(int k=j+1;k<arr.length;k++){
                    
                    b^=arr[k];
                   

                    if(a==b){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
        
    }
}