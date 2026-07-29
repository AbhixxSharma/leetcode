class Solution {
    public boolean exist(char[][] board, String word) {
        boolean vis[][]= new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(dfs(board,i,j,0,word,vis)) return true;
            }
        }
        return false;
        
    }
    boolean dfs(char[][]board,int i,int j,int ind,String word,boolean vis[][]){
        if(ind==word.length()) return true;
        if(i<0 || j<0 || i>=board.length|| j>=board[0].length|| board[i][j]!=word.charAt(ind)) return false;

        if(vis[i][j]==true)  return false;
        vis[i][j]=true;

        if(dfs(board,i+1,j,ind+1,word,vis)||dfs(board,i-1,j,ind+1,word,vis)||dfs(board,i,j+1,ind+1,word,vis)||dfs(board,i,j-1,ind+1,word,vis)) return true;


        vis[i][j]=false;
        return false;

    }
}