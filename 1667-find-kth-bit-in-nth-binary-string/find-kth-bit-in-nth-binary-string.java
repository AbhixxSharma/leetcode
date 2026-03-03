class Solution {
    public char findKthBit(int n, int k) {
        String s="0";
        for(int i=2;i<=n;i++){
            StringBuilder sb= new StringBuilder();
            for (char c : s.toCharArray()) {
               if(c=='0'){
                  sb.append('1');
            }
              else{
                sb.append('0');
            }
        }
        sb.reverse();

        s=s+"1"+sb.toString();
        }

        return s.charAt(k-1);
        
    }
}