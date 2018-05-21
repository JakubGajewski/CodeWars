package pl._6kyu;

/*
Given an array, find the int that appears an odd number of times.

        There will always be only one integer that appears an odd number of times.
*/

import java.util.Arrays;

public class FindTheOddInt {
    public static int findIt(int[] A) {
        Arrays.sort(A);

        int count = 0;
        int j = A[0];

        for (int i : A) {
            if (i == j) {
                count++;
                continue;
            } else if (count % 2 != 0){
                return j;
            }
            count = 1;
            j = i;
        }
        return A[A.length-1];
    }
}

/*
Most scored solution (not mine):
public class FindOdd {
    public static int findIt(int[] A) {
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            xor ^= A[i];
        }
        return xor;
    }
}
*/
