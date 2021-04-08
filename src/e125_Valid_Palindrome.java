/*
給一個字串，不考慮大小寫與非字母數字的情況下，判斷這個字串是不是迴文。

範例：
"A man, a plan, a canal: Panama" --> true
"race a car" --> false (raceacar != racaecar)

注意：
你有考慮過空字串的情況嗎，在這邊我們定義空字串是一個迴文。

*/
public class e125_Valid_Palindrome {
	 public boolean isPalindrome(String s) {
	        char arr[]=s.toLowerCase().toCharArray();
	        StringBuffer str=new StringBuffer();
	        for(int i=0;i<arr.length;i++) {
	            if(arr[i]>='a'&&arr[i]<='z'||arr[i]>='0'&&arr[i]<='9')
	                str.append(arr[i]);
	        }
	            return str.toString().equals(str.reverse().toString());
	    }
}

//參考https://andy6804tw.gitbooks.io/leetcode/content/String/125-valid-palindrome.html
