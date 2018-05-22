package pl._6kyu;
/*
source: https://www.codewars.com/kata/rectangle-into-squares/train/java

The drawing below gives an idea of how to cut a given "true" rectangle into squares ("true" rectangle meaning that the two dimensions are different).

alternative text

Can you translate this drawing into an algorithm?

You will be given two dimensions

    a positive integer length (parameter named lng)
    a positive integer width (parameter named wdth)

You will return an array or a string (depending on the language; Shell bash and Fortran return a string) with the size of each of the squares.

  sqInRect(5, 3) should return a List<Integer> {3, 2, 1, 1}
  sqInRect(3, 5) should return a List<Integer> {3, 2, 1, 1}

Notes:

    lng == wdth as a starting case would be an entirely different problem and the drawing is planned to be interpreted with lng != wdth. (See kata, Square into Squares. Protect trees! http://www.codewars.com/kata/54eb33e5bc1a25440d000891 for this problem). When the initial parameters are so that lng == wdth, the solution [lng] would be the most obvious but not in the spirit of this kata so, in that case, return None/nil/null/Nothing. Return {} with C++. In that case the returned structure of C will have its sz component equal to 0. Return the string "nil" with Bash and Fortran.

    You can see more examples in "RUN SAMPLE TESTS".

*/

//NOTE: Test at codewars are bugged!

import java.util.ArrayList;
import java.util.List;

public class RectangleIntoSquare {

    private static List<Integer> result = new ArrayList();
    private static int counter = 0;

    public static List<Integer> sqInRect(int l, int w) {

        if (l < w) {
            l = l+w;
            w = l-w;
            l = l-w;
        }

        if (l > w) {
            counter++;
            result.add(w);
            sqInRect(w, l - w);
        }

        if (l == w) {
            if (counter == 0) {
                result = null;
            } else {
                result.add(l);
            }
        }

        return result;
    }
}

