package pl._6kyu;

public class MultiplesOf3Or5 {

    public static int solution(int number) {
        int solution = 0;
        for (int count = 1; count < number; count++) {
            if (count % 3 == 0 || count % 5 == 0) solution += count;
        }
        return solution;
    }
}
