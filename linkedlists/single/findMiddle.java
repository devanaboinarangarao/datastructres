import java.util.Scanner;
public class findMiddle {
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
        while(t > 0) {
            int n = s.nextInt();
            Node tmp = new Node(n);
            insert(tmp);
            t--;
        }
        print(root);
        int el = printMiddle(root);
        int el2 = printMiddleRecursively(root, root);
        System.out.print("\n"+el +" "+el2);
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
    static int printMiddle(Node root) {
        int el = -1;
        Node slow = root, fast = root;
        if(root == null) {
            return -1;
        }
        while(fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
        }
        return slow.data;
    }
    static int printMiddleRecursively(Node fast, Node slow) {
        if(fast == null || fast.next == null) {
            return slow.data;
        } 
        return printMiddleRecursively(fast.next.next, slow.next);
    }
}