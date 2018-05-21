/*
Write a function

TripleDouble(long num1,long num2)

which takes in numbers num1 and num2 and returns 1if there is a straight triple of a number at any place in num1 and
also a straight double of the same number in num2.
*/

package pl._8kyu;

public class TripleTrouble {
    public static String tripleTrouble(String one, String two, String three){
        StringBuilder solution = new StringBuilder();
        int length = one.length();
        for (int i = 0; i < length; i++) {
            solution.append(one.charAt(i)).append(two.charAt(i)).append(three.charAt(i));
        }
        return solution.toString();
    }
}

