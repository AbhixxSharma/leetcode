class Solution {
    public int maxProduct(int n) {
        
       int sum=0;
        char[] ch = String.valueOf(n).toCharArray();
        Arrays.sort(ch);
        char c=ch[ch.length-1];
        char x=ch[ch.length-2];
        return  (c-'0')*(x-'0');
         
        


        
    }
}