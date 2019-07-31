import java.util.Scanner;

public class single {
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
        while(t > 0) {
            int n = s.nextInt();
            Node tmp = new Node(n);
            insert(tmp);
            t--;
        }
        print(root);
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
    static void print(Node root) {
        while(root != null) {
            System.out.println(root.data +" ");
            root = root.next;
        }
    }
}