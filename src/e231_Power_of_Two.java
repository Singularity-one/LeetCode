/*
判斷一個整數是否是2的次方數。
*/
public class e231_Power_of_Two {
	public boolean isPowerOfTwo(int n) {
        if(n<=0) 
        return false;
 
        while(n>2){
            int t = n>>1;
            int c = t<<1;
 
            if(n-c != 0)
                return false;
 
            n = n>>1;
        }
 
        return true;
        
    }
}
//https://www.programcreek.com/2014/07/leetcode-power-of-two-java/
//https://skyyen999.gitbooks.io/-leetcode-with-javascript/content/questions/231md.html