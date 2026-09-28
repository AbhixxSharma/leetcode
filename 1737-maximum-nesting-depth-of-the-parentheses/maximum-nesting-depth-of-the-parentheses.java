class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int max=0;
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if( s.charAt(i)=='('){
                cnt++;
                max=Math.max(max,cnt);

            }
            else if(s.charAt(i)==')'){
                cnt--;
            }
            
        }
        return max;
        
    }
}