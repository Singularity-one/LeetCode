/*
Input: s = "Hello World"
Output: 5

Input: s = " "
Output: 0

*/
public class e58_Length_of_Last_Word {
	public int lengthOfLastWord(String s) {
//        int count = 0;
//        for(int i = s.length()-1 ; i >= 0 ; i--) {
//            if(s.charAt(i)!=' ') count++;
//            else break;
//        }
//        return count;
		//錯誤
		/*
		Input: s = "a "
		Output: 0
		Expected : 1
		*/
		
        if(s==null || s.length() == 0){return 0;}

	    int result = 0;
	    int len = s.length();
	 
	    boolean flag = false;
	    for(int i=len-1; i>=0; i--){
	        char c = s.charAt(i);
	        if((c>='a' && c<='z') || (c>='A' && c<='Z')){
	            flag = true;
	            result++;
	        }else{
	            if(flag)
	                return result;
	        }
	    }
	 
	    return result;

    }
}
