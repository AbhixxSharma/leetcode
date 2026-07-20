class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st= new Stack<>();
        Stack<Character> st2= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                st.push(s.charAt(i));
            }
            else if(!st.isEmpty()){
                st.pop();
            
            }
            
        }
        // String x="";
        // String y="";
       
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)!='#'){
                st2.push(t.charAt(i));
            }
            else if(!st2.isEmpty()){
                st2.pop();
            
            }

        }
        // for(char ch:st2){
        //     y+=ch;
        // }
       return st.equals(st2);


        
    }
}