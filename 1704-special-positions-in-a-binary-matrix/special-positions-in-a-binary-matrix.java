class Solution {
    public int numSpecial(int[][] mat) {
        int cnt=0;
        int m=0;
        int n=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){

                   boolean flag=true;
                   for(int c=0;c<mat.length;c++){
                     if(c!=i && mat[c][j]==1){
                        flag= false;
                        break;
                     }
                   }
                   for(int r=0;r<mat[0].length;r++){
                    if(r!=j&& mat[i][r]==1){
                        flag=false;
                        break;
                    }
                   }
                   if(flag){
                    cnt++;
                }

                }
            }
        }

                return cnt;
        
    }
}
    