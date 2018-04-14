package pl._6kyu;

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
