package pl._7kyu;

public class Mumbling {
    public static String accum(String s) {
        StringBuilder zupa = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    zupa.append((s.charAt(i)+"").toUpperCase());
                } else {
                    zupa.append((s.charAt(i)+"").toLowerCase());                }
                if (j == i && i != s.length()-1) {
                    zupa.append("-");
                }
            }
        }
        return zupa.toString();
    }
}