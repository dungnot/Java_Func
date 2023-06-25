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
        LocalDate date = utils.DateUtils.inputDate("Please enter date with format [dd/mm/yyyy]", "dd/MM/yyyy");
        System.out.println("Your date is " + date.getDayOfWeek());
    }
}
