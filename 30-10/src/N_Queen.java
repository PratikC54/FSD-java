public class N_Queen {
    static void nqueen(int row,char[][]board){
        if(row==board.length){
            for(int i=0;i<board.length;i++){
                for (int j=0;j<board.length;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for (int column=0;column<board.length;column++) {
            if(isSafe(board,row,column)) {
                board[row][column] = 'Q';
                nqueen(row + 1, board);
                board[row][column] = 'X';
            }
        }
    }

    static boolean isSafe(char[][] board, int row, int column){
        int n=board.length;

        //Checking on right side
        for (int j=0;j<n;j++){
            if (board[row][j]=='Q') return false;
        }

        //Checking on left side
        for (int i=0;i<n;i++){
            if (board[i][column]=='Q') return false;
        }

        //Checking on down-right-corner side
        int i=row,j=column;
        while(i<n && j<n) {
            if(board[i][j]=='Q') return false;
            i++;
            j++;
        }

        //Checking on down-left-corner side
        i=row;
        j=column;
        while(i<n && j>=0) {
            if(board[i][j]=='Q') return false;
            i++;
            j--;
        }

        //Checking on up-left-corner side
        i=row;
        j=column;
        while(i>=0 && j>=0) {
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }

        //Checking on up-right-corner side
        i=row;
        j=column;
        while(i>=0 && j<n) {
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }

        return true;
    }

    public static void main(String[] args) {
        int n=7;
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        nqueen(0,board);
    }
}
