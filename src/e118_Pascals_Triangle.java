import java.util.ArrayList;
import java.util.List;

/*
組成一個三角形的數字。

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Input: numRows = 1
Output: [[1]]

*/

public class e118_Pascals_Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result =new ArrayList<>();
       
       if(numRows ==0){
           return result;
       }
       
       result.add(new ArrayList<>());
       result.get(0).add(1);
       
       for(int i = 1;i< numRows;i++){
           ArrayList<Integer> list = new ArrayList<Integer>();
           
           List<Integer> lastList = result.get(i-1);
           
           list.add(1);
           
           for(int j = 1;j<i;j++){
              int num = lastList.get(j-1)+lastList.get(j);
              list.add(num);     
           }
           list.add(1);
           result.add(list);
       }
       return result;  
   }
}

//參考:https://webcache.googleusercontent.com/search?q=cache:PRvlblF2V9UJ:https://www.itread01.com/content/1548641365.html+&cd=18&hl=zh-TW&ct=clnk&gl=tw
//https://fightwennote.blogspot.com/2020/05/leetcode-118-pascals-triangle-easy.html
