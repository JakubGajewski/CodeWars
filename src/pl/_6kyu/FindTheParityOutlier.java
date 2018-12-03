package pl._6kyu;

/*You are given an array (which will have a length of at least 3, but could be very large) containing integers. The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.*/
public class FindTheParityOutlier {
    static int find(int[] integers) {

        int evenCounter = 0;
        int oddCounter = 0;

        for (int i = 0; i < 3; i++) {
            if (Math.abs(integers[i] % 2) == 1) {
                oddCounter++;
            } else {
                evenCounter++;
            }
        }

        if (oddCounter > evenCounter) {
            return returnEven(integers);
        }
        return returnOdd(integers);


    }

    static int returnEven(int[] integers) {
        for (int i : integers) {
            if (Math.abs(i % 2) == 0) {
                return i;
            }
        }
        return 0;
    }

    static int returnOdd(int[] integers) {
        for (int i : integers) {
            if (Math.abs(i % 2) == 1) {
                return i;
            }
        }
        return 0;
    }


}


