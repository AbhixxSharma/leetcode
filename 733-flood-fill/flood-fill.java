class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int org=image[sr][sc];
        if(color==org){
            return image;
        }
        dfs(image,sr,sc,org,color);
        return image;
        
    }
    public void dfs(int [][]img,int r,int c,int org,int color){
        if(r<0||c<0||r>=img.length||c>=img[0].length) return ;

        if(img[r][c]!=org){
            return;
        }
        img[r][c]=color;
        dfs(img,r+1,c,org,color);
        dfs(img,r-1,c,org,color);
        dfs(img,r,c+1,org,color);
        dfs(img,r,c-1,org,color);


    }
}