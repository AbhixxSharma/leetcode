class Solution {
    public boolean rotateString(String s, String goal) {
        boolean flag=false;
        String s2= s+s;
        
       if(s.length()==goal.length()){

       if( s2.contains(goal)){;
        flag=true;
       }
       }

       return flag;

    }

}