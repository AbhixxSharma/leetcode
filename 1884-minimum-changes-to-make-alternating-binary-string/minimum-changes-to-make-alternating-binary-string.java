class Solution {
    public int minOperations(String s) {
        int a=0;
        int b=0;
        for(int i=0;i<s.length();i++){
            char x=(i%2==0)?'0':'1';
            if(s.charAt(i)!=x){
                a++;
            }
            else{
                b++;
            }
        }

        return Math.min(a,b);
       
    }
}