/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0074;

import java.util.Scanner;

/**
 *
 * @author doan7
 */
class Validate {

    Scanner sc = new Scanner(System.in);

    public int getChoice() {
        int number = 0;

        do {
            System.out.print("Your choice: ");
            try {
                number = Integer.parseInt(sc.nextLine());
                if (number < 1 || number > 4) {
                    System.out.println("Input number 1-4 ");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Please input valid number ");
                continue;
            }
            break;
        } while (true);
        return number;
    }

    public void printMenu() {
        System.out.println("========= Calculator Program =========");
        System.out.println("1. Addition Matrix");
        System.out.println("2. Subtraction Matrix");
        System.out.println("3. Multiplication Matrix");
        System.out.println("4. Quit");
    }

    int getsize(String mess) {
        int n;

        while (true) {
            System.out.print(mess);
            try {
                n = Integer.parseInt(sc.nextLine());
                if (n <= 0) {
                    System.out.println("The row and column must be greater than 0");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("The valid must be a number");
                continue;
            }
            break;
        }
        return n;
    }

    int getNumber() {
        int number;
        while (true) {
            try {
                number = Integer.parseInt(sc.nextLine());

            } catch (Exception e) {
                System.out.println("The valid must be a number");
                continue;
            }
            break;
        }
        return number;
    }

    int[][] getmatrix(int m, int row, int col) {
        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter Matrix" + m + "[" + i + "]" + "[" + j + "]: ");
                matrix[i][j] = getNumber();
            }
        }
        return matrix;
    }

    public void add() {
        System.out.println("Enter 2 matrixs have a same size row and column ");
        int row1 = getsize("Enter row of matrix 1: ");
        int col1 = getsize("Enter column of matrix 1: ");
        int[][] matrix1 = getmatrix(1, row1, col1);

        int[][] matrix2 = getmatrix(2, row1, col1);
        int[][] matrix3 = add2Matrix(matrix1, matrix2, row1, col1);
        System.out.println("--------------------Result-------------------");
        display(matrix1, row1, col1);
        System.out.println("+");
        display(matrix2, row1, col1);
        System.out.println("=");
        display(matrix3, row1, col1);

    }

    public int[][] add2Matrix(int[][] matrix1, int[][] matrix2, int row, int col) {
        int[][] matrix3 = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrix3;
    }

    public void sub() {
        System.out.println("Enter 2 matrixs have same size row and column ");
        int row1 = getsize("Enter row of matrix 1: ");
        int col1 = getsize("Enter column of matrix 1: ");
        int[][] matrix1 = getmatrix(1, row1, col1);

        int[][] matrix2 = getmatrix(2, row1, col1);
        int[][] matrix3 = sub2Matrix(matrix1, matrix2, row1, col1);
        System.out.println("--------------------Result-------------------");
        display(matrix1, row1, col1);
        System.out.println("-");
        display(matrix2, row1, col1);
        System.out.println("=");
        display(matrix3, row1, col1);

    }

    public int[][] sub2Matrix(int[][] matrix1, int[][] matrix2, int row, int col) {
        int[][] matrix3 = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix3[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return matrix3;
    }

    public void multi() {
        int row1 = getsize("Enter row of matrix 1: ");
        int col1 = getsize("Enter cols of matrix 1: ");
        int matrix1[][] = getmatrix(1, row1, col1);
        int row2 = 0;
        int col2 = 0;
        do {
            row2 = getsize("Enter row of matrix 2: ");
            if (row2 != col1) {
                System.out.println("row 2 must equal col 1:");
                continue;
            }
            col2 = getsize("Enter col of matrix 2: ");
            break;
        } while (true);
        int matrix2[][] = getmatrix(2, row2, col2);
        int matrix3[][] = multi2marix(matrix1, matrix2, row1, row2, col2);
        System.out.println("-------------------Result--------------------");
        display(matrix1, row1, col1);
        System.out.println("x");
        display(matrix2, row2, col2);
        System.out.println("=");
        display(matrix3, row1, col2);
    }

    public int[][] multi2marix(int[][] matrix1, int[][] matrix2, int row1, int row2, int col2) {
        int[][] matrix3 = new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < row2; k++) {
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return matrix3;
    }

    static void display(int[][] matrix, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println("");
        }

    }

}
