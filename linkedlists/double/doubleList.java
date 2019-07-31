import java.util.Scanner;
class doubleList {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }
    static Node head;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        while(n > 0) {
            int el = s.nextInt();
            Node elNode = new Node(el);
            insert(elNode);
            n--;
        }
        print(head);
    }
    static void print(Node head) {
        if(head == null) {
            System.out.println("No elements Found");
            return;
        }
        while(temp != null) {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }
    static void insert(Node elNode) {
        if(head == null) {
            head = elNode;
            return;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = elNode;
        elNode.prev = temp;
    }
}