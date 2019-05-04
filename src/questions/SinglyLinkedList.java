public class SinglyLinkedList {

    public static void main(String[] args) {

        Node n3 = new Node(3, null);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);

        printList(n1);
        System.out.println("Sum : " + findSum(n1));
    }

    private static void printList(Node head){

        Node current = head;
        while(current != null){
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
    }

    private static int findSum(Node head) {

            int sum = 0;
            Node current = head;

            while (current != null) {

                  sum += current.getValue();
                  current = current.getNext();
            }
            return sum;
      }

      private static class Node{

        private int value;
        private Node next;

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

        public int getValue(){
            return this.value;
        }

        public Node getNext(){
            return this.next;
        }
    }

}