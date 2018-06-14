package pl._8kyu;

import java.util.Arrays;

public class SumOfPositive {
    public static int sum(int[] arr){
        return Arrays.stream(arr)
                .filter(i -> i > 0)
                .sum();
    }
}
