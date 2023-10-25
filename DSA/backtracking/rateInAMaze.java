package chauhan.DSA.backtracking;

public class rateInAMaze {

    public static void main(String[] args) {
        int[][] maze = {
                {1,0,0,0},
                {1,1,0,1},
                {0,1,0,0},
                {1,1,1,1}
        };

        int[][] ans = new int[4][4];

        escapingWays(maze,ans,0,0);
    }

    public static void escapingWays(int[][] maze,int[][] ans,int row,int col){
        //base condition
        if(row==maze.length-1 && col==maze.length-1){
            ans[row][col] = 1;
            System.out.println("---------------------------");
            printEscapingRoute(ans);
            return;
        }else if(row==-1 || row==maze.length || col==-1 || col==maze.length || maze[row][col]==0){
            return;
        }

        //recursion
        maze[row][col] = 0; //to mark already visited so that we will not be trapped in an infinite recursion

        ans[row][col] = 1;
        escapingWays(maze,ans,row+1,col); //down
        escapingWays(maze,ans,row,col+1); //right
        escapingWays(maze,ans,row,col-1); //left
        escapingWays(maze,ans,row-1,col); //up
        ans[row][col] = 0;

        maze[row][col] = 1; //mark as unvisited i.e. undo maze in its previous stage

    }

    static void printEscapingRoute(int[][] ans){
        int n = ans.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
