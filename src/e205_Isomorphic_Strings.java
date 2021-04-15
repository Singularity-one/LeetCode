import java.util.HashMap;

/*
Input: s = "egg", t = "add"
Output: true

Input: s = "foo", t = "bar"
Output: false

Input: s = "paper", t = "title"
Output: true

同構(Isomorphic)
*/
public class e205_Isomorphic_Strings {
	public boolean isIsomorphic(String s, String t) {
		//#1
//        if(null == s || null ==t) return false;
//        //用Character 是因為後面我要用s.charAt()取
//        HashMap<Character,Character> map = new HashMap<Character,Character>();
//        //題目給你的字串長度會是一樣的
//        for(int i=0;i<s.length();i++){
//        	char a =s.charAt(i);
//        	char b =t.charAt(i);
//        	//當裡面已經有mapping過得
//        	if(map.containsKey(a)){
//        		if(map.get(a).equals(b)){continue;
//        		}else return false;
//        	}else {
//        		//第一次的時候無條件放進去
//        		if(!map.containsValue(b)){//containsVaule 這是表示這map裡面有被塞過這個值
//        			map.put(a,b);
//        		}else { //如果你已經有這個value的話表示塞錯了
//        			return false;
//        		} ;
//        	}
//        }
//        return true;
		
		//#2
		if (null == s || null == t)
			return false;
		int[] sArray = new int[256];
		int[] tArray = new int[256];

		for (int i = 0; i < s.length(); i++) {
			// input:egg,add
			// s.charAt(i) = e ,t.charAt(i) = a
			if (sArray[s.charAt(i)] != tArray[t.charAt(i)]) {
				return false;
			} else {
				// t.charAt(i) or s.charAt(i) 兩個都沒差,主要是sArray,tArray的index
				// sArray[e]=tArray[a]= t.charAt(i) or s.charAt(i)
				sArray[s.charAt(i)] = tArray[t.charAt(i)] = t.charAt(i);
			}
		}
		return true;
   }
}
//參考:https://medium.com/leetcode-%E6%BC%94%E7%AE%97%E6%B3%95%E6%95%99%E5%AD%B8/011-leetcode-205-%E6%BC%94%E7%AE%97%E6%B3%95-isomorphic-strings-%E5%90%8C%E6%A7%8B%E5%AD%97%E7%AC%A6%E4%B8%B2-53a0d7838619