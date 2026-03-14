class Solution {
    List<String> lst= new ArrayList<>();
    public String getHappyString(int n, int k) {
        generate("",n);
        Collections.sort(lst);

        if (k > lst.size()) {
            return "";
        }
        return lst.get(k-1);
        
    }
    public void generate(String s,int n){

        if(n==s.length()){
            if(isHappy(s)){
            lst.add(s);
        }
        return;
        }
        generate(s+"a",n);
         generate(s+"b",n);
          generate(s+"c",n);

    }
    public boolean isHappy(String s){
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
}