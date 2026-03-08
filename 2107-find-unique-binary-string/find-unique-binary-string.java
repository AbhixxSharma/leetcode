class Solution {
    public String findDifferentBinaryString(String[] nums) {


        StringBuilder sb= new StringBuilder();
        for(int i=0;i<nums.length;i++){
            if(nums[i].charAt(i)=='0'){
                sb.append('1');
            }
            else{
                sb.append('0');
            }
        }
        return sb.toString();
    //     HashSet<String> set= new HashSet<>();
    //     for(int i=0;i<nums.length;i++){
    //         set.add(nums[i]);
    //     }
        
    //     for(int i=0;i<nums.length;i++){
    //         String  x=rev(nums[i]);
    //         if(!set.contains(x)){
    //             return x;
    //         }
    //     }
    //     String z=nums[0];
    //     String ans="";
    //     for(int i=0;i<z.length();i++){
    //         if(z.charAt(i)=='0'){
    //             ans+='1';
    //         }
    //         else{
    //             ans+='0';
    //         }
    //     }
    //     return ans;
        
    // }
    // static String rev(String s){
    //     String str="";
    //     for(int i=s.length()-1;i>=0;i--){
    //         str+=s.charAt(i);
    //     }
    //     return str;

    }
}