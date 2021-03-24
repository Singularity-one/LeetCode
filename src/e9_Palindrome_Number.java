/*
判斷一個整數是否是回文數。回文數是指正序（從左向右）和倒序（從右向左）讀都是一樣的整數。
Input:
 121
Output:
 true
 
 Input:
-121
Output:
false*/


public class e9_Palindrome_Number {
	 public boolean isPalindrome(int x) {
	        boolean result = false;
	        int temp = x;
	        int after = 0;
	        if(x<0){return result;}
	        while(temp != 0){
	            after = after * 10 + temp % 10;
	            temp = temp / 10;
	        }
	        if(x == after){result = true;}
	        return result;
	    }
}
