class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        return dummyHead.next;
    }

    // Helper method to create a linked list from an array of digits in reverse order
    public static ListNode createLinkedList(int[] digits) {
        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;

        for (int digit : digits) {
            current.next = new ListNode(digit);
            current = current.next;
        }

        return dummyHead.next;
    }

    // Helper method to print a linked list
    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example usage:
        int[] digits1 = {2, 4, 3}; // represents the number 342
        int[] digits2 = {5, 6, 4}; // represents the number 465

        ListNode l1 = createLinkedList(digits1);
        ListNode l2 = createLinkedList(digits2);

        System.out.print("Input List 1: ");
        printLinkedList(l1);

        System.out.print("Input List 2: ");
        printLinkedList(l2);

        ListNode result = addTwoNumbers(l1, l2);

        System.out.print("Sum Result: ");
        printLinkedList(result);
    }
}
