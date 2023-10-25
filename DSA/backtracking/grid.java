package chauhan.DSA.backtracking;

public class grid {

    public static void main(String[] args) {
        int n = 3, m = 4;
        System.out.println("No. of grid Ways in "+n+"*"+m+" grid = "+gridWays(0, 0, n, m));
        int[][] grid = new int[n][m];
        printGridWays(grid,0,0);
    }

    public static int gridWays(int i,int j, int n, int m){
        //base case
        if(i==n-1 && j==m-1){
            return 1;
        }
        else if(i==n || j==m){
            return 0;
        }

        //recursion
        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);

        return w1+w2;
    }

    public static void printGridWays(int[][] grid,int row,int col){
        //base case
        if(row==grid.length-1 && col==grid[0].length-1){
            grid[row][col] = 1;
            printGrid(grid);
            return;
        }
        else if(row==grid.length || col==grid[0].length){
            return;
        }

        //recursion
        grid[row][col] = 1;
        printGridWays(grid,row+1,col); //Down
        printGridWays(grid,row,col+1); //Right
        grid[row][col] = 0;
    }

    static void printGrid(int[][] grid){
        System.out.println("-------------");
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[0].length;col++){
                System.out.print(grid[row][col]+" ");
            }
            System.out.println();
        }
    }


}
