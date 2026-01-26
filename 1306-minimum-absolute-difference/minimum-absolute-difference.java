class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>>lst =new ArrayList<>();
      int   diff=Integer.MAX_VALUE;
       for(int i=1;i<arr.length;i++){
        diff=Math.min(diff,arr[i]-arr[i-1]);
       }
       for(int i=1;i<arr.length;i++){
         if(arr[i]-arr[i-1]==diff){
            lst.add(Arrays.asList(arr[i-1],arr[i]));
        }
       }
        return lst;
    }


}      