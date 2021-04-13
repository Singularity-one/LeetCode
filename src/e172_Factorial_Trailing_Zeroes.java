/*
Input: 3
Output: 0
Explanation: 3! = 6, no trailing zero.

Input: n = 5
Output: 1
Explanation: 5! = 120, one trailing zero.


*/

public class e172_Factorial_Trailing_Zeroes {
	 public int trailingZeroes(int n) {
	        int sum = 0;
	        while(n > 0){
	            sum += n/5;
	            n/=5;
	        }
	        return sum;
	    }
}

//參考:https://fightwennote.blogspot.com/2020/06/leetcode-172-factorial-trailing-zeroes.html
