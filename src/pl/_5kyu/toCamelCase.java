package pl._5kyu;

public class toCamelCase {

    static String toCamelCase(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int n = 0; n < sb.length(); n++) {
            if ((sb.charAt(n) == '_' || sb.charAt(n) == '-') && (n < (sb.length() - 1))) {
                sb.replace(n + 1, n + 2, String.valueOf(Character.toUpperCase(sb.charAt(n + 1))));
            } else if (sb.charAt(n) != '_' && sb.charAt(n) != '-' && n < (sb.length() - 1)) {
                sb.replace(n + 1, n + 2, String.valueOf(Character.toLowerCase(sb.charAt(n + 1))));
            }
        }
        while ((sb.indexOf("_") != (-1))) {
            sb.deleteCharAt(sb.indexOf("_"));
        }
        while ((sb.indexOf("-")) != (-1)) {
            sb.deleteCharAt(sb.indexOf("-"));
        }
        return sb.toString();
    }
}
//"else" is not necessary here



/*Complete the method/function so that it converts dash/underscore delimited words into camel casing.
The first word within the output should be capitalized only if the original word was capitalized. */

/*package pl._5kyu;

public class toCamelCase {

    static String toCamelCase(String s) {
        char[] characters = s.toCharArray();
        char temp = ' ';
        StringBuilder sb = new StringBuilder();
        for (char ch : characters) {
            if (temp == '_' || temp == '-') ch = Character.toUpperCase(ch);
            else ch = Character.toLowerCase(ch);
            sb.append(ch);
            temp = ch;
        }
        if (s.charAt(0) == Character.toUpperCase(s.charAt(0))) {
            sb.deleteCharAt(0);
            sb.insert(0, Character.toUpperCase(s.charAt(0)));
        }

        return sb.toString();
    }
}*/

/* 1st approved version:
public class toCamelCase {

    static String toCamelCase(String s) {

        char[] characters = s.toCharArray();

        if (characters.length == 0){
            return "";
        }

        char temp = ' ';
        int counter = 0;
        StringBuilder sb = new StringBuilder();

        for (char ch : characters) {
            if (temp == '_' || temp == '-') ch = Character.toUpperCase(ch);
            else ch = Character.toLowerCase(ch);
            characters[counter] = ch;
            temp = ch;
            counter++;
        }

        sb.append(characters);

        if (s.charAt(0) == Character.toUpperCase(s.charAt(0))) {
            sb.deleteCharAt(0);
            sb.insert(0, Character.toUpperCase(s.charAt(0)));
        }

        while (sb.indexOf("-") != -1) {
            sb.deleteCharAt(sb.indexOf("-"));
        }
        while (sb.indexOf("_") != -1) {
            sb.deleteCharAt(sb.indexOf("_"));
        }
        return sb.toString();
    }
}

 */