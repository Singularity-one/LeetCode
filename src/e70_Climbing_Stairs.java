/*
爬一個階梯。到頂端總共需走n階，每次你都可以選擇爬1階或2階，問有幾種不同方法爬到階梯頂端?

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

參考
https://ithelp.ithome.com.tw/articles/10213272
https://skyyen999.gitbooks.io/-leetcode-with-javascript/content/questions/70md.html

*/

public class e70_Climbing_Stairs {
	public int climbStairs(int n) {
//        if (n <= 2) { 
//        	return n;
//        }
//        int[] arr = new int[n];
//        
//        arr[0] = 1; arr[1] = 2;
//        
//        for (int i = 3; i <= n; i++)
//        {
//        	arr[i - 1] = arr[i - 2] + arr[i - 3];
//        }
//        return arr[n - 1];
		
		 if(n<=1){
			 return 1;
		 }
		 
		 int prev = 1;
		 int cur  = 1;
		 // 費氏數列 f(n) = f(n-1) + f(n-2)
		 for(int i = 2 ; i <=n ; i++){
			 int temp = cur;
			 cur = cur + prev;
			 prev = temp;
			 }
		 return cur;
    }
}
