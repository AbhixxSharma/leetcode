class Solution {
    public int numberOfSpecialChars(String word) {
        int cnt=0;
        HashMap<Character,Integer> map =new HashMap<>();
        for(int i=0;i<word.length();i++){
            map.put(word.charAt(i),1);

        }
        for(char c='a';c<='z';c++){
            if(map.containsKey(c)&& map.containsKey(Character.toUpperCase(c))){
                cnt++;
            }

        }
        return cnt;
        
    }
}