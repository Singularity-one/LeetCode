/*
題目大意
　　給定兩個版本號，比較兩個版本號的大小。.號作為分割符使用，版本號中只有數和.號。

解題思路
　　以點號作為分割符，比較相應部分的大小。
*/

public class m165_Compare_Version_Numbers {
	public int compareVersion(String version1, String version2) {
		//#1
//        String[] arr1 = version1.split("\\.");
//        String[] arr2 = version2.split("\\.");
// 
//        int i=0;
//        while(i<arr1.length || i<arr2.length){
//            if(i<arr1.length && i<arr2.length){
//                if(Integer.parseInt(arr1[i]) < Integer.parseInt(arr2[i])){
//                    return -1;
//                }else if(Integer.parseInt(arr1[i]) > Integer.parseInt(arr2[i])){
//                    return 1;
//                }
//            } else if(i<arr1.length){
//                if(Integer.parseInt(arr1[i]) != 0){
//                    return 1;
//                }
//            } else if(i<arr2.length){
//            if(Integer.parseInt(arr2[i]) != 0){
//                    return -1;
//            }
//        }
// 
//            i++;
//        }
// 
//        return 0;
		
		//#2
        int indexA = 0; // 記錄version1處理的位置
        int indexB = 0; // 記錄version2處理的位置
        int countA = 0; // 記錄version1的.號之的字元數
        int countB = 0; // 記錄version2的.號之的字元數
        int max; // 記錄countA和countB之間的較大者
        int a;
        int b;

        while (indexA < version1.length() || indexA < version2.length()) {
            while (indexA < version1.length() && version1.charAt(indexA) != '.') {
                countA++;
                indexA++;
            }
            while (indexB < version2.length() && version2.charAt(indexB) != '.') {
                countB++;
                indexB++;
            }
            max = countA > countB ? countA : countB;
            for (int i = max; i >= 1; i--) { // 從左向右比較
                a = countA - i >= 0 ? version1.charAt(indexA - i) - '0' : 0;
                b = countB - i >= 0 ? version2.charAt(indexB - i) - '0' : 0;
                if (a > b) {
                    return 1;
                } else if (a < b) {
                    return -1;
                }
            }

            countA = 0;
            countB = 0;
            indexA++;
            indexB++;
        }
        return 0;
    }
}
