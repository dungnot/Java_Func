/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author khami
 */
public class UtilsString {
     public static String toCapitalize(String str){
        return str.substring(0, 1).toUpperCase()+ str.substring(1).toLowerCase();
    }
     
     public static String printReverseChar(String str) {
        if(str==null){
            return null;
        }
        String strReverse = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            strReverse = ch + strReverse;
        }
        return strReverse;
    }
     
     
}
