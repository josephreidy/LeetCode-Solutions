/**
 * Definition for singly-linked list.
 * public class ListNode 
 {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 *     notes:
        so we iterate through the lists,
*       then we add the two corresponding elements of the two lists together 
        we store this answer in the corresponding node of the answer list
        if this answer is double digited we "carry the one" into the next computation
 */
class Solution 
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode l3 = new ListNode();
        int carryTheOne = 0;
        ListNode currentNode = l3;
        while (l1 != null || l2 != null)
        {
            ListNode newNode = new ListNode();
            currentNode.next = newNode;
            int valOfL1 = 0;
            int valOfL2 = 0;
            if (l1 != null)
            {
                valOfL1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null)
            {
                valOfL2 = l2.val;
                l2 = l2.next;
            }
            int sum = valOfL1 + valOfL2 + carryTheOne;
            if (sum > 9)
            {
                sum = sum - 10;
                carryTheOne = 1;
            }
            else
            {
                carryTheOne = 0;
            }
            newNode.val = sum;
            currentNode = newNode;
        }
        if (carryTheOne == 1)
        {
            ListNode newNode = new ListNode();
            currentNode.next = newNode;
            newNode.val = 1;
        }
        
        return l3.next;
    }
}