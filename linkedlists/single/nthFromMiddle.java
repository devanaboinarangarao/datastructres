import java.util.Scanner;
public class nthFromMiddle {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node root;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        int pos = s.nextInt();
        while(t > 0) {
            int n = s.nextInt();
            Node tmp = new Node(n);
            insert(tmp);
            t--;
        }
        print(root);
        int el = printNthFromMiddle(root, pos);
        // int el2 = printNthFromMiddleRecursively(root, root, pos);
        System.out.print("\n"+el +" ");
    }
    static void insert(Node t) {
        if(root == null) {
            root = t;
            return;
        }
        Node temp = root;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = t;
        return;
    }
    static void print(Node t) {
        while(t != null) {
            System.out.print(t.data+" ");
            t = t.next;
        }
    }
    static int printNthFromMiddle(Node root, int pos) {
        int len = 0, el = -1;
        Node temp = root;
        while(temp != null) {
            len++;
            temp = temp.next;
        }
        temp = root;
        int p = ((len/2) + 1) - pos;
        for(int i = 1; i<p; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
    // static int printNthFromMiddleRecursively(Node fast, Node slow, int pos) {
       
    // }
}