package pl._4kyu;
/*
//UNFINISHED

source: https://www.codewars.com/kata/snail/train/java

Snail Sort

Given an n x n array, return the array elements arranged from outermost elements to the middle element, traveling clockwise.

array = [[1,2,3],
         [4,5,6],
         [7,8,9]]
snail(array) #=> [1,2,3,6,9,8,7,4,5]

For better understanding, please follow the numbers of the next array consecutively:

array = [[1,2,3],
         [8,9,4],
         [7,6,5]]
snail(array) #=> [1,2,3,4,5,6,7,8,9]
 */


import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Snail {
//
//    public static int[] snail(int[][] array) {
//        int n = array.length;
//
//        List<Integer>  result = new ArrayList<Integer> ();
//
//        for (int a = 0; a < Math.ceil(array[1].length/2); a++) {
//            for (int i = a; i < array.length - a; i++) {
//
//                result.add(array[a][i]);
//
//                for (int c = a; c < ; c++) {
//
//                }
//                result.add(array[a][array.length-1-i]);
//                result.add(array[a][i]);
//                result.add(array[a][i]);
//            }
//
//        }
//        return result.toArray();
//
//
//
//    }
//}

/* test data:
int[][] zupa = new int[5][5];
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5; j++) {
                zupa[i][j] = (int) (Math.random()*10);
                System.out.print(zupa[i][j]);
            }
            System.out.println();
        }
 */