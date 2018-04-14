package pl._7kyu;

public class OddMarch {
    public static int[][] BitMarch(int n) {
        int[][] bitMarch = new int[9 - n][8];
        for (int count = 0; count <= 8 - n; count++) {
            for (int byteCount = 0; byteCount < 8; byteCount++) {
                if (byteCount < 8 - n - count || byteCount >= 8 - count) bitMarch[count][byteCount] = 0;
                else bitMarch[count][byteCount] = 1;
            }
        }
        return bitMarch;
    }
}



/*Odd bits are getting ready for Bits Battles. Therefore the n number of bits march from right to left along 8 bits path.
Once the first bit reaches to the left their march is done. Each step will be save in an array element which will be returned.
There is no space between the bits.
1 <= n <= 8
NOTE: n != 0.Because n represents the number of 1s. Please use bitwise operations. This resemble a simple 8 LED chaser.*/
