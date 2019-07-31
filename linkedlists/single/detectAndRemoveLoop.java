import java.util.HashSet;
import java.util.Scanner;
class detectAndRemoveLoop {
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

        el = 5;
        elNode = new Node(el);
        head.next.next.next.next = elNode;
        elNode.next = head.next;

        // boolean isLoop = detectRemoveLoopHash(head);

        // print(head);
        // System.out.print(isLoop);

        boolean isLoop2 = detectRemoveLoopFloydsCycle(head);
        print(head);
        System.out.print(isLoop2);


    }
    static boolean detectRemoveLoopFloydsCycle(Node head) {
        Node temp = head, fast = head, slow = head, prev = null;
        if(temp == null || temp.next == null) {
            return false;
        }
        while(fast.next != null ){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
            
            if(fast == slow) {
                slow = head;
                while(fast.next != slow.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
                fast.next = null;
                return true;
            }
        } 
        return false;
    }
    static boolean detectRemoveLoopHash(Node temp) {
        if(temp == null || temp.next == null) {
            return false;
        }
        HashSet<Node> hash = new HashSet<Node>();
        Node prev = null;
        while(temp != null) {
            if(hash.contains(temp)) {
                prev.next = null;
                return true;
            } 
            hash.add(temp);
            prev = temp;
            temp = temp.next;
        }
        return false;
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