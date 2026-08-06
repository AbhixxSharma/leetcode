class Solution {
    public int smallestNumber(int n, int t) {

        ArrayList<Integer> lst= new ArrayList<>();
        for(int i=n;i<=100;i++){
            int mul=i;
            int pro=1;

             while(mul!=0){
                int rem= mul%10;
                 pro*=rem;

                 if(pro%t==0){
                    lst.add(i);
                 }
                 mul/=10;

             }
        }
        System.out.print(lst);
        return lst.get(0);
        
    }
}