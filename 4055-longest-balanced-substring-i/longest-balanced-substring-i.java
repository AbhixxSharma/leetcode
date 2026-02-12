class Solution {
    public int longestBalanced(String s) {
        int cnt=1;
        for(int i=0;i<s.length();i++){
            Map<Character,Integer> map= new HashMap<>();
            int dist=0;
            int freq=1;
            for(int j=i;j<s.length();j++){
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
               if(map.get(s.charAt(j))==1) {
                dist++;

            }
              freq=Math.max(freq,map.get(s.charAt(j)));
              if((j-i+1)==freq*dist){
                cnt=Math.max(cnt,j-i+1);
              }

                    
                


            }
        }
        return cnt;
        
    }
    // publilc boolean isBalanced(Map<Character,Integer> map)
}