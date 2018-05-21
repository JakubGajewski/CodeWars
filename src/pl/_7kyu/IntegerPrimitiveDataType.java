/*Java supports different integer primitive data types. Each type has an individual range:

    byte: 8-bit signed two's complement integer
    short: 16-bit signed two's complement integer
    int: 32-bit signed two's complement integer
    long: 64-bit signed two's complement integer

We have got a huge list of integer-strings and we want to categorize all of them. Find the smallest possible data type of the enumeration for a given integer.

To solve it, complete the following method:*/

package pl._7kyu;

import java.math.*;

public class IntegerPrimitiveDataType {

    public static String determineType(String number) {

        try {
            Byte.parseByte(number);
            return "byte";
        } catch (java.lang.NumberFormatException a) {
        }
        try {
            Short.parseShort(number);
            return "short";
        } catch (java.lang.NumberFormatException b) {
        }
        try {
            Integer.parseInt(number);
            return "int";
        } catch (java.lang.NumberFormatException c) {
        }
        try {
            Long.parseLong(number);
            return "long";
        } catch (java.lang.NumberFormatException d) {
        }
        return "none";
    }
}


//Another solutions:

/*package pl._7kyu;

import java.math.*;

public class IntegerPrimitiveDataType {
    public static String determineType(String number) {
        try {
            Byte.parseByte(number);
            return "byte";
        } catch (java.lang.NumberFormatException a) {
            try {
                Short.parseShort(number);
                return "short";
            } catch (java.lang.NumberFormatException b) {
                try {
                    Integer.parseInt(number);
                    return "int";
                } catch (java.lang.NumberFormatException c) {
                    try {
                        Long.parseLong(number);
                        return "long";
                    } catch (java.lang.NumberFormatException d) {
                        return "none";
                    }
                }
            }
        }
    }
}*/