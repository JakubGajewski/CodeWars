/*
Your task is to find the first element of an array that is not consecutive.

        E.g. If we have an array [1,2,3,4,6,7,8] then 1 then 2 then 3 then 4 are all consecutive but 6 is not, so that's the first non consecutive number.

        If the whole array is consecutive then return null

        The array will always have at least 2 elements and all the elements will be numbers. The numbers will also all be unique and in ascending order. The numbers could be positive or negative and the first non-consecutive could be either too!

        If you like this Kata, maybe try this one next

        https://www.codewars.com/kata/represent-array-of-numbers-as-ranges
*/

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

