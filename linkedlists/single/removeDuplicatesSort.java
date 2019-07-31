import java.util.Scanner;

class removeDuplicatesSort {
    static class Node {
        int data;
        Node next;
    
        Node(int data) {
            this.data = data;
        }
    }
    static Node head;
    public static void main(String[] args) {
        int el = 1;
        Node eNode = new Node(el);
        head = eNode;

        el = 1;
        eNode = new Node(el);
        head.next = eNode;

        el = 2;
        eNode = new Node(el);
        head.next.next = eNode;

        el = 2;
        eNode = new Node(el);
        head.next.next.next = eNode;
        el = 3;
        eNode = new Node(el);
        head.next.next.next.next = eNode;
        el = 4;
        eNode = new Node(el);
        head.next.next.next.next.next = eNode;

        head = removeDuplicates(head);

        System.out.print(head.data+" "+head.next.data + " "+ head.next.next.data +" "+  head.next.next.next.data+" ");
    }
    static Node removeDuplicates(Node temp) {
        if(temp == null) {
            return temp;
        }
        if(temp.next != null) {
            if(temp.data == temp.next.data) {
                temp.next = temp.next.next;
                removeDuplicates(temp);
            } else {
                removeDuplicates(temp.next);
            }
        }
        return temp;
    }
}