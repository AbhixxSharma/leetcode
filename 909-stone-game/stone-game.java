class Solution {
    public boolean stoneGame(int[] piles) {
        int sum=0;
        for(int i:piles){
            sum+=i;
        }
        return sum%2!=0;
        
    }
}