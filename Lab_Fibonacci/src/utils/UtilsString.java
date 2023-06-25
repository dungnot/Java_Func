
package utils;


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
