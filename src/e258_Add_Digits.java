/*
Input: 38
Output: 2 
Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. 
Since 2 has only one digit, return it.

*/
public class e258_Add_Digits {
	public int addDigits(int num) {
        while (num / 10 > 0) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
//https://www.cnblogs.com/grandyang/p/4741028.html
