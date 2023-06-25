/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import bo.MatrixCalculator;
import model.Matrix;
import utils.Validate;

/**
 *
 * @author AMIN
 */
public class Main {

    // menu
    public static void menu() {
        System.out.println("======= Calculator Program =======");
        System.out.println("1.Addition matrix");
        System.out.println("2.Subtraction matrix");
        System.out.println("3.Multiplication matrix");
        System.out.println("4.Quit");

    }

    public static void main(String[] args) throws Exception {

        MatrixCalculator c1 = new MatrixCalculator();
        Matrix matrix1 = new Matrix();
        Matrix matrix2 = new Matrix();
        Matrix result;

        while (true) {
            menu();
            int choice = Validate.getChoice();
            switch (choice) {

                case 1:
                    System.out.println("------------Addition matrixes----------------");
                    System.out.println(" Enter matrix 1: ");
                    matrix1.inputSizeMatrix();
                    matrix1.inputMatrix();
                    System.out.println(" Enter matrix 2: ");
                    matrix2.inputSizeMatrix();
                    // check same size
                    c1.checkMatrix(matrix1, matrix2);
                    matrix2.inputMatrix();
                    // Addition
                    result = c1.add(matrix1, matrix2);

                    System.out.println("============resutl================");
                    System.out.println(matrix1);
                    System.out.println("+");
                    System.out.println(matrix2);
                    System.out.println("=");
                    System.out.println(result);
                    System.out.println("----------------------------");
                    break;
                    
                case 2:
                    System.out.println("------------Subtraction matrixes-------------- ");
                    System.out.println(" Enter matrix 1: ");
                    matrix1.inputSizeMatrix();
                    matrix1.inputMatrix();
                    System.out.println(" Enter matrix 2: ");
                    matrix2.inputSizeMatrix();
                    // check same size
                    c1.checkMatrix(matrix1, matrix2);
                    matrix2.inputMatrix();
                    // Subtraction
                    result = c1.sub(matrix1, matrix2);

                    System.out.println("============resutl================");
                    System.out.println(matrix1);
                    System.out.println("-");
                    System.out.println(matrix2);
                    System.out.println("=");
                    System.out.println(result);
                    System.out.println("----------------------------");
                    break;
                    
                case 3:
                    System.out.println("------------Multiplication matrixes-----------");
                    System.out.println(" Enter matrix 1: ");
                    matrix1.inputSizeMatrix();
                    matrix1.inputMatrix();
                    System.out.println(" Enter matrix 2: ");
                    matrix2.inputSizeMatrix();
                    // check valid
                    c1.checkMatrixMulti(matrix1, matrix2);
                    matrix2.inputMatrix();
                    // Multiple
                    result = c1.multiple(matrix1, matrix2);

                    System.out.println("============resutl================");
                    System.out.println(matrix1);
                    System.out.println("*");
                    System.out.println(matrix2);
                    System.out.println("=");
                    System.out.println(result);
                    System.out.println("----------------------------");
                    break;
                    
                case 4:
                    System.out.println("Exit program.");
                    System.exit(0);
                    break;
//                
            }
        }

    }

}
