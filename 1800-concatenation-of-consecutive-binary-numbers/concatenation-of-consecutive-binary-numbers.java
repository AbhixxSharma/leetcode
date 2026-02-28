class Solution {
    public int concatenatedBinary(int n) {
       StringBuilder sb= new StringBuilder();
       for(int i=1;i<=n;i++){
        sb.append(Integer.toBinaryString(i));
       }
       long res=0;
       String x=sb.toString();
       int z=1000000007;
       for(int i=0;i<x.length();i++){
        res=(res*2+(x.charAt(i)-'0'))%z;

       }
       return (int)res;

        }
    
    
}