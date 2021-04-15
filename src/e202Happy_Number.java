import java.util.HashSet;

/*
判斷一個數字是否為happy number。

happy number 定義如下：當一個數的每位數平方後相加，大於1則重複每位數開平方相加的動作，如果最後得到1的話，這個數就是happy number，如果進入無窮迴圈，這個數就不是happy number。

19 is a happy number
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1

*/

public class e202Happy_Number {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
 
        while(!set.contains(n)){
            set.add(n);
 
            n = getSum(n);
 
            if(n==1){return true;}
        }
        return false;
    }
    
    public int getSum(int n){
        int sum =0;
        while(n>0){
            sum+=(n%10)*(n%10);
            n=n/10;
        } 
        return sum;    
    }
}
