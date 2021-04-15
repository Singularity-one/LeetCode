/*
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5

*/
public class e203_Remove_Linked_List_Elements {
	public ListNode203 removeElements(ListNode203 head, int val) {
		ListNode203 helper = new ListNode203(0);
        helper.next = head;
        ListNode203 p = helper;
 
        while(p.next != null){
            if(p.next.val == val){
            	ListNode203 next = p.next;
                p.next = next.next; 
            }else{
                p = p.next;
            }
        }
        return helper.next;
    }
}

class ListNode203 {
	int val;
	ListNode203 next;
	ListNode203() {}
	ListNode203(int val) { this.val = val; }
	ListNode203(int val, ListNode203 next) { this.val = val; this.next = next; }
}
