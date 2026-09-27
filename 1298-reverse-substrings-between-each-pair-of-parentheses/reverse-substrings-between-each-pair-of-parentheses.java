class Solution {
    public String reverseParentheses(String s) {

        Stack<String> st= new Stack<>();
         Stack<Character> st2= new Stack<>();
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){

                st2.push('(');
                st.push(sb.toString());
                sb = new StringBuilder();
            }
            else if(s.charAt(i)==')'){
                sb.reverse();

                String x=st.pop();
                sb=new StringBuilder(x+sb.toString());
                st2.pop();
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();

        
        
    }
}