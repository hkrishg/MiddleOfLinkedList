// Given the head of a Singly LinkedList, write a method to return the middle node of the LinkedList.

// If the total number of nodes in the LinkedList is even, return the second middle node.

// Example 1:

// Input: 1 -> 2 -> 3 -> 4 -> 5 -> null
// Output: 3
// Example 2:

// Input: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
// Output: 4
// Example 3:

// Input: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> null
// Output: 4


class ListNode {
  int value = 0;
  ListNode next;

  ListNode(int value) {
    this.value = value;
  }
}

class Main {
  private static ListNode MiddleOfLinkedList(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;

    while (fast != null && fast.next != null) {
      fast = head.next.next;
      slow = head.next;
    }

    return slow;
  }


  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    
    head.next.next.next.next = new ListNode(5);
    System.out.println(Main.MiddleOfLinkedList(head).value);

    head.next.next.next.next.next = new ListNode(6);
    System.out.println(Main.MiddleOfLinkedList(head).value);

    head.next.next.next.next.next.next = new ListNode(7);
    System.out.println(Main.MiddleOfLinkedList(head).value);
    
  }
}