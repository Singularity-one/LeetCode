/*
判斷一個數字是否為ugly number

ugly number是說一個數字因式分解後只含有2,3,5這些因子，例如說6[2,3],8[2,2,2]都是ugly的，14[2,7]因為含有7，所以不是ugly。
 */
public class e263_Ugly_Number {
	public boolean isUgly(int n) {
        if (n <= 0) return false;
        int[] primes = new int[]{2, 3, 5};
        for (int i = 0; i < primes.length; i++) {
            while (n % primes[i] == 0) {
                n /= primes[i];
            }
        }
        return n == 1;
    }
}

//https://medium.com/@urdreamliu/%E5%9C%96%E8%A7%A3-ugly-number-f2a28a495ff3
//
