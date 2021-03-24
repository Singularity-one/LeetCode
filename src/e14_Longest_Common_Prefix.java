
/*
編寫一個函數來查找字符串數組中的最長公共前綴。

如果不存在公共前綴，返回空字符串 ""。

Input: 
["flower","flow","flight"]

Output:
 "fl"
 
 Input: 
["dog","racecar","car"]

Output:
 ""

*/

public class e14_Longest_Common_Prefix {
	
	public String longestCommonPrefix(String[] strs) {
		String temp = "";
        if(strs != null && strs.length >0){    
            temp = strs[0];                                            //先用第一個字串來比對
            if(temp == ""){return "";}                                 //如果是空字串就不要玩了
            for(int i = 1 ; i<strs.length ; i++){                      //從次一個開始比  
                while (strs[i].indexOf(temp) != 0)                     //這邊應用indexOf 比較 如果他不是從第一個查到位置 != 0  
                    temp = temp.substring(0, temp.length() - 1);       //我們就減少他最後一個字串 直到比到為止
            }
        }
        return temp;
    }
}
