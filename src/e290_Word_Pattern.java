import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
給定一種規律 pattern 和一個字串 str ，判斷 str 是否遵循相同的規律。

Input: pattern = "abba", s = "dog cat cat dog"
Output: true

Input: pattern = "abba", s = "dog cat cat fish"
Output: false
 */
public class e290_Word_Pattern {
	public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        int index = 0;
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            int start = index;
            if (index >= s.length()) return false;
            while (index < s.length() && s.charAt(index) != ' ') {
                index++;
            }
            String cur = s.substring(start, index);
            index++;
            String pre = map.get(ch);
            if (pre == null) {
                if (set.contains(cur)) return false;
                set.add(cur);
                map.put(ch, cur);
            } else {
                if (!pre.equals(cur)) return false;
            }
        }
        return index >= s.length();
    }
}
//https://iter01.com/570477.html
