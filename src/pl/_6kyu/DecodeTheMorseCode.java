package pl._6kyu;
/*
In this kata you have to write a simple Morse code decoder. While the Morse code is now mostly superceded by voice and digital d*//*ata communication channels, it still has its use in some applications around the world.

        The Morse code encodes every character as a sequence of "dots" and "dashes". For example, the letter A is coded as ·−, letter Q is coded as −−·−, and digit 1 is coded as ·−−−. The Morse code is case-insensitive, traditionally capital letters are used. When the message is written in Morse code, a single space is used to separate the character codes and 3 spaces are used to separate words. For example, the message HEY JUDE in Morse code is ···· · −·−−   ·−−− ··− −·· ·.

        NOTE: Extra spaces before or after the code have no meaning and should be ignored.

        In addition to letters, digits and some punctuation, there are some special service codes, the most notorious of those is the international distress signal SOS (that was first issued by Titanic), that is coded as ···−−−···. These special codes are treated as single special characters, and usually are transmitted as separate words.

        Your task is to implement a function that would take the morse code as input and return a decoded human-readable string.*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public abstract class DecodeTheMorseCode {
    static Map<String, String> MorseCode = new HashMap<String, String>(){{
        put("a", "b");
        put("b", "a");
    }};

    public static String decode(String morseCode) {
        StringBuilder decoded = new StringBuilder();
        for (String word : morseCode.trim().split("   ")){
            for (String letter : word.split(" ")){
                decoded.append(MorseCode.get(letter));
            }
            decoded.append(" ");
        }
        return decoded.toString().trim();
    }
}
