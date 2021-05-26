/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class e374_Guess_Number_Higher_or_Lower {
	public int guessNumber(int n) {
        int start = 1;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int res = guess(mid);
            if (res == 0) return mid;
            if (res > 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

	private int guess(int mid) {
		// TODO Auto-generated method stub
		return 0;
	}
}
