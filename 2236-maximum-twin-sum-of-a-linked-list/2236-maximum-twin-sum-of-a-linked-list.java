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
class Solution {
    public int pairSum(ListNode head) 
    {
        //Find the middle of the linked list using the fast and slow pointer technique from the previous article.
        ListNode slow = head;
        ListNode fast = head;
        ListNode beforeSlow = head;
        while(fast != null && fast.next != null) 
        {
            beforeSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        //System.out.println(beforeSlow.val);
        //System.out.println(slow.val);

        //Once at the middle of the linked list, perform a reversal. Basically, reverse only the second half of the list.
        ListNode prev = null;
        while(slow != null)
        {
            ListNode nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }
        beforeSlow.next = prev; 
    
        //After reversing the second half, every node is spaced n / 2 apart from its pair node, where n is the number of nodes in the list which we can find from step 1.

        //With that in mind, create another fast pointer n / 2 ahead of slow. Now, just iterate n / 2 times from head to find every pair sum slow.val + fast.val.

        ListNode dummy = head;
        while(dummy != null)
        {
            System.out.print(dummy.val + " ");
            System.out.println();
            dummy = dummy.next;
        }

        int maximumValue = 0;
        ListNode slow2 = head;
        ListNode fast2 = head;
        while(fast2 != beforeSlow.next)
        {
            fast2 = fast2.next;
        }

        while(fast2 != null)
        {
            int pairSum = slow2.val + fast2.val;
            maximumValue = Math.max(maximumValue, pairSum);
            slow2 = slow2.next;
            fast2 = fast2.next;
        }
        return maximumValue;
    }    

}