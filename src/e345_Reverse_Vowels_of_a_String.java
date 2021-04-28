import java.util.ArrayList;

/*
Input: s = "hello"
Output: "holle"

Input: s = "leetcode"
Output: "leotcede"
 */
public class e345_Reverse_Vowels_of_a_String {
    public String reverseVowels(String s) {
    	//#1 Runtime: 7 ms, faster than 30.41% 
//    ArrayList<Character> vowList = new ArrayList<Character>();
//    vowList.add('a');
//    vowList.add('e');
//    vowList.add('i');
//    vowList.add('o');
//    vowList.add('u');
//    vowList.add('A');
//    vowList.add('E');
//    vowList.add('I');
//    vowList.add('O');
//    vowList.add('U');
// 
//    char[] arr = s.toCharArray();
// 
//    int i=0; 
//    int j=s.length()-1;
// 
//    while(i<j){
//        if(!vowList.contains(arr[i])){
//            i++;
//            continue;
//        }
// 
//        if(!vowList.contains(arr[j])){
//            j--;
//            continue;
//        }
// 
//        char t = arr[i];
//        arr[i]=arr[j];
//        arr[j]=t;
// 
//        i++;
//        j--; 
//    }
// 
//    return new String(arr);
    	
    	//#2 Runtime: 2 ms, faster than 99.03%
    	char[] chrs = s.toCharArray();
        int i = 0, j = chrs.length - 1;
        while (i < j) {
            if (isVowel(chrs[i]) && isVowel(chrs[j])) {
                char t = chrs[i];
                // remember moving the index after the exchange of values
                chrs[i++] = chrs[j];
                chrs[j--] = t;
            } else if (isVowel(chrs[i])) {
                j--;
            } else i++;
        }

        return String.valueOf(chrs);
    }
    
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' ||          c == 'U';
    }
}
