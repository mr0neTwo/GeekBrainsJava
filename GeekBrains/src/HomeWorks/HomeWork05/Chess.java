package HomeWorks.HomeWork05;

public class Chess {
    public static void main(String[] args) {
        int[][] board = new int[8][8];
       
        for (int row = 0; row < 8; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < 8; col++) {
                    if (isSafe(board, row, col)) {
                        board[row][col] = 1;
                    }
                }
            } else {
                for (int col = 7; col >= 0; col--) {
                    if (isSafe(board, row, col)) {
                        board[row][col] = 1;
                    }
                }
            }
            
        }

        // выводим получившуюся доску
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // функция проверяет, что ферзь не бьет других ферзей
    static boolean isSafe(int[][] board, int row, int col) {
        int i, j;

        // проверяем строку
        for (i = 0; i < 8; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        // проверяем столбец
        for (i = 0; i < 8; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // проверяем диагонали
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (i = row, j = col; i < 8 && j < 8; i++, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (i = row, j = col; j >= 0 && i < 8; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (i = row, j = col; j < 8 && i >= 0; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }
}
