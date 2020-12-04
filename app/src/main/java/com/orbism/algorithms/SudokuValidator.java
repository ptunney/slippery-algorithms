package com.orbism.algorithms;

public class SudokuValidator {

    public boolean isValid(int[][] sudokuGrid) {
        boolean verticalValid = verticalCheck(sudokuGrid);
        boolean horizontalValid = horizontalCheck(sudokuGrid);
        return verticalValid && horizontalValid;
    }

    public boolean verticalCheck(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            boolean valid = checkUniqueGrid(sudoku, 9, i, 0);
            if (!valid) return false;
        }
        return true;
    }

    public boolean horizontalCheck(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            int rowSum = 0;
            for (int j = 0; j < 9; j++) {
                rowSum += sudoku[j][i];
            }

            if (rowSum != 45) return false;
        }        
        return true;
    }

    public boolean checkUniqueGrid(int[][] input, int range, int startX, int startY) {
        int[] uniqueRow = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        for (int j = 0; j < range; j++) {
            int curValue = input[startX][+j];
            int numVal = uniqueRow[curValue - 1];
            if (numVal > 0) {
                return false;
            } else {
                uniqueRow[curValue - 1]++;
            }
        }
        return true;
    }

public boolean subCheck(int[][] sudoku) {
    for (int i = 0; i < 3; i++) {
        int[] uniqueRow = {0,0,0,0,0,0,0,0,0};
        for(int j = 0; j <3; j++) {
            int curValue = sudoku[i][j];
            int numVal = uniqueRow[curValue-1];
            if (numVal > 0) {
                return false;
            } else {
                uniqueRow[curValue-1]++;
            }
        }
        for(int j = 0; j <3; j++) {
            int curValue = sudoku[i+1][j];
            int numVal = uniqueRow[curValue-1];
            if (numVal > 0) {
                return false;
            } else {
                uniqueRow[curValue-1]++;
            }
        }
        
        for(int j = 0; j <3; j++) {
            int curValue = sudoku[i+1][j];
            int numVal = uniqueRow[curValue-1];
            if (numVal > 0) {
                return false;
            } else {
                uniqueRow[curValue-1]++;
            }
        }
    }
    return true;
}

    public static void main(String[] args) {

    }

}