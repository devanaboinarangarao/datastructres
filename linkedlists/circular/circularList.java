import java.util.Scanner;
class circularList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
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
        int el = s.nextInt();
        Node elNode = new Node(el);
        insert(5,elNode);
        print(head);
        delete(2);
        print(head);
    }
    static void delete(int index) {
        if(head == null) {
            System.out.println("No elements Found");
            return;
        }
        if(index < 1) {
            System.out.println("Invalid Position is given");
            return;
        }
        Node temp = head;
        if(index == 1) {
            System.out.println(head.data +" deleted");
            while(temp.next != head) {
                temp = temp.next;
            }
            head = head.next;
            temp.next = head;
            return;
        }
        for(int i=2; i<index; i++) {
            temp = temp.next;
            if(temp.next == head) {
                break;
            }
        }
        Node deletedNode = temp.next;
        temp.next = deletedNode.next;
        deletedNode.next = null;
        System.out.println(deletedNode.data +" deleted");

    }
    static void insert(int index, Node eNode) {
        if(index < 1) {
            System.out.println("Invalid Position is given");
            return;
        }
        if(head == null) {
            head = eNode;
            eNode.next = head;
            return;
        }
        Node temp = head;
        if(index == 1) {
            while(temp.next != head) {
                temp = temp.next;
            } 
            temp.next = eNode;
            eNode.next = head;
            head = eNode;
            return;
        }
        for(int i=2; i<index; i++) {
            temp = temp.next;
            if(temp.next == head) {
                break;
            }
        } 
        eNode.next = temp.next;
        temp.next = eNode;
    }
    static void insert(Node elNode) {
        if(head == null) {
            head = elNode;
            elNode.next = head;
            return;
        } 
        Node temp = head;
        while(temp.next != head) {
            temp = temp.next;
        }
        temp.next = elNode;
        elNode.next = head;
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