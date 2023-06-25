/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.time.LocalDate;

/**
 *
 * @author khami
 */
public class Main {

    public static void main(String[] args) {
        LocalDate date1 = utils.DateUtils.inputDate("Please enter the first date with format [dd/mm/yyyy]", "dd/MM/yyyy");
        LocalDate date2 = utils.DateUtils.inputDate("Please enter the second date with format [dd/mm/yyyy]", "dd/MM/yyyy");
        int i = date1.compareTo(date2);
        if (i>0) {
            System.out.println("Date 1 is after Date 2.");
        } else if (i<0) {
            System.out.println("Date 1 is before Date 2.");
        } else {
            System.out.println("Date 1 and Date 2 are the same date.");
        }
    }
}
