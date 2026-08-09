class Solution {
    public int minDistance(String word1, String word2) {
        int dp[][]= new int[word1.length()][word2.length()];
        for(int r[]:dp){
            Arrays.fill(r,-1);
        }

        return word1.length()+word2.length()-2*lcs(word1,word2,0,0,dp);
        
    }
    int lcs(String s1,String s2,int i,int j,int dp[][]){
        if(s1.length()==i|| s2.length()==j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int max=0;

        if(s1.charAt(i)==s2.charAt(j)){
            dp[i][j]= 1+lcs(s1,s2,i+1,j+1,dp);
        }
        else{
          dp[i][j]= Math.max(lcs(s1,s2,i+1,j,dp),lcs(s1,s2,i,j+1,dp));

        }

       
        return dp[i][j];
    //    max= Math.max(lcs(s1,s2,i+1,j),lcs(s1,s2,i,j+1));
    }
}