//https://www.codewars.com/kata/jumping-number-special-numbers-series-number-4/train/java
//Jumping number is the number that All adjacent digits in it differ by 1.

package pl._7kyu;

import java.util.Arrays;

public class JumpingNumber {
        public static String jumpingNumber(int number)
        {
            int previous = String.valueOf(number).charAt(0) - 48;
            int next;
            for (int i = 1; i < (number+"").length() ; i++) {
                next = String.valueOf(number).charAt(i) - 48;
                if (Math.abs(next - previous) != 1) {
                    return "Not!!";
                }
                previous = next;
            }
            return "Jumping!!";
        }
}


