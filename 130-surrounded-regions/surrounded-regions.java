class Solution {
    public void solve(char[][] board) {
       for(int i=0;i<board[0].length;i++){
         if(board[0][i]=='O'){
            bfs(board,0,i);
    }
         if(board[board.length-1][i]=='O'){
           bfs(board,board.length-1,i);
    }
}
      for(int j=0;j<board.length;j++){
    if(board[j][0]=='O'){
        bfs(board,j,0);
    }
    if(board[j][board[0].length-1]=='O'){
        bfs(board,j,board[0].length-1);
    }
}
       for(int i=0;i<board.length;i++){
        for(int j=0;j<board[0].length;j++){
            if(board[i][j]=='O'){
                board[i][j]='X';
            }

            if(board[i][j]=='V'){
                board[i][j]='O';
            }
        }

       }
        
    }
    public void bfs(char[][] board,int r,int c){
        Queue<int[]> q1= new LinkedList<>();
        q1.add( new int[]{r,c});
        board[r][c]='V';
        while(!q1.isEmpty()){
            int x[]=q1.poll();
            int row=x[0];
            int col= x[1];
            if(row+1<board.length&& board[row+1][col]=='O'){
                 board[row+1][col]='V';
                 q1.add(new int[]{row+1,col});
            }
            if(row-1>=0&& board[row-1][col]=='O'){
                 board[row-1][col]='V';
                 q1.add(new int[]{row-1,col});

            }
            if(col+1<board[0].length&&board[row][col+1]=='O'){
                 board[row][col+1]='V';
                 q1.add(new int[]{row,col+1});
            }
             if(col-1>=0&&board[row][col-1]=='O'){
                 board[row][col-1]='V';
                 q1.add(new int[]{row,col-1});
            }

        }
    }

}