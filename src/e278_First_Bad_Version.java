/*
Input: n = 5, bad = 4
Output: 4
Explanation:
call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true
Then 4 is the first bad version.

 */
public class e278_First_Bad_Version {
//	public int firstBadVersion(int n) {
//        int left = 1, right = n;
//        while (left < right) {
//            int mid = left + (right - left) / 2;
//            if (isBadVersion(mid)) right = mid;
//            else left = mid + 1;
//        }
//        return left;
//    }
}

//boolean isBadVersion(int version);