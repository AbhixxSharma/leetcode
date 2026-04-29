class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> lst= new ArrayList<>();
        for(int l[]:grid){
           for(int c:l){
            lst.add(c);
           }
        }
        Collections.sort(lst);
        int sum=0;

        // int med=(lst.get(lst.size()/2)+lst.get((lst.size()+1)/2))/2;
        int med=lst.get(lst.size()/2);
        for(int num:lst){
            int min=Math.abs(med-num);
            if(min%x!=0){
                return -1;
            }
            else{
                sum+=min/x;
            }
        }
        return sum;
        
    }
}