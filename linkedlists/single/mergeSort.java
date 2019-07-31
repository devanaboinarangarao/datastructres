import java.util.LinkedList;
import java.util.Scanner;
class mergeSort {
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

        LinkedList<Integer> list = new LinkedList<>();
        int n = s.nextInt();
        while(n-- > 0) {
            int e = s.nextInt();
            Node eNode = new Node(e);
            insert(eNode);
        }
        head = mergeSort(head);
        printList();
    }
    static Node mergeSort(Node h) {
        if(h == null || h.next == null) {
            return h;
        }
        Node middle = getMiddle(h);
        System.out.print(middle.data +" ");
        
        Node nextMiddle = middle.next;

        middle.next = null;
        Node left = mergeSort(h);
        Node right = mergeSort(nextMiddle);

        return sortedMerge(left, right);
        
    }
    static Node sortedMerge(Node left, Node right) {
        if(left == null) {
            return right;
        }
        if(right == null) {
            return left;
        }
        if(left.data <= right.data) {
            left.next = sortedMerge(left.next, right);
            return left;
        } else {
            right.next = sortedMerge(left, right.next);
            return right;
        }
    }
    static Node getMiddle(Node h) {
        if(h == null) {
            return h;
        }
        Node slow = h, fast= h;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    static void printList() {
        if(head == null) {
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }
    static void insert(Node eNode) {
        if(head == null) {
            head = eNode;
            return;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = eNode;
        return;
    }
}