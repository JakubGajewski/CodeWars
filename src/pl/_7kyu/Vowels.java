package pl._7kyu;

import java.util.regex.Pattern;

public class Vowels {
    public static int getCount(String str) {
        int counter = 0;
        for (char c : str.toCharArray()) {
            counter += (c == 'a' | c == 'e' | c == 'i' | c == 'o' | c == 'u') ? 1 : 0;
        }
        return counter;
    }
}


/*
public class Vowels {
    public static int getCount(String str) {
return str.replaceAll("(?i)[^aeiou]","").length();
    }
}
*/


/*
import java.util.regex.Pattern;

public class Vowels {
    public static int getCount(String str) {
        int vowelsCount = 0;
        String[] splited = str.split("");
        for (String c : splited) {
            if (Pattern.matches("[aeiou]", c)) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
*/


/*
public class Vowels {
    public static int getCount(String str) {
        String[] splited = str.split("");
        int vowelsCount = 0;
        for (String c : splited) {
            if (c.equalsIgnoreCase("a") | c.equalsIgnoreCase("e") | c.equalsIgnoreCase("i") | c.equalsIgnoreCase("o") | c.equalsIgnoreCase("u")) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

}
*/

/*Return the number (count) of vowels in the given string.

We will consider a, e, i, o, and u as vowels for this Kata.

The input string will only consist of lower case letters and/or spaces.
*/