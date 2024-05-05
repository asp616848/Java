public class BTmazeAll {
    static int count = 0;

    //this code is to print all paths of a 3*3 maze with movement possible in 4 directions
    public static void main(String[] args) {
        boolean[][] board = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
    };
    paths(board, "", 0,0 );
    System.out.println("Total paths:"+count);
    }
    public static void paths(boolean[][] board, String p, int r, int c) {
        if (r==2 && c==2){
            System.out.println(p);
            count++;
            return;
        }
        if(!board[r][c]){
            return;
        }
         board[r][c] = false;
        if(r<2){
            paths(board, p+"D", r+1, c);
        }
        if(r>0){
            paths(board, p+"U", r-1, c);
        }
        if(c<2){
            paths(board,p+"R", r, c+1);
        }
        if(c>0){
            paths(board, p+"L", r, c-1);
        }
        board [r][c] = true;

    }
}
