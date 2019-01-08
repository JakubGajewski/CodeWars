//Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
//Examples
//
//pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
//pigIt('Hello world !');     // elloHay orldway !

package pl._5kyu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SimplePigLatin {
    public static String pigIt(String str) {

        StringBuilder result = new StringBuilder("");
        StringBuilder word = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 65 && c <= 122) {
                word.append(c);
            } else {
                result.append(SimplePigLatin.pigSimpleWord(word.toString()));
                word = new StringBuilder("");
                result.append(c);
            }
        }
        return result.toString().trim();
    }
    private static String pigSimpleWord (String str){
        char c = str.charAt(0);
        StringBuilder sb = new StringBuilder(str.substring(1, str.length()));
        sb.append(c).append("ay");
        return sb.toString();
    }
}
//Test Results:
//PigLatinTests
//FixedTests
//expected:<igPay atinlay siay[ oolcay]> but was:<igPay atinlay siay[]>
//Stack Trace
//Completed in 3ms
//RandomTests
//expected:<[MWEray]> but was:<[]>
//Stack Trace

//public static String pigIt(String str) {
//
//        StringBuilder result = new StringBuilder("");
//        List<String> wordList = Arrays.asList(str.split(" "));
//
//        wordList.stream()
//                .map(s -> {
//                    if (s.charAt(0) > 'A' && s.charAt(s.length()-1) < 'z') {
//                        char firstLetter = s.charAt(0);
//                        StringBuilder newWord = new StringBuilder(s.substring(1, s.length()));
//                        newWord.append(firstLetter).append("ay ");
//                        result.append(newWord);
//                    } else {
//                        result.append(s);
//                    }
//                    return s;
//                })
//                .collect(Collectors.toList());
//        return result.toString().trim();
//    }