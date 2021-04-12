/*
    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
*/
public class e168_Excel_Sheet_Column_Title {
	public String convertToTitle(int columnNumber) {
        String answer="";
        while( columnNumber > 0){
            int temp= columnNumber % 26;
            if(temp==0){
                answer="Z" + answer;
                columnNumber=columnNumber/26-1;
            }else{
                answer=new String(Character.toChars('A'+temp-1)) + answer;
                columnNumber/=26;
            }
        }
        return answer;
    }
}
