/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution 
{
    public ListNode reverseBetween(ListNode head, int left, int right) 
    {
       // we need to store these nodes to conduct reversal
       ListNode beforeLeftNode = head;
       ListNode leftNode = head;
       ListNode rightNode = head;

        // TRAVERSAL TO STORE NODES
        //handles edge case where position left is first position in list.
        if(left == 1)
        {
            beforeLeftNode = null;
        }
       for(int i = 0; i < right; i++)
       {
            //handes cases where left position is not first position in list.
            if(i == left-2)
            {
                beforeLeftNode = rightNode;
                leftNode = rightNode.next;
            }
            rightNode = rightNode.next;
       }

       //REVERSAL
       ListNode prev = rightNode;
       ListNode curr = leftNode;

       while (curr != rightNode)
       {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
       }

        // handles the case where left is not the first node
       if(beforeLeftNode != null)
       {
            beforeLeftNode.next = prev;
            return head;
       }
       // handles the case where left is the first node. 
       else return prev;
    }
}