class Solution {
    public String smallestSubsequence(String s) {
        int arr[]= new int[26];
        boolean visited[]=new boolean[26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        } 
        StringBuilder sb= new StringBuilder();
        Stack<Character> st= new Stack<>();

        for(char ch:s.toCharArray()){
            arr[ch-'a']--;
            if(visited[ch-'a']){
                continue;
            }

            while(!st.isEmpty() && st.peek()>ch &&arr[st.peek()-'a']>0){
                visited[st.pop()-'a']=false;
                // st.pop();
            }
            st.push(ch);
            visited[ch-'a']=true;

           
           
        }
         for(char c:st){
                sb.append(c);
            }
            return sb.toString();
        
    }
}