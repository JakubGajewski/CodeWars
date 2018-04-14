package pl._8kyu;

public class catYearsDogYears {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int[] result = new int[3];
        switch (humanYears) {
            case 1:
                result[0] = 1;
                result[1] = 15;
                result[2] = 15;
                return result;
            default:
                result[0] = humanYears;
                result[1] = 24 + 4 * (humanYears - 2);
                result[2] = 24 + 5 * (humanYears - 2);
                return result;
        }
    }
}


/*
Kata Task

I have a cat and a dog.

I got them at the same time as kitten/puppy. That was humanYears years ago.

Return their respective ages now as [humanYears,catYears,dogYears]

NOTES:

    humanYears >= 1

Cat Years

    15 cat years for first year
    +9 cat years for second year
    +4 cat years for each year after that

Dog Years

    15 dog years for first year
    +9 dog years for second year
    +5 dog years for each year after that

 */