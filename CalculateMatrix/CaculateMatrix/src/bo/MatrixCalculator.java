/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import model.Matrix;


public class MatrixCalculator {

    private boolean is2MatrixSameSize(Matrix matrix1, Matrix matrix2) {
        return matrix1.getCol() == matrix2.getCol() && matrix1.getRow() == matrix2.getRow();
    }

    public void checkMatrix(Matrix matrix1, Matrix matrix2) {
        while (true) {
            try {
                if (is2MatrixSameSize(matrix1, matrix2)) {
                    break;
                } else {
                    throw new Exception("2 matrix is not same size, can not add or sub matrix");
                }
            } catch (Exception e) {
                System.out.println(" Please  enter again matrix follow : row1 = row2, col1 = col2");
                matrix2.inputSizeMatrix();
            }
        }

    }

    public Matrix add(Matrix matrix1, Matrix matrix2) throws Exception {
        return matrix1.add(matrix2);
    }

    public Matrix sub(Matrix matrix1, Matrix matrix2) throws Exception {
        return matrix1.sub(matrix2);
    }

    private static boolean isAllowMultiple2Matrix(Matrix matrix1, Matrix matrix2) {
        return (matrix1.getCol() == matrix2.getRow());

    }

    public void checkMatrixMulti(Matrix matrix1, Matrix matrix2) {
        while (true) {
            try {
                if (isAllowMultiple2Matrix(matrix1, matrix2)) {
                    break;
                } else {
                    throw new Exception("row2 is not same col1, can not multiple");
                }
            } catch (Exception e) {
                System.out.println(" Please enter again matrix(row2=col1)");
                matrix2.inputSizeMatrix();
            }
        }
    }

    public Matrix multiple(Matrix matrix1, Matrix matrix2) throws Exception {
        return matrix1.multiple(matrix2);
    }

}
