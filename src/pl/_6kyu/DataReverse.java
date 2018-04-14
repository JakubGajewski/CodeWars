package pl._6kyu;

public class DataReverse {
    public static int[] DataReverse(int[] data) {
        int[]reversed = new int[data.length];
        for (int c = 0; c < data.length; c+=8) {
            System.arraycopy(data, c, reversed, data.length-8-c, 8);
        }
        return reversed;
    }
}





/* zanim poznałem metodę arraycopy
public class DataReverse {
    public static int[] DataReverse(int[] data) {
        int inputLengh  = data.length;
        int[]reversed = new int[inputLengh];
        for (int c = 0; c < inputLengh; c+=8){
            for (int n = 0; n<8; n++){
                reversed[c+n] = data[inputLengh-c-8+n];
            }
        }
        return reversed;
    }
}
*/

/*A stream of data is received and needs to be reversed. Each segment is 8 bits meaning the order of these segments need to be reversed:

11111111 00000000 00001111 10101010

(byte1) (byte2) (byte3) (byte4)

10101010 00001111 00000000 11111111

(byte4) (byte3) (byte2) (byte1)

Total number of bits will always be a multiple of 8. The data is given in an array as such:

[1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0]

*/