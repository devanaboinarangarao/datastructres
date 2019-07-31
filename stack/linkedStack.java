import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class linkedStack {
    static Node head;
    static int n, length = 0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        int ch = 0;
        do {
            System.out.println("1.push\n2.pop\n3.peek\n4.print\n5.exit\nenter your choice\n");
            ch = s.nextInt();
            switch (ch) {
            case 1: {
                System.out.println("Enter element");
                int el = s.nextInt();
                Node temp = new Node(el);
                push(temp);
                break;
            }
            case 2: {
                pop();
                break;
            }
            case 3: {
                peek();
                break;
            }
            case 4: {
                print();
                break;
            }
            case 5: {
                System.out.print("Thank you!!! Hope to see you again\n");
                ch = 5;
                break;
            }
            default: {
                System.out.print("Invalid choice is given\n");
            }
            }
        } while (ch != 5);
    }
    static void push(Node el) {
        System.out.println(length +" "+ n +" \n");
        if(length > n-1) {
            System.out.println("Overflow Occured\n");
            return;
        }
        length++;
        if(head == null) {
            head = el;
            return;
        }
        el.next = head;
        head = el;
        return;
    }
    static void pop() {
        if(head == null) {
            System.out.println("Underflow Occured\n");
            return;
        }
        length--;
        System.out.println("Element removed from stack is "+ head.data+"\n");
        head = head.next;
    }
    static void peek() {
        if(head == null) {
            System.out.println("No elements to show\n");
            return;
        }
        System.out.println("Top element is "+head.data+"\n");
        return;
    }
    static void print() {
        Node temp = head;

        if(temp == null) {
            System.out.println("No elements to show\n");
            return;
        }
        while(temp != null) {
            System.out.print("data is "+ temp.data+"\n");
            temp = temp.next;
        }
    }
}