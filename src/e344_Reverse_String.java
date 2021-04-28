/*

 */
public class e344_Reverse_String {
	 public void reverseWords(char[] s) {
		 int i = 0, j = s.length - 1;
	        while (i < j) {
	            char tmp = s[i];
	            s[i++] = s[j];
	            s[j--] = tmp;
	        }
	}
}



//old
//public static String reverseString(String s) {
//    char[] chars = s.toCharArray();
//    int lastIndex = chars.length - 1;
//    char[] reverseChars = new char[chars.length];
//    for(int i = 0; i < chars.length; i++) {
//        reverseChars[i] = chars[lastIndex - i];
//    }
//    return String.valueOf(reverseChars);
//}