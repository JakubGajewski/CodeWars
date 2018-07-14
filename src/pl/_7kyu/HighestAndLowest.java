package pl._7kyu;

import java.util.*;

public class HighestAndLowest {
    public static String HighAndLow(String numbers){
        List <String> numberList = Arrays.asList(numbers.split(" "));
        Integer min = numberList.stream()
                .map(s -> Integer.parseInt(s))
                .min(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return Integer.compare(o1,o2);
                    }
                })
                .orElse(Integer.valueOf(numberList.get(0)));
        Integer max = numberList.stream()
                .map(s -> Integer.parseInt(s))
                .max(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return Integer.compare(o1,o2);
                    }
                })
                .orElse(Integer.valueOf(numberList.get(0)));
        return (max + " " + min);
    };
}
