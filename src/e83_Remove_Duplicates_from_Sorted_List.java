/*
改排序過的連結陣列，刪除重複的節點。

Input: head = [1,1,2]
Output: [1,2]

Input: head = [1,1,2,3,3]
Output: [1,2,3]
*/

public class e83_Remove_Duplicates_from_Sorted_List {
	public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){return head;}
        
        ListNode p = head;
        
        while( p!= null && p.next != null){
        	// 如果目前Node的值與下一個相同，跳過下一個
            if(p.val == p.next.val){
                p.next = p.next.next;
            }else{
                p = p.next; 
            }
        }
 
        return head;
    }
}
