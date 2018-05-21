package pl._6kyu;

/*
Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.
 */

public class Stop_gninnipS_My_sdroW {
    public String spinWords(String sentence) {
        String[] reversedStringsArray = sentence.split(" ");
        int counter = 0;
        for (String s : reversedStringsArray) {
            if (s.length() >= 5) {
                StringBuilder reversed = new StringBuilder("");
                for (int j = 1; j <= s.length(); j++) {
                    reversed.append(s.charAt(s.length() - j));
                }
                reversedStringsArray[counter] = reversed.toString();
            }
            counter++;
        }
        StringBuilder result = new StringBuilder();
        for (String s : reversedStringsArray) {
            result.append(s);
            result.append(" ");
        }
        return result.toString().trim();
    }
}