/*Take 2 strings s1 and s2 including only letters from ato z. Return a new sorted string, the longest possible, containing distinct letters,

    each taken only once - coming from s1 or s2. #Examples: ``` a = "xyaabbbccccdefww" b = "xxxxyyyyabklmopq" longest(a, b) -> "abcdefklmopqwxy"

a = "abcdefghijklmnopqrstuvwxyz" longest(a, a) -> "abcdefghijklmnopqrstuvwxyz" ```
*/

package pl._7kyu;

public class TwoToOne {

    public static String longest(String s1, String s2) {
        char [] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        StringBuilder builder = new StringBuilder();
        for (char c : alphabet){
            for (char c1 : (s1+s2).toCharArray()){
                if (c1 == c){
                    builder.append(c);
                    break;
                }
            }
        }
        return builder.toString();
    }
}


