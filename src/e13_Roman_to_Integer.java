import java.util.HashMap;

/*
羅馬數字包含以下七種字符：I， V， X， L，C，D 和 M。

給定一個羅馬數字，將其轉換成整數。輸入確保在 1 到 3999 的範圍內。

Value

I             1
V             5
X             10
L             50
C             100
D             500
M             1000

Input:
 "III"

Output:
 3
 
Input:
 "IV"

Output:
 4
*/

public class e13_Roman_to_Integer {
	public int romanToInt(String s) {
        int result = 0;
        if(s != ""){
            HashMap<String,Integer> map = new HashMap<String,Integer>();
            map.put("I", 1);
            map.put("V", 5);
            map.put("X", 10);
            map.put("L", 50);
            map.put("C", 100);
            map.put("D", 500);
            map.put("M", 1000);

            for(int i = 0 ; i<s.length() ; i++){
                String temp = s.charAt(i)+"";
                int value = 0;
                if(map.containsKey(temp)){
                    value = map.get(temp);
                    if(i != 0 &&  (map.get(s.charAt(i-1)+"") < map.get(temp)) ){
                        value = value - (map.get(s.charAt(i-1)+""))*2;
                    }
                    result = result + value;
                }
            }
        }
        return result;
	}

}
