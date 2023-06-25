/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import bo.Counter;
import java.util.Map;
import java.util.Set;
import utils.Utils;

/**
 *
 * @author khami
 */
public class Main {

    public static void main(String[] args) {
        // welcome 
        System.out.println("===Letter and character count===");

        // input string from user
        String content = Utils.inputString("Enter your content: ");
        // display count

        System.out.println(Counter.countLetter(content));
        System.out.println(Counter.countCharacter(content));
    }

}
