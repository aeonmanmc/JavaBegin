package questions;

public class RemoveValueFromLinkedList {

    private ListNode<Integer> head = null;

    void constructList(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            append(arr[i]);
        }
    }

    private void append(int i) {

        if (head == null) {
            head = new ListNode<Integer>(i);
            return;
        }
        ListNode<Integer> curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new ListNode<Integer>(i);
    }

    void printList() {

        ListNode<Integer> curr = head;
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    void prepend(int i) {

        ListNode<Integer> newNode = new ListNode<Integer>(i);
        newNode.next = head;
        head = newNode;
    }

    void removeValue(int i) {

        if (head == null) {
            return;
        }
        if (head.value == i) {
            head = head.next;
            return;
        }

        ListNode<Integer> curr = head;
        while (curr.next != null) {
            if (curr.next.value == i) {
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }

}