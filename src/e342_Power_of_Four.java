/*
Input: n = 16
Output: true

Input: n = 5
Output: false

Input: n = 1
Output: true
 */
public class e342_Power_of_Four {
	public boolean isPowerOfFour(int n) {
        while(n>0){
            if(n==1){
                return true;
            }
 
            if(n%4!=0){
                return false;
            }else{
                n=n/4;
            }
        }
 
    return false;
    }
}

//https://www.programcreek.com/2015/04/leetcode-power-of-four-java/
