
/*
給定一個 32 位有符號整數，將整數中的數字進行反轉。

Example 1:

Input:
 123

Output:
 321
Example 2:

Input:
 -123

Output:
 -321

*/


public class e7_Reverse_Integer {
	public int reverse(int x) {
	       String input = Integer.toString(x);
	       String result ="";
	       if(input.charAt(0)=='-'){
	           result +='-';
	           for(int i=input.length()-1;i>0;i--){
	                result += input.charAt(i);
	           }
	       }else{
	           for(int i=input.length()-1;i>=0;i--){
	                result += input.charAt(i);
	           }
	       }
	       
	       long resultLong =Long.parseLong(result);
	       if(resultLong>Integer.MAX_VALUE||resultLong<Integer.MIN_VALUE) {
	    	   return 0;
	       }else {
	    	   return Integer.parseInt(result);
	       }
	    }
}
