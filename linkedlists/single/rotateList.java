import java.util.LinkedList;
import java.util.Scanner;
class rotateList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    static Node head;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int el = 1;
        Node elNode = new Node(el);
        head = elNode;

        el = 2;
        elNode = new Node(el);
        head.next = elNode;

        el = 3;
        elNode = new Node(el);
        head.next.next = elNode;

        el = 4;
        elNode = new Node(el);
        head.next.next.next = elNode;

        int k = s.nextInt();
        Node kthNode = null;

        Node temp = head;
        int i=0;
        while(temp.next != null) {
            i++;
            if(i == k) {
                kthNode = temp;
            }
            temp = temp.next;
        }
        if(kthNode == null) {
            print(head);
            // System.out.println("kthNode not found or invalid index k");
        } else {
            temp.next = head;
            head = kthNode.next;
            kthNode.next = null;
        }
        print(head);
    }
    static void print(Node temp) {
        if(temp == null) {
            System.out.println("No elements found");
            return;
        }
        while(temp != null) {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        return;
    }
}