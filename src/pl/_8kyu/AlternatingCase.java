package pl._8kyu;

//altERnaTIng cAsE <=> ALTerNAtiNG CaSe
//
//Define to_alternating_case(char*) such that each lowercase letter becomes uppercase and each uppercase letter becomes lowercase.

public class AlternatingCase {

    public static String toAlternativeString(String string) {
        String[] arr = new String[string.length()];
        for (int n = 0; n < string.length(); n++) {
            if ((string.charAt(n) >= '\u0061') && ((string.charAt(n)) <= '\u007A')) {
                arr[n] = (string.charAt(n) + "").toUpperCase();
            } else if ((string.charAt(n) >= '\u0041') && ((string.charAt(n)) <= '\u005A')) {
                arr[n] = (string.charAt(n) + "").toLowerCase();
            } else arr[n] = string.charAt(n) + "";
        }
        return String.join("", arr);
    }
}
