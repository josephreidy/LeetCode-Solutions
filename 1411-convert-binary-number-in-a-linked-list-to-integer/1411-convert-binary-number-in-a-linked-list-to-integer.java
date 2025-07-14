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
    public int getDecimalValue(ListNode head) 
    {
        int length = 0;
        int decimalValue = 0;
        ListNode currentNode = head;
        while (currentNode != null)
        {
            length++;
            currentNode = currentNode.next;
        }
        currentNode = head;
        while (currentNode != null)
        {
            length--;
            decimalValue += currentNode.val * (int)Math.pow(2, length);
            System.out.print(currentNode.val);
            System.out.println(decimalValue);
            currentNode = currentNode.next;
        }
        return decimalValue;
    }
}