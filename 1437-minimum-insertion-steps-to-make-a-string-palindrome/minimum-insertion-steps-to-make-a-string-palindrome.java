class Solution {
    public int minInsertions(String s) {
        int n = s.length();
       int [][] memo = new int[n][n];
       for (int i = 0; i < n; i++) {
            Arrays.fill(memo[i], -1);
        }
        int lcs=palindrome(s,0,s.length() - 1,memo);

        return s.length()-lcs;
        
    }
    public int palindrome(String s,int l,int r,int memo[][]){
        if(l>r)return 0;
        if(l==r)return 1;
        if(memo[l][r]!=-1){
            return memo[l][r];
        }

        if (s.charAt(l) == s.charAt(r)) {
            memo[l][r]=2 + palindrome(s, l + 1, r - 1,memo);
        } else {
            memo[l][r]= Math.max(palindrome(s, l + 1, r,memo), palindrome(s, l, r - 1,memo));
    }
    return memo[l][r];
    }
}