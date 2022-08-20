class Solution {
//      public  boolean isValidPosition(int num ,int row,int col,int board[][]) {
//     for (int i = 0; i < 9; i++) {
//       if (board[i][col] == num)
//         return false;

//       if (board[row][i] == num)
//         return false;

//       if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == num)
//         return false;
//     }
//     return true;
//   }

    public boolean isValidPosition(int num ,int row,int column,char board[][])
    {//System.out.println(num);
        for(int k=0;k<board[row].length;k++)
        {
            if(num==board[row][k]-'0')
                return false;
        }
        
        for(int k=0;k<board.length;k++)
        {
            if(num==board[k][column]-'0')
                return false;
        }
        
        int row_r=3* (row/3+1);
        int row_l=row_r-3;
        int col_r=3*(column/3+1);
        int col_l=col_r-3;
        
        for(int a=row_l;a<row_r;a++)
        {
            for(int b=col_l;b<col_r;b++)
            {
                if(board[a][b]-'0'==num)
                    return false;
            }
        }
        
        return true;
    }
    
    public boolean backtrack(char b[][])
    {//System.out.println(count);
       
      int count=0;
      //  System.out.println(i + " " +j);
       
       for(int i=0;i<b.length;i++)
       {
           for(int j=0;j<b[i].length;j++)
            
               if(b[i][j]=='.')
               { 
                  
        for(char opt='1';opt<='9';opt++)
        {
            if(isValidPosition(opt-'0',i,j,b))
            {
                char  temp=b[i][j];
                b[i][j]=opt;
if(backtrack(b))
{
   // System.out.println("l");
    return true;
}
               
                b[i][j]=temp;
            }
           
               // System.out.println(false);
        }
                   return false;
  }
       }
        
        return true;
    
       }
     
    public void solveSudoku(char[][] board) {
        int b[][]=new int [board.length][board[0].length];
        int count=0;
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[0].length;j++)
            {
                if(board[i][j]=='.')
                { 
                    b[i][j]=0;
                    count++;
                }
                else
                b[i][j]=board[i][j]-'0';
            }
        }
        
        
        
       
                    
                    
                
                  // System.out.print(b[i][j]+ " ");
              
                    backtrack(board);
                  
                
      
        }
  }