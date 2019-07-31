import java.util.Scanner;
public class nthNode {
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
        int n = s.nextInt();
        int index = s.nextInt();
        while(n > 0) {
            int el = s.nextInt();
            Node temp = new Node(el);
            insert(temp);
            n--;
        }
        int el = find(root, index);
        int el2 = findRecur(root, index, 1);
        System.out.println(el +" "+ el2);
    }
    static void insert(Node el) {
        if(root == null) {
            root = el;
            return;
        }
        Node temp = root;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = el;
    }
    static int find(Node root, int index) {
        int el = -1;
        for(int i=1; i<index; i++) {
            root = root.next;
            if(root == null) {
                return el;
            }
        }
        el = root.data;
        return el;
    }
    static int findRecur(Node root, int index, int start) {
        // System.out.print(start +" "+ index);
        if(start == index) {
            return root.data;
        }
        if(root == null || root.next == null) {
            return -1;
        }
        start = start+1;
        return findRecur(root.next, index, start);
    }
}