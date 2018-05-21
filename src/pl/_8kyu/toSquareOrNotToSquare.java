/*
#To square(root) or not to square(root)

Write a method, that will get an integer array as parameter and will process every number from this array.
Return a new array with processing every number of the input-array like this:

If the number has an integer square root, take this, otherwise square the number.

[4,3,9,7,2,1] -> [2,9,3,49,4,1]

The input array will always contain only positive numbers and will never be empty or null.

The input array should not be modified!

Have fun coding it and please don't forget to vote and rank this kata! :-)

I have also created other katas. Take a look if you enjoyed this kata!

*/

package pl._8kyu;

public class toSquareOrNotToSquare {
    public static int[] squareOrSquareRoot(int[] array){
        int [] result = new int[array.length];
        int count = 0;
        for (int i : array){
            int a = ((Math.sqrt(i) == ((double)((int)Math.sqrt(i))))) ? (result[count] = (int)Math.sqrt(i)) : (result[count] = (int)i*i);
            count++;
        }
        return result;
    }
}


/* alternative solution:

{
    public static int[] squareOrSquareRoot(int[] array)
    {
        int [] result = new int[array.length];
        int count = 0;
        for (int i : array){
            boolean a = isSquarable(i);
            if (isSquarable(i)) result[count] = (int)Math.sqrt(i);
            else result[count] = (int)i*i;
            count++;
        }
        return result;
    }
    public static boolean isSquarable (int n) {
        if (Math.sqrt(n) == (double)((int)Math.sqrt(n))) return true;
        else return false;
    }
}

*/
