class Solution {
    public int reverseDegree(String s) {
        char arr[]=s.toCharArray();
        // int i=0;
        int sum=0;

        for(int i=0;i<arr.length;i++){
           int x=Math.abs(((int)arr[i]-'z'-1));
            // System.out.println(x);

            sum=sum+(x*(i+1));
        }
        // System.out.println(())
        return sum;
        
    }
}