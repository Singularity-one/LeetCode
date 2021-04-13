/*
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
    
Input: "A"
Output: 1

Input: "AB"
Output: 28

Input: "ZY"
Output: 701

*/
public class e171_Excel_Sheet_Column_Number {
	public int titleToNumber(String columnTitle) {
        int result  = 0;
        for (int i = 0; i < columnTitle.length(); i++){
            //取出大進位制的數去*26
            result *= 26;
            //乘完以後加上這個近位制的餘數,重複就得解
            result += ((columnTitle.charAt(i) - 'A') + 1);    
        }
        return result;
    }
}
