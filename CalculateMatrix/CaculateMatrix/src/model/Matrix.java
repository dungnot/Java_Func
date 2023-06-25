/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import utils.Validate;


public class Matrix {

    private int col;
    private int row;
    private int[][] matrix;

    public Matrix() {

    }

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        matrix = new int[row][col];
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void inputSizeMatrix() {
        row = Validate.getSize("Enter Row Matrix  : ");
        col = Validate.getSize("Enter Column Matrix  :");
    }

    public void inputMatrix() {
        matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = Validate.getSize("Enter Matrix[" + (i + 1) + "][" + (j + 1) + "] :");
            }
        }
    }

    @Override
    public String toString() {
        String ret = "";
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ret += ("[" + matrix[i][j] + "]");
            }
            ret += "\n";
        }
        return ret;
    }

    public Matrix add(Matrix m) throws Exception {
        if (m.getCol() != col || m.getRow() != row) {
            throw new Exception("2 matrix is not same size!");
        }
        Matrix ret = new Matrix(row, col);
        int[][] retMatrix = ret.getMatrix();
        int[][] mMatrix = m.getMatrix();
        // calculate add
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                retMatrix[i][j] = matrix[i][j] + mMatrix[i][j];
            }
        }
        return ret;
    }

    public Matrix sub(Matrix m) throws Exception {
        if (m.getCol() != col || m.getRow() != row) {
            throw new Exception("2 matrix is not same size!");
        }
        Matrix ret = new Matrix(row, col);
        int[][] retMatrix = ret.getMatrix();
        int[][] mMatrix = m.getMatrix();
        // calculate sub
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                retMatrix[i][j] = matrix[i][j] - mMatrix[i][j];
            }
        }
        return ret;
    }

    public Matrix multiple(Matrix m) throws Exception {
        if (m.getRow() != col) {
            throw new Exception("Row of matrix 1 is not same size col matrix 2");
        }
        Matrix ret = new Matrix(row, m.col);
        int[][] retMatrix = ret.getMatrix();
        int[][] mMatrix = m.getMatrix();
        // calculate multiple
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < m.col; j++) {
                for (int k = 0; k < m.row; k++) {
                    retMatrix[i][j] += matrix[i][k] * mMatrix[k][j];
                }
            }
        }
        return ret;
    }

}
