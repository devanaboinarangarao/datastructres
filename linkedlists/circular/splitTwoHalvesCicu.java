import java.util.Scanner;
class splitTwoHalvesCicu {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node Last;
    static Node head;
    static Node q1;
    static Node q2;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        while(n > 0) {
            int el = s.nextInt();
            Node elNode = new Node(el);
            insert(elNode);
            n--;
        }
        // print(head);
        splitTwoHalves(head);
    }
    static void splitTwoHalves(Node temp) {
        Node fast = head, slow = head;
        while(fast.next != head) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = head;
        Last.next = fast;

        print(head);
        print2(fast);

    }
    static void insert(Node elNode) {
        if(head == null) {
            head = elNode;
            head.next = head;
            Last = head;
            return;
        }
        Node temp = head;
        while(temp.next != Last.next) {
            temp = temp.next;
        }
        temp.next = elNode;
        elNode.next = head;
        Last = elNode;
        // System.out.print("daa "+Last.next.data +"\n");
        return;
    }
    static void print(Node temp) {
        if(temp == null) {
            System.out.println("No Elements Found");
            return;
        }
        do {
            System.out.print(temp.data +" ");
            temp = temp.next;
        } while(temp != head);
        System.out.println();
    }
    static void print2(Node temp) {
        if(temp == null) {
            System.out.println("No Elements Found");
            return;
        }
        do {
            System.out.print(temp.data +" ");
            temp = temp.next;

        } while(temp != q2);
        System.out.println();

    }
}