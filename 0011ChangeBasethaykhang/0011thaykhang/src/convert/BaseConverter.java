package convert;

import java.math.BigInteger;
import model.BaseType;

public class BaseConverter {

    private static String CHARACTERS = "0123456789ABCDEF";

    public static String convert(BaseType baseInput, BaseType baseOutput, String value) throws Exception {

        String test = CHARACTERS.substring(0, baseInput.getIntValue());
        for (int i = 0; i < value.length(); i++) {
            if (!test.contains(value.charAt(i) + "")) {
                throw new Exception("Value input have invalid character! ");
            }
        }

        if (baseInput.equals(baseOutput)) {
            value = value.replaceAll("^0+", "");
            return value.isEmpty() ? "0" : value;
        }

        value = baseToDecimal(value, baseInput);

        if (baseOutput == BaseType.DECIMAL) {
            return value;
        }
        return decimalToOthers(value, baseOutput.getIntValue());

//        if (value.matches("^(0)*$") || baseInput == baseOutput) {   
//            return value;
//        }
//        if(baseInput.equals(baseOutput)){
//                                 
//            return value.replaceAll("^0+", "");                                                                             // at least 0  VD: 0011 - 11
//        }
//        String result = null;
//        if (baseOutput == BaseType.DECIMAL) {
//            result = baseToDecimal(value, baseInput);
//        } else if (baseOutput== BaseType.HEXADECIMAL) {
//            result = baseToHexaDecimal(value, baseInput);
//        } else if (baseOutput== BaseType.BINARY) {
//            result = baseToBinary(value, baseInput);
//        }
//        return result;
    }

    private static String baseToDecimal(String decimal, BaseType baseType) {
        int ret = 0;
        for (int i = 0; i < decimal.length(); i++) {
            ret += CHARACTERS.indexOf(decimal.charAt(i)) * Math.pow(baseType.getIntValue(), decimal.length() - i - 1);
        }
        return ret + "";
    }

    private static String decimalToOthers(String value, int baseOutput) {

        BigInteger newValue = new BigInteger(value);
        StringBuilder result = new StringBuilder("");
        while (newValue.compareTo(new BigInteger("0")) > 0) {
            int remainder = Integer.parseInt(newValue.mod(new BigInteger(String.valueOf(baseOutput))).toString());
            result = result.append(CHARACTERS.charAt(remainder));
            newValue = newValue.divide(new BigInteger(String.valueOf(baseOutput)));
        }
        return result.reverse().toString();
    }

//    private static String baseToHexaDecimal(String value, BaseType baseType) {
//        if (baseType == BaseType.BINARY) {
//            return binaryToHexaDecimal(value);
//        }
//        return decimalToOthers(value, 16);
//    }
//
//    private static String baseToBinary(String value, BaseType baseType) {
//        if (baseType == BaseType.HEXADECIMAL) {
//            return hexaDecimalToBinary(value);
//        }
//        return decimalToOthers(value, 2);
//    }
//
//    private static String binaryToHexaDecimal(String input) {
//        StringBuilder result = new StringBuilder("");
//        String subBinary;
//        int length = input.length();
//
//        int step = (int) Math.ceil(1.0 * length / 4);
//
//        System.out.println("step = " + step);
//        for (int i = step - 1; i >= 0; i--) {
//            if (i == 0) {
//                subBinary = input.substring(0, length);
//            } else {
//                subBinary = input.substring(length - 4, length);
//            }
//
//            int digit = Integer.parseInt(baseToDecimal(subBinary, BaseType.BINARY));
//
//            result = result.append(CHARACTERS.charAt(digit));
//
//            length -= 4;   // reduce 4 elements to continue the loop
//        }
//        return result.reverse().toString();
//
//    }
//
//    private static String hexaDecimalToBinary(String input) {
//        StringBuilder result = new StringBuilder("");
//
//        for (int i = 0; i < input.length(); i++) {
//            String subBinary = "";
//
//            int digit = CHARACTERS.indexOf(input.charAt(i));
//
//            subBinary = subBinary.concat(decimalToOthers(Integer.toString(digit), 2));
//
//            if (i > 0 && subBinary.length() < 4) {                                                                                                        // when the result has length < 4, then append 0 to make 4
//                for (int j = 0; j < 4 - subBinary.length(); j++) {
//                    result = result.append("0");
//                }
//            }
//
//            result = result.append(subBinary);
//        }
//        return result.toString();
//    }
}
