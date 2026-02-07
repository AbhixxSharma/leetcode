class Solution {
    public int minimumDeletions(String s) {
        int cnt=0;
        int cntb=0;



        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                cntb++;
            }
            else{
               if(cntb>0){
                cntb--;
                cnt++;

            }
            }
        }

        return cnt;
        // Stack<Character>st= new Stack<>();
        // for(int i=s.length()-1;i>=0;i--){
        //     while(!st.isEmpty()&& s.charAt(i)!=st.peek()){
        //         st.pop();
        //         cnt++;
        //     }

            
        //     st.push(s.charAt(i));
        // }

        
       

        // return cnt;
        
    }

}