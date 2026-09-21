class Solution {
    public int countVowelStrings(int n) {


        long ans=1;
        for(int i=1;i<=4;i++){
            ans=ans*(n+i)/i;
        }
        return (int)ans;


    }

    //     int r=4;
    //     int bars=fact(n+r);
    //     int stars=fact(n)*fact(r);
        
    //     return bars/stars;
        
    // }
    // int fact(int n){
    //     if(n<=1) return 1;
    //     int fac=1;

    //     for(int i=1;i<=n;i++){
    //         fac*=i;
    //     }
    //     return fac;
    // }
    
}