package pl._8kyu;

public class TripleTrouble {
    public static String tripleTrouble(String one, String two, String three){
        StringBuilder solution = new StringBuilder();
        int length = one.length();
        for (int i = 0; i < length; i++) {
            solution.append(one.charAt(i)).append(two.charAt(i)).append(three.charAt(i));
        }
        return solution.toString();
    }
}

