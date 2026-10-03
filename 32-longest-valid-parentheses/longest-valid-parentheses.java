class Solution {
    public int longestValidParentheses(String s) {



        int l=0;
        int r=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                l++;
            }
            else{
                r++;
            }
            if(l==r){

                max=Math.max(max,l*2);
            }
            else if(r>l){
                l=0;
                r=0;
            }
        }
        l=0;
        r=0;
        for(int i=s.length()-1;i>=0;i--){
          if(s.charAt(i)=='('){
                l++;
            }
            else{
                r++;
            }
            if(l==r){

                max=Math.max(max,l*2);
            }
            else if(l>r){
                l=0;
                r=0;
            }
        }
  

    //     int cnt=0;
    //     int max=0;
    //     Stack<Character> st= new Stack<>();
    //      for(int i=0;i<s.length();i++){
    //         if(s.charAt(i)=='('){
    //             st.push(s.charAt(i));
    //         }
    //         else if( s.charAt(i)==')'){
            
    //             if(!st.isEmpty() && st.peek()=='('){
    //                  st.pop();
    //                   cnt+=2;
    //                    max=Math.max(max,cnt);

    //         }
    //                else{
    //                   cnt=0;
    //               }
    //         }
            
            
    //      }
         return max;
        
    }
}