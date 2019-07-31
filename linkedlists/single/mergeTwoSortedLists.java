import java.util.Scanner;
class mergeTwoSortedLists {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }
    static Node head, head2, head3;
    public static void main(String[] args) {
        int el = 5;
        Node elNode = new Node(el);
        head = elNode;
        
        el = 10;
        elNode = new Node(el);
        head.next = elNode;

        el = 15;
        elNode = new Node(el);
        head.next.next = elNode;

        el = 2;
        elNode = new Node(el);
        head2 = elNode;

        el = 3;
        elNode = new Node(el);
        head2.next = elNode;

        el = 20;
        elNode = new Node(el);
        head2.next.next = elNode;

        merge(head, head2);


        
    }
    static void merge(Node temp, Node temp2) {
        Node first = temp , second = temp2;

        while(temp != null) {
            if(first.data < second.data) {
                
            }
        }
    } 
}