package pl._8kyu;

public class FindTheFirstNonConsecutiveNumber{
    public static Integer find(final int[] array) {
        Integer result = null;
        for (int count = 1; count < array.length; count++) {
            if (array[count-1]+1 != array[count]){
                result = array[count];
                break;
            }
            }
        return result;
    }
}

