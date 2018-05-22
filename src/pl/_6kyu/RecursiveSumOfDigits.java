package pl._6kyu;
/*
In this kata, you must create a digital root function.

A digital root is the recursive sum of all the digits in a number. Given n, take the sum of the digits of n. If that value has two digits, continue reducing in this way until a single-digit number is produced. This is only applicable to the natural numbers.

Here's how it works (Ruby example given):

digital_root(132189)
=> 1 + 3 + 2 + 1 + 8 + 9
=> 24 ...
=> 2 + 4
=> 6
 */

public class RecursiveSumOfDigits {
    public static int digital_root(int n) {
        if (n>9) {
            int j = 0;
            for (int i = 0; i < (n+"").length(); i++) {
                j += (Integer.valueOf((n+"").charAt(i)) - 48);
            }
            return (digital_root(j));
        } else {
            return n;
        }
    }
}

/*solutions from other users:
public class DRoot {
  public static int digital_root(int n) {
    return (n != 0 && n%9 == 0) ? 9 : n % 9;
  }
}
Congruence formula was used there
http://mathworld.wolfram.com/DigitalRoot.html
 */
