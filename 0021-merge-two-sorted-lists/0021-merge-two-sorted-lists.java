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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        if (list1 == null)
        {
            return list2;
        }
        else if (list2 == null)
        {
            return list1;
        }
        
        ListNode head = null;
        if(list1.val <= list2.val)
        {
            ListNode tempNode = list1.next;
            head = list1;
            list1 = tempNode;
        }
        else
        {
            ListNode tempNode = list2.next;
            head = list2;
            list2 = tempNode;
        }

        ListNode currentNode = head;

        while(list1 != null && list2 != null)
        {
            if(list1.val <= list2.val)
            {
                ListNode tempNode = list1.next;
                currentNode.next = list1;
                currentNode = list1;
                list1 = tempNode;
            }
            else
            {
                ListNode tempNode = list2.next;
                currentNode.next = list2;
                currentNode = list2;
                list2 = list2.next;
            }
        }
        while(list1 != null && list2 == null)
        {
            ListNode tempNode = list1.next;
            currentNode.next = list1;
            currentNode = list1;
            list1 = list1.next;
            System.out.println("i am here");
        }
        while(list2 != null && list1 == null)
        {
            ListNode tempNode = list2.next;
            currentNode.next = list2;
            currentNode = list2;
            list2 = list2.next;
        }
        return head;
        
    }
}