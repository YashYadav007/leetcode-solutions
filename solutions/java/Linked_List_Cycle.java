

/**
 * Definition for singly-linked list.
 * class ListNode {
 *   int val;
 *   ListNode next;
 *   ListNode(int x) {
 *     val = x;
 *     next = null;
 *   }
 * }
 */
public class Solution {
  /**
   * Approach:
   * Use Floyd's Tortoise and Hare algorithm to detect cycle in linked list.
   * - Initialize two pointers, slow and fast, at head.
   * - Move slow by one step and fast by two steps in each iteration.
   * - If fast or fast.next becomes null, no cycle exists.
   * - If slow meets fast at any point, cycle exists.
   *
   * Key invariants:
   * - If cycle exists, fast pointer will eventually meet slow pointer inside the cycle.
   * - If no cycle, fast pointer will reach the end (null).
   *
   * Edge cases:
   * - Empty list (head == null)
   * - Single node without cycle
   *
   * Time Complexity: O(n), where n is number of nodes
   * Space Complexity: O(1), constant extra space
   */
  public boolean hasCycle(ListNode head) {
    if (head == null) return false; // empty list no cycle

    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;          // move slow by 1 step
      fast = fast.next.next;     // move fast by 2 steps

      if (slow == fast) {        // cycle detected
        return true;
      }
    }

    return false; // fast reached end, no cycle
  }
}