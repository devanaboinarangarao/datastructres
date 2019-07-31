import java.util.Scanner;

class palindrome {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    static Node head, left;
    public static void main(String[] args) {
        int el = 1;
        Node eNode = new Node(el);
        head = eNode;

        el = 2;
        eNode = new Node(el);
        head.next = eNode;

        el = 1;
        eNode = new Node(el);
        head.next.next = eNode;

        el = 2;
        eNode = new Node(el);
        head.next.next.next = eNode;

        el = 1;
        eNode = new Node(el);
        head.next.next.next.next = eNode;

        boolean isPalindrome = isPalindrome(head);

        System.out.println(isPalindrome);
    }

    static boolean isPalindrome(Node temp) {
        left = head;
        if(temp ==  null) {
            return true;
        }
        boolean ans = isPalindrome(temp.next);

        if(ans == false) {
            return false;
        }

        boolean ans1 = left.data == temp.data;
        left = left.next;
        return ans1;
    }
}