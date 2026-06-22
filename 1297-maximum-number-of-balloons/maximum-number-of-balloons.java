class Solution {
    public int maxNumberOfBalloons(String text) {
        int b=0;
        int a=0;
        int l=0;
        int o=0;
        int n=0;
        for(char c:text.toCharArray()){
            if(c=='b') b++;
            if(c=='a')a++;
            if(c=='l')l++;
            if(c=='o')o++;
            if(c=='n')n++;

        }
        int min1= Math.min(b,a);
        int min2=Math.min(l/2,o/2);
        int min3=Math.min(min1,n);
        return Math.min(min2,min3);



        
    }
}