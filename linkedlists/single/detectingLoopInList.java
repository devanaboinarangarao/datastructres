import java.util.HashSet;
import java.util.Scanner;
class detectingLoopInList {
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
        head.next.next = elNode;

        el = 5;
        elNode = new Node(el);
        head.next.next = elNode;
        elNode.next = head.next;

        boolean isLoop = detectLoopHash(head);

        System.out.print(isLoop);

        boolean isLoop2 = detectLoopFloydsCycle(head);

        System.out.print(isLoop2);


    }
    static boolean detectLoopFloydsCycle(Node head) {
        Node temp = head, fast = head, slow = head;
        if(temp == null || temp.next == null) {
            return false;
        }
        while(fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
            
            if(fast == slow) {
                return true;
            }
        } 
        return false;
    }
    static boolean detectLoopHash(Node temp) {
        if(temp == null || temp.next == null) {
            return false;
        }
        HashSet<Node> hash = new HashSet<Node>();
        while(temp != null) {
            if(hash.contains(temp)) {
                return true;
            } 
            hash.add(temp);
            temp = temp.next;
        }
        return false;
    }
}