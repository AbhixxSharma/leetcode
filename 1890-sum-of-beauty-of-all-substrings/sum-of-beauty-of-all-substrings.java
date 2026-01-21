class Solution {
    public int beautySum(String s) {
        int ans=0;

        
        for(int i=0;i<s.length();i++){
            int arr[]= new int[26];
            for(int j=i;j<s.length();j++){
                arr[s.charAt(j)-'a']++;

                int max=0;
                int min=Integer.MAX_VALUE;

                for(int x:arr){
                    if(x>0){
                        max=Math.max(max,x);
                        min=Math.min(min,x);
                    }
                }
                ans+=(max-min);

            }
        }
        return ans;
    }
}