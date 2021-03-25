/*
Input: 1
Output: "1"
Explanation: This is the base case.

Input: 4
Output: "1211"
Explanation: For n = 3 the term was "21" in which we have two groups "2" and "1", 
"2" can be read as "12" which means frequency = 1 and value = 2, 
the same way "1" is read as "11", 
so the answer is the concatenation of "12" and "11" which is "1211". 

 
意是n=1時輸出字串1；n=2時，數上次字串中的數值個數，因為上次字串有1個1，所以輸出11；
n=3時，由於上次字元是11，有2個1，所以輸出21；
n=4時，由於上次字串是21，有1個2和1個1，所以輸出1211。
依次類推，寫個countAndSay(n)函式返回字串。

*/


public class m38_Count_and_Say {
    public String countAndSay(int n) {
    	if (n <= 0) {
    		return null;
    	}
    	
    	String result = "1";
    	int i = 1;
    	
    	while (i < n) {
    		StringBuilder sb = new StringBuilder();
    		int count = 1;
    		for (int j = 1; j < result.length(); j++) {
    			if (result.charAt(j) == result.charAt(j - 1)) {
    				count++;
    				} else {
    					sb.append(count);
    					sb.append(result.charAt(j - 1));
    					count = 1;
    					}
    			}
    		sb.append(count);
    		sb.append(result.charAt(result.length() - 1));
    		result = sb.toString();
    		i++;
    	}
    	return result;
    }
}
