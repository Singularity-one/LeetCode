/*
刪除連結串列的一個節點。

範例：
連結陣列1 -> 2 -> 3 -> 4 ，傳入3，則執行後連節陣列變成1 -> 2 -> 4

*/
public class e237_Delete_Node_in_a_Linked_List {
	public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

class ListNode237 {
     int val;
     ListNode237 next;
     ListNode237(int x) { val = x; }
}

//https://www.programcreek.com/2014/07/leetcode-delete-node-in-a-linked-list-java/