class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st =new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
            else{
                if(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }


        }
        return st.size();
    //     int b1=0;
    //     int b2=0;
    //    while(!st.isEmpty()){
    //     if(st.pop()=='('){
    //         b1++;
    //     }
    //     else{
    //         b2++;
    //     }
    //    }
    //    System.out.print(b1 );
    //    return b1+b2;
        
    }
}