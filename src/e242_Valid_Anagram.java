/*
 判斷兩個字母所使用的單字內容是否一樣。
Input: s = "anagram", t = "nagaram"
Output: true

Input: s = "rat", t = "car"
Output: false

*/
public class e242_Valid_Anagram {
	public boolean isAnagram(String s, String t) {
        if(s==null || t==null)
            return false;
 
        if(s.length()!=t.length())
            return false;
 
        int[] arr = new int[26];
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
 
        for(int i: arr){
            if(i!=0)
                return false;
        }
 
        return true;
    }
}
//https://medium.com/leetcode-%E6%BC%94%E7%AE%97%E6%B3%95%E6%95%99%E5%AD%B8/015-leetcode-242%E6%BC%94%E7%AE%97%E6%B3%95-valid-anagram-%E9%A9%97%E8%AD%89%E6%98%93%E4%BD%8D%E6%A7%8B%E8%A9%9E-9111f3ef8102
