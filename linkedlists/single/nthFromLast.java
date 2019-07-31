import java.util.Scanner;

public class nthFromLast {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node root;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        int pos = s.nextInt();
        while (t > 0) {
            int n = s.nextInt();
            Node tmp = new Node(n);
            insert(tmp);
            t--;
        }
        print(root);
        int el = printNthLast(root, pos);
        Node slow = root;
        Node fast = root;
        for (int i = 0; i < pos; i++) {
            fast = fast.next;
        }
        int el2 = printNthLastRecursively(fast, slow, pos);
        System.out.print("\n" + el + " "+el2);
    }

    static void insert(Node t) {
        if (root == null) {
            root = t;
            return;
        }
        Node temp = root;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = t;
        return;
    }

    static void print(Node t) {
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
    }

    static int printNthLast(Node root, int k) {
        Node slow = root;
        Node fast = root;

        if (k > 0) {
            for (int i = 0; i < k; i++) {
                fast = fast.next;
            }
            while (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
            return slow.data;
        }
        return -1;

    }

    static int printNthLastRecursively(Node fast, Node slow, int k) {
        if (fast == null)
            return slow.data;

        if(k <= 0) {
            return -1;
        }
        return printNthLastRecursively(fast.next, slow.next, k);
    }
}