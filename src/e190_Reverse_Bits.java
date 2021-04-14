/*
这道题考察位操作 Bit Operation，LeetCode 中有关位操作的题也有不少，比如 Repeated DNA Sequences，Single Number,   Single Number II ，和 Grey Code 等等。

Input: n = 00000010100101000001111010011100
Output:    964176192 (00111001011110000010100101000000)
Explanation: The input binary string 00000010100101000001111010011100 represents the unsigned integer 43261596, so return 964176192 which its binary representation is 00111001011110000010100101000000.

Input: n = 11111111111111111111111111111101
Output:   3221225471 (10111111111111111111111111111111)
Explanation: The input binary string 11111111111111111111111111111101 represents the unsigned integer 4294967293, so return 3221225471 which its binary representation is 10111111111111111111111111111111.

*/
public class e190_Reverse_Bits {
	 public int reverseBits(int n) {
	        for (int i = 0; i < 16; i++) {
			    n = swapBits(n, i, 32 - i - 1);
		    }
		    return n;
	    }
	    
	 public int swapBits(int n, int i, int j) {
		    int a = (n >> i) & 1;
		    int b = (n >> j) & 1;
	 
		    if ((a ^ b) != 0) {
			    return n ^= (1 << i) | (1 << j);
		    }
	 
		    return n;
	 }
}
