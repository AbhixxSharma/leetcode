class Solution {
    public boolean hasAlternatingBits(int n) {
       
       String binary = "";

 while (n > 0) {
      binary = (n % 2) + binary;
       n= n / 2;
    }
    boolean flag=true;
    for(int i=0;i<binary.length()-1;i++){
        if(binary.charAt(i)==binary.charAt(i+1)){
           return false;
        }
    }
    return true;


    }
}