class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        StringBuilder sb= new StringBuilder();
        for(char ch:num.toCharArray()){
            while(!st.isEmpty()&& k>0 && st.peek()>ch){
                k--;
                st.pop();
            }
            st.push(ch);
        }
        // this cond for when the value in increasing order
        while(k>0 && !st.isEmpty()){
            k--;
            st.pop();
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();

        while(sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }

        if(sb.length()>0){
            return sb.toString();
        }
        return "0";



        
    }
}