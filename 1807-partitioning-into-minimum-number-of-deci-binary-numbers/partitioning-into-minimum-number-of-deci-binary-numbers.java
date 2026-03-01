class Solution {
    public int minPartitions(String n) {
        int max=0;
        char arr[]=n.toCharArray();
        for(char c:arr){
            max=Math.max(max,c-'0');
            
        }
    
        return max;
        
    }
}