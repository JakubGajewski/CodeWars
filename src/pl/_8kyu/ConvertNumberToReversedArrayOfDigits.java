package pl._8kyu;
/*
Convert number to reversed array of digits
        Given a random number:

        You have to return the digits of this number within an array in reverse order.*/

public class ConvertNumberToReversedArrayOfDigits {

    public static int[] digitize(long n) {
        StringBuilder nStrBuild = new StringBuilder();
        nStrBuild.append(n);
        int length = nStrBuild.length();
        String reversedString = (nStrBuild.reverse()).toString();
        int reversed[] = new int[length];
        for (int i = 0; i < length; i++) {
            reversed[i] = Integer.parseInt(reversedString.substring(i, (i + 1)));
        }
        return reversed;
    }
}
        /* Another, but not working properlly solution
        System.out.println(n);

        String nStr = n + "";

        int length = nStr.length();

        int[] reversed = new int[length];

        int count = 0;

        while (nStr.charAt(count) == '0'){
            System.out.println("zupa");
            reversed[length-1-count] = 0;
            count++;
        }

        int m = (int) n;

        for (; count < length; count++){
            reversed [count] = m % 10;
            m /= 10;
        }

        return reversed;



    }
}
*/
