/*
这道题给定一个非负数n，让我们求小于n的质数的个数，题目中给了充足的提示，解题方法就在第二个提示 埃拉托斯特尼筛法 Sieve of Eratosthenes 中，这个算法的过程如下图所示：

厄拉托西尼篩法
https://zh.wikipedia.org/wiki/%E5%9F%83%E6%8B%89%E6%89%98%E6%96%AF%E7%89%B9%E5%B0%BC%E7%AD%9B%E6%B3%95

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

Input: n = 0
Output: 0

Input: n = 1
Output: 0
*/
public class e204_Count_Primes {
	public int countPrimes(int n) {
        if(n < 3) {return 0;}
        
        int primeCount = 0;
        boolean[] nonPrimes = new boolean[n];               
        for (int i = 2; i < n; i++) {        
        	if(nonPrimes[i]) {                              
        		continue;
        	}
        	
        	primeCount++;                                   
        	for (long j = (long)i * i; j < n; j += i) {  
        		nonPrimes[(int) j] = true;
        	}
        }
        return primeCount;
    }
}

//參考:https://matthung0807.blogspot.com/2018/12/leetcode-count-primes.html