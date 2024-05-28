public class Recursion9{
    public static void main(String[] args) {
        Node node1 = new Node(0);
        Node node2 = new Node(1);
        Node node3 = new Node(2);
        Node node4 = new Node(3);
        Node node5 = new Node(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        printList(node1);

        Node newHead = reverseList(node1);

        printList(newHead);
    }

    public static Node reverseList(Node node){
        if(node == null || node.next==null){
            return node;
        }
        else{
            Node newHead = reverseList(node.next);
            node.next.next = node;
            node.next = null;
            return newHead;
        }
    }

    public static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Node{
    int value;
    Node next;

    public Node(int value){
        this.value = value;
        this.next = null;
    }
}