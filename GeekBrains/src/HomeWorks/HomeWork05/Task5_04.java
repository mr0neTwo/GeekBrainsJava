package HomeWorks.HomeWork05;

public class Task5_04 {
    
    private final int maxValue = 8;
    private final int[][] board = new int[maxValue][maxValue];
    public void start() {
        
       
        for (int row = 0; row < maxValue; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < maxValue; col++) {
                    if (isSafe(board, row, col)) {
                        board[row][col] = 1;
                    }
                }
            } else {
                for (int col = maxValue - 1; col >= 0; col--) {
                    if (isSafe(board, row, col)) {
                        board[row][col] = 1;
                    }
                }
            }
            
        }
        
        printBoard();
    }

    private void printBoard() {
        for (int i = 0; i < maxValue; i++) {
            for (int j = 0; j < maxValue; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // функция проверяет, что ферзь не бьет других ферзей
    private boolean isSafe(int[][] board, int row, int col) {
        int i, j;

        // проверяем строку
        for (i = 0; i < maxValue; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        // проверяем столбец
        for (i = 0; i < maxValue; i++) {
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

        for (i = row, j = col; i < maxValue && j < maxValue; i++, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (i = row, j = col; j >= 0 && i < maxValue; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (i = row, j = col; j < maxValue && i >= 0; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }
}
