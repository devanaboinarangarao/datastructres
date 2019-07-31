import java.util.Scanner;
class detectLoopLen {
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

        int e = 10;
        Node eNode = new Node(e);
        head = eNode;

        e = 11;
        eNode = new Node(e);
        head.next = eNode;

        e = 12;
        eNode = new Node(e);
        head.next.next = eNode;

        e = 13;
        eNode = new Node(e);
        head.next.next.next = eNode;

        e = 14;
        eNode = new Node(e);
        head.next.next.next.next = eNode;
        eNode.next = head;

        System.out.println(head.data);
        int len = detectLoopAndLen(head);
        System.out.println(len);
    }

    static int detectLoopAndLen(Node head) {
        int len = 0;

        Node temp = head, fast = head, slow = head;
        boolean hasLoop = false;
        while(slow != null && fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                hasLoop = true;
                break;
            }
        }
        System.out.println(hasLoop);
        if(hasLoop) {
            temp = fast;
            do{
                len++;
                slow = slow.next;
            } while(slow != fast);
        }
        return len;
    }
}