class Solution {
    public int totalWaviness(int num1, int num2) {
        int sum=0;
        for(int i=num1;i<=num2;i++){
            sum+=changer(i);
        }
        return sum;
        
        
    }
    public int  changer(int x){
        int cnt=0;
        String s= Integer.toString(x);
        for(int i=1;i<s.length()-1;i++){
            char ch=s.charAt(i);
            if((ch>s.charAt(i-1)&& ch>s.charAt(i+1))||(ch<s.charAt(i-1)&&ch<s.charAt(i+1))){
                cnt++;
            }
        }
        return cnt;
    }
}