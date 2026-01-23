class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0];
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        List<int[]> lst=new ArrayList<>();

        int st=intervals[0][0];
        int end=intervals[0][1];
        for(int i=0;i<intervals.length;i++){
            int newst= intervals[i][0];
            int newend=intervals[i][1];

            if(newst<=end){
                end=Math.max(end,newend);
            }
            else{
                lst.add(new int[]{st,end});
                st=newst;
                end=newend;
            }

        }
        lst.add(new int[]{st,end});

        return lst.toArray(new int[lst.size()][]);

        
        
    }
}