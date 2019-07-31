import java.util.LinkedList;
import java.util.Scanner;
class addingNumbers {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    static Node head;
    static Node head2;
    static Node sumHead;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int el = 5;
        Node elNode = new Node(el);
        head = elNode;

        el = 6;
        elNode = new Node(el);
        head.next = elNode;

        el = 3;
        elNode = new Node(el);
        head.next.next = elNode;

        

        el = 8;
        elNode = new Node(el);
        head2 = elNode;

        el = 4;
        elNode = new Node(el);
        head2.next = elNode;

        el = 2;
        elNode = new Node(el);
        head2.next.next = elNode;

        int num1 = getNumber(head);
        System.out.println(num1);

        int num2 = getNumber(head2);
        System.out.println(num2);

        int sum = num1+num2;

        System.out.println(sum);
        int digit = 0;
        while(sum > 0) {
            digit = sum % 10;
            elNode = new Node(digit);
            insert(elNode);
            sum /= 10;
        }
        print(sumHead);
    }
    static void insert(Node elNode) {
        if(sumHead == null) {
            sumHead = elNode;
            return;
        }
        Node temp = sumHead;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = elNode;
        return;

    }
    static int getNumber(Node temp) {
        if(temp == null) {
            return 0;
        }
        return getNumber(temp.next)*10 + temp.data;
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