class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> lst= new ArrayList<>();
        genrate(n,0,0,"",lst);
        return lst;
        
    }


    void genrate(int n ,int opn,int cls,String str,List<String>lst){
        if(opn == n && cls== n){
            lst.add(str);
            return;
        }

        if(n>opn){
            genrate(n,opn+1,cls,str+'(',lst);

        }

        if(opn>cls){
            genrate(n,opn,cls+1,str+')',lst);

        }
        // lst.remove(lst.size()-1);

            }
}