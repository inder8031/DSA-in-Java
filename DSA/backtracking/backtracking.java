package chauhan.DSA.backtracking;

public class backtracking {

    static int count = 0;

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];

        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                board[row][col] = '*';
            }
        }

        nKnights(board, 0);
        System.out.println(count);
    }

     static void nKnights(char[][] board, int row){
        //base
        if(row==board.length){
            //printBoard(board);
            count++;
            return;
        }

        //recursion
        for(int col=0;col<board.length;col++){
            if(isSafe(board, row, col)){
                board[row][col] = 'k';
                nKnights(board, row+1); //recursion
                board[row][col] = '*'; //backtracking
            }
        }
    }

     static boolean isSafe(char[][] board, int row, int col){
        if(row-1>=0 && col-2>=0){
            if(board[row-1][col-2]=='k')
                return false;
        }

        if(row-1>=0 && col+2<board.length){
            if(board[row-1][col+2]=='k')
                return false;
        }

        if(row-2>=0 && col-1>=0){
            if(board[row-2][col-1]=='k')
                return false;
        }

        if(row-2>=0 && col+1<board.length){
            if(board[row-2][col+1]=='k')
                return false;
        }

        return true;
    }

    public static void printBoard(char[][] board){
        System.out.println("------New combination--------");
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board.length;col++){
                System.out.print(board[row][col]+" ");
            }
            System.out.println();
        }
    }

}
