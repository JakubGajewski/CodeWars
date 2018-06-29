//https://www.codewars.com/kata/jumping-number-special-numbers-series-number-4/train/java
//Jumping number is the number that All adjacent digits in it differ by 1.

package pl._7kyu;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JumpingNumber {
    public static String jumpingNumber(int number) {
        int[] digitArray = Stream.of(String.valueOf(number).split("")).mapToInt(Integer::parseInt).toArray();
        if(IntStream.range(1,digitArray.length).allMatch(i -> Math.abs(digitArray[i-1] - digitArray[i]) == 1)) {
            return "Jumping!!";
        }
        return "Not!!";
    }

    /*
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
*/
}


