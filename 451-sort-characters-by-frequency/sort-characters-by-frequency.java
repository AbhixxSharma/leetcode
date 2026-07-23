class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map= new HashMap<>();
        for(char st:s.toCharArray()){
            map.put(st,map.getOrDefault(st,0)+1);
        }
      PriorityQueue<Character> pq= new PriorityQueue<>((a,b)-> map.get(b)-map.get(a));

       
      for(char ch:map.keySet()){
        pq.add(ch);
      }
      StringBuilder sb= new StringBuilder();
       while(!pq.isEmpty()){
        char ch = pq.poll();
        for(int i=0;i<map.get(ch);i++){
            sb.append(ch);
        }

        }
        return sb.toString();


        
    }
}