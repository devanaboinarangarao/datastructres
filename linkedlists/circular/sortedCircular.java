import java.util.Scanner;
class sortedCircular {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    static Node Last;
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
    static void insert(Node elNode) {
        if(head == null) {
            head = elNode;
            elNode.next = head;
            Last = head;
            return;
        }
        if(elNode.data < head.data) {
            Last.next = elNode;
            elNode.next = head;
            head = elNode;
            return;
        }
        Node temp = head;
        while(temp.next != head && temp.next.data < elNode.data) {
            temp = temp.next;
        }
        elNode.next = temp.next;
        temp.next = elNode;
    }
    static void print(Node temp) {
        if(temp == null) {
            System.out.println("No elements Found");
            return;
        }
        do {
            System.out.print(temp.data +" ");
            temp = temp.next;
        } while(temp != head);
    }
}