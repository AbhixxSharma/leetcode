class Solution {
    public boolean checkDivisibility(int n) {
        int x=n;
        int allp=0;
        int pro=1;
        int sum=0;
        while(x!=0){
            int rem= x%10;
             sum+=rem;

            
            
            pro*=rem;
             
            x/=10;
            
            // allp=pro+sum;
        }
        allp=pro+sum;
        return (n%allp)==0;
    }
}