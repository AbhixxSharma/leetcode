class Solution {
    public long sumAndMultiply(int n) {
        // int z=n;
        String s= String.valueOf(n);;
        // char s[]= str.toCharArray();
        
        StringBuilder sb = new StringBuilder();
        String z="";
        for(char c : s.toCharArray()) {
            if (c != '0') sb.append(c);
        }
         if (sb.length() == 0) return 0;
            
        
       long x = Long.parseLong(sb.toString());
        long sum = 0;
        for(char c :sb.toString().toCharArray()){
            sum += c - '0';
        }

        return x * sum;
        
        // int x=n;
        // long sum=0;
        // while(x!=0){
        //     int r=x%10;
        //     sum=sum+r;
        //     x/=10;
            
        // }
        
    }
}