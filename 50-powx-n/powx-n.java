class Solution {
    public double myPow(double x, int n) {
        long rep=n;
        while(rep<0){
            x=1/x;
            rep=-rep;
        }
        double  curr=x;
        double  ans=1.0;

        while(rep>0){
            if(rep%2!=0){
                ans*=curr;
               
            }
             curr*=curr;
                rep/=2;
        }
        return ans;

        
    }
}