class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int max=0;
        int i=0;
        for(int j=0;j<s.length();j++){
            char c=s.charAt(j);
            map.put(c,map.getOrDefault(c,0)+1);

            while(map.get(c)>2){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                i++;
            }
            max=Math.max(max,j-i+1);
        }   
        return max;

    }
}