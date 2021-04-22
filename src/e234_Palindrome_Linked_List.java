/*
Example 1:

Input: 1->2
Output: false
Example 2:

Input: 1->2->2->1
Output: true
Follow up:
Could you do it in O(n) time and O(1) space?

1、利用栈，将list前半段入栈，然后后半段依次比较出栈。时间复杂度O（N），空间复杂度O(N/2)。

2、将栈的后半段反转，依次比较两端。时间复杂度O（N），空间复杂度O(1)。

*/
public class e234_Palindrome_Linked_List {
	public boolean isPalindrome(ListNode head) {
        if(head == null)
        return true;
 
        ListNode p = head;
        ListNode prev = new ListNode(head.val);
 
        while(p.next != null){
            ListNode temp = new ListNode(p.next.val);
            temp.next = prev;
            prev = temp;
            p = p.next;
        }
 
        ListNode p1 = head;
        ListNode p2 = prev;
 
        while(p1!=null){
            if(p1.val != p2.val)
                return false;
 
            p1 = p1.next;
            p2 = p2.next;
        }
 
    return true;
    }
}

//https://www.programcreek.com/2014/07/leetcode-palindrome-linked-list-java/

