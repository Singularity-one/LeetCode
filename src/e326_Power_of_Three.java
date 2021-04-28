/*
Input: n = 27
Output: true

Input: n = 0
Output: false


 */
public class e326_Power_of_Three {
	public boolean isPowerOfThree(int n) {
        if(n==1) return true;
 
        boolean result = false;
 
        while(n>0){
            int m = n%3;
            if(m==0){
                n=n/3;
                if(n==1)
                    return true;
            }else{
                return false;
            }
        }
 
    return result;
    }
}
//https://www.programcreek.com/2014/04/leetcode-power-of-three-java/
