class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int arr[][]= new int[grid.length][grid[0].length];

        long pro=1;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                arr[i][j]=(int)pro;
                pro=(pro*grid[i][j])%12345;
            }
        }
        pro=1;
        for(int i=grid.length-1;i>=0;i--){
            for(int j=grid[0].length-1;j>=0;j--){
               arr[i][j]=  (int)((arr[i][j] * pro) % 12345);
                pro=(pro*grid[i][j])%12345;
            }
        }
        return arr;

        //         for(int k=0;k<grid.length;k++){
        //             for(int l=0;l<grid[0].length;l++){
        //                 if(i==k && j==l){continue;
        //                 }

        //                 pro=(pro*grid[k][l])%12345;
        //             }


        //         }
        //         arr[i][j]=(int)pro;
                    

        //         }
        //     }
        //     return arr;
        }
        
    
}