package pl._6kyu;

/*Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.

For example:

 persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
                      // and 4 has only one digit

 persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
                       // 1*2*6 = 12, and finally 1*2 = 2

 persistence(4) == 0 // because 4 is already a one-digit number
*/
public class PersistenetBugger {
    static int persistence;

    public static int persistence(long n) {
        persistence = 0;
        recursion(n);
        return persistence;
    }

    static void recursion(long n) {
        String numAsString = n + "";
        if (numAsString.length() == 1) {
            return;
        }
        long m = 1;
        for (int i = 0; i < numAsString.length(); i++) {
            m *= Character.getNumericValue(numAsString.charAt(i));
        }
        persistence++;
        recursion(m);
    }
}
