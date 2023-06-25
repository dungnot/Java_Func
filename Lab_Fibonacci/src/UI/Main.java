/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BO.Fibonacci;
import BO.normalFibonacci;

/**
 *
 * @author khami
 */
public class Main {

    private static final int LENGTH_OF_SEQUENCE = 45;

    public static void main(String[] args) {
        // welcome
        System.out.println("===fibonacci===".toUpperCase());
        // display 45 sequence Fibonacci

        // time start
        long startTime = System.nanoTime();
        // program
        System.out.println("The 45 sequence fibonacci:\n" + Fibonacci.getList(LENGTH_OF_SEQUENCE).toString());
        System.out.println("Numer in 45th: " + Fibonacci.getNumber(45));

    }


   

}
