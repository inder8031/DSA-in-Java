package chauhan.DSA.backtracking;

public class knight {

    public static void main(String[] args) {
        int[][] board = {
                {-1,-1,-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,-1,-1}
        };
        //singleKnight(board,0,0,0);
        singleKnight(board,0,0);
        /*int[] x_Move = {2,1,-1,-2,-2,-1,1,2};
        int[] y_Move = {1,2,2,1,-1,-2,-2,-1};
        board[0][0] = 0;
        if(solveKtUtil(board,0,0,1,x_Move,y_Move)){
            printBoard(board);
        }
        else{
            System.out.println("Solution doesn't exists");
        }*/
    }

//commented one -> mine correct solution singleKnight
    /*public static boolean singleKnight(int[][] board,int row,int col,int count){
        if(count==64){
            printBoard(board);
            return true;
        }
        else if(row<0 || row>=board.length || col<0 || col>=board.length ||board[row][col]!=-1){
            return false;
        }

        //recursion
        board[row][col] = count;
        if(singleKnight(board,row+2,col+1,count+1))
            return true;
        if(singleKnight(board,row+1,col+2,count+1))
            return true;
        if(singleKnight(board,row-1,col+2,count+1))
            return true;
        if(singleKnight(board,row-2,col+1,count+1))
            return true;
        if(singleKnight(board,row-2,col-1,count+1))
            return true;
        if(singleKnight(board,row-1,col-2,count+1))
            return true;
        if(singleKnight(board,row+1,col-2,count+1))
            return true;
        if(singleKnight(board,row+2,col-1,count+1))
            return true;
        board[row][col] = -1;

        return false;
    }*/

    static int count = 0; //singleKnight using count as static variable, not as an argument of singleKnight

    public static boolean singleKnight(int[][] board,int row,int col){
        if(count==64){
            printBoard(board);
            return true;
        }
        else if(row<0 || row>=board.length || col<0 || col>=board.length ||board[row][col]!=-1){
            return false;
        }

        //recursion
        board[row][col] = count++;
        if(singleKnight(board,row+2,col+1))
            return true;
        if(singleKnight(board,row+1,col+2))
            return true;
        if(singleKnight(board,row-1,col+2))
            return true;
        if(singleKnight(board,row-2,col+1))
            return true;
        if(singleKnight(board,row-2,col-1))
            return true;
        if(singleKnight(board,row-1,col-2))
            return true;
        if(singleKnight(board,row+1,col-2))
            return true;
        if(singleKnight(board,row+2,col-1))
            return true;
        board[row][col] = -1;
        count--;

        return false;
    }

    public static boolean solveKtUtil(int[][] board,int x,int y,int move_i,int[] x_Move,int[] y_Move){
        int next_x,next_y;
        //base case
        if(move_i==64){
            return true;
        }

        //recursion
        for(int k=0;k<8;k++){
            next_x = x + x_Move[k];
            next_y = y + y_Move[k];
            if(isSafe(board,next_x,next_y)){
                board[next_x][next_y] = move_i;
                if(solveKtUtil(board,next_x,next_y,move_i+1,x_Move,y_Move)){
                    return true;
                }
                board[next_x][next_y] = -1; //backtracking
            }
        }
        return false;
    }

    static boolean isSafe(int[][] board,int x,int y){
        int n = board.length;
        return x>=0 && x<n && y>=0 && y<n && board[x][y]==-1;
    }

    static void printBoard(int[][] board){
        System.out.println("-------------");
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board.length;col++){
                System.out.print(board[row][col]+" ");
            }
            System.out.println();
        }
    }
}
