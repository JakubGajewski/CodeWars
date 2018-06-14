package pl._6kyu;

//Ciount multiples of 3 or 5

import java.util.Arrays;
import java.util.stream.IntStream;

public class MultiplesOf3Or5 {

    public static int solution(int number) {
//        int solution = 0;
//        for (int count = 1; count < number; count++) {
//            if (count % 3 == 0 || count % 5 == 0) solution += count;
//        }
//        return solution;
        return IntStream.range(0,number)
                .filter(i -> i % 3 == 0 || i % 5 == 0)
                .sum();
    }
}
