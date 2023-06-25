/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.time.*;
import java.time.format.*;
import java.util.Scanner;

/**
 *
 * @author khami
 */
public class DateUtils {

    public static LocalDate inputDate(String msg, String format) {
        Scanner input = new Scanner(System.in);
        String dateString = null;
        DateTimeFormatter dateFormatter = null;
        while (true) {
            try {
                dateFormatter = DateTimeFormatter.ofPattern(format);
                System.out.print(msg + ": ");
                dateString = input.nextLine();
                return LocalDate.parse(dateString, dateFormatter);
            } catch (DateTimeException dateTimeException) {
                LocalDate sampleDate = Year.now().minusYears(1).atMonth(Month.DECEMBER).atDay(23);
                System.err.println("Invalid date: " + dateString + "\n"
                        + "Only input date in [" + format + "] format, for example " + sampleDate.format(dateFormatter));
            }

        }
    }
}
