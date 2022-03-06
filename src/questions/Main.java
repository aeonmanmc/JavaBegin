package questions;

public class Main {

    public static void main(String[] args) {

        // 1
        // new SumOfDigits().sum(988);

        // 2
        // new FirstDuplicate().firstDupe(new int[] { 1, 2, 2, 1 });

        // 18
        // new NFactorial().findFactorial(5);

        // 13
        // new BubbleSort().sort(new int[] { 4, 3, 1, 2 });

        // 4
        int[][] mat = new int[2][3];
        int[] rowOne = new int[] { 1, 2, 3 };
        int[] rowTwo = new int[] { 4, 5, 6 };
        mat[0] = rowOne;
        mat[1] = rowTwo;
        // new RotateImage().rotate90(mat);

        // 17
        // new SymmetricalTree

        // 8
        // new Palindrome().isPalindrome("amanaplanacanalpanama");

        // 12
        ListNode<Integer> node3 = new ListNode<>(1);
        node3.next = null;
        ListNode<Integer> node2 = new ListNode<>(2);
        node2.next = node3;
        ListNode<Integer> node1 = new ListNode<>(1);
        node1.next = node2;
        // new Palindrome().isLinkedListPalindrome(node1);

        // 6
        // new PlusOne();

        // linked list
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        RemoveValueFromLinkedList linkedListTest = new RemoveValueFromLinkedList();
        linkedListTest.constructList(arr);
        linkedListTest.printList();
        linkedListTest.removeValue(5);
        linkedListTest.printList();

    }

}