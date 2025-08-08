class Solution {

    public boolean isSafe(char[][] board, int row, int col, int num) {
        // row and column check
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (num + '0')) return false;
            if (board[row][i] == (char) (num + '0')) return false;
        }

        // 3x3 grid check
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char) (num + '0')) return false;
            }
        }
        return true;
    }

    public boolean helper(char[][] board, int row, int col) {
        if (row == board.length) {
            return true; // solved
        }

        int nrow = 0;
        int ncol = 0;

        if (col != board.length - 1) {
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }

        if (board[row][col] != '.') {
            // already filled, move ahead
            return helper(board, nrow, ncol);
        } else {
            // try placing numbers 1-9
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char) (i + '0');
                    if (helper(board, nrow, ncol)) {
                        return true;
                    }
                    board[row][col] = '.'; // backtrack
                }
            }
        }
        return false;
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
}
