class Solution {
    public String smallestPalindrome(String s) {
        TreeMap<Character,Integer> map= new TreeMap<>();
        if(s.length()<=1){
            return s;
        }
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

        }
         StringBuilder sb= new StringBuilder();
           StringBuilder sb1= new StringBuilder();

        for(Map.Entry<Character,Integer> map2:map.entrySet()){

            for(int i=0;i<map2.getValue()/2;i++){
                sb.append(map2.getKey());

            }
            if(map2.getValue()%2!=0){
                sb1.append(map2.getKey());
            }
            

            // if(map2.getValue()%2!=0){
            //     for(int i=0;i<map2.getValue()/2;i++){
            //         r+=map2.getKey();

            //     }
                
            // }
            // else{
            //     res+=map2.getKey();

            // }

        }
        String last = new StringBuilder(sb).reverse().toString();
        return sb.toString()+sb1.toString()+last;
        
        
        
        
    }
}