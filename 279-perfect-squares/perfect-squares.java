class Solution {
    public int numSquares(int n) {
        ArrayList<Integer> lst= new ArrayList<>();
       
        for(int i=1;i*i<=n;i++){
            lst.add(i*i);
        }
         int dp[][]= new int[lst.size()][n+1];
         for(int r[]:dp){
            Arrays.fill(r,-1);
         }
        return unbounded(lst,0,n,dp);
        
    }
    int unbounded(ArrayList<Integer>lst,int idx,int cap,int dp[][]){

        if(cap==0) return 0;
        if(idx==lst.size()) return Integer.MAX_VALUE;

        int take=Integer.MAX_VALUE;
        if(dp[idx][cap]!=-1) return dp[idx][cap];
        if(lst.get(idx)<=cap){
           int itake=unbounded(lst,idx,cap-lst.get(idx),dp);
           if(itake!=Integer.MAX_VALUE){
            take=1+itake;
           }

            
        }
        int notTake=unbounded(lst,idx+1,cap,dp);
        dp[idx][cap]=  Math.min(take,notTake);
        return dp[idx][cap];


    }
}