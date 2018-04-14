package pl._4kyu;

import java.util.HashMap;
import java.util.Map;

public class DecodeMorseCodeAdvanced {

    static Map<String, String> MorseCode = new HashMap<String, String>(){{
        put("a", "b");
        put("b", "a");
    }};


    public static String decodeBits(String bits) {
        StringBuilder bitsSB = new StringBuilder(bits.substring(bits.indexOf('1'), (bits.lastIndexOf('1') + 1)));
        int x = Integer.MAX_VALUE; // we are looking for X - shortest row of zeroes one after the other
        int counter = 0;
        for (int i = 1; i < bitsSB.length(); i++) {
            if (bitsSB.charAt(i) == 0) {
                counter++;
                continue;
            }
            if (counter < x) {
                x = counter;
            }
            counter = 0;
        }
        bits.replaceAll("[0000000]", "   ");
        for (int i = 0; i < x; i++) {
            bits.replaceAll("      ", "   ");
        }
        return ".";
    }

    public static String decodeMorse (String morseCode) {
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