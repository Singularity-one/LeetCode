/*
給一串Linked List，將此Linked List反轉，回傳反轉後的Head Node。

該題Reverse Linked List的題目如下所示，原來有一連結串列有五個節點，節點分別存放1至5的數值，現在要將五個節點進行反轉，反轉後，節點存放的值分別為5至1。

*/
public class e206_Reverse_Linked_List {
	public ListNode206 reverseList(ListNode206 head) {
		//#1
//		if(head==null||head.next==null)
//	        return head;
//	 
//		ListNode206 p1 = head;
//		ListNode206 p2 = p1.next;
//	 
//	    head.next = null;
//	    while(p1!=null&& p2!=null){
//	    	ListNode206 t = p2.next;
//	        p2.next = p1;
//	        p1 = p2;
//	        p2 = t;
//	    }
//	 
//	    return p1;
		
		//#2
		 if(head==null || head.next == null)
		        return head;
		 
		    //get second node    
		 	ListNode206 second = head.next;
		    //set first's next to be null
		    head.next = null;
		 
		    ListNode206 rest = reverseList(second);
		    second.next = head;
		 
		    return rest;
    }
}

class ListNode206 {
     int val;
     ListNode206 next;
     ListNode206() {}
     ListNode206(int val) { this.val = val; }
     ListNode206(int val, ListNode206 next) { this.val = val; this.next = next; }
 }
//參考:http://glj8989332.blogspot.com/2019/08/leetcode-206-reverse-linked-list.html
//https://www.programcreek.com/2014/05/leetcode-reverse-linked-list-java/