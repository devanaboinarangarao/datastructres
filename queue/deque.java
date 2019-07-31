import java.util.*;
class Node {
    int data;
    Node next;
    Node prev;

    Node(int el) {
        this.data = el;
    }
}
class dQ {
    Node head;
    Node tail;

    dQ() {
        this.head = null;
        this.tail = null;
    }
    void insertFront(int e) {
        Node eNode = new Node(e);
        if(this.head == null) {
            this.head = eNode;
            this.tail = eNode;
            return;
        } else {
            this.head.prev = eNode;
            eNode.next = this.head;
            this.head = eNode;
            return;
        }
    }
    void insertEnd(int e) {
        Node eNode = new Node(e);
        if(this.tail == null) {
            this.tail = eNode;
            this.head = eNode;
            return;
        } else {
            this.tail.next = eNode;
            eNode.prev = this.tail;
            this.tail = eNode;
        }
    }
    int deleteFront() {
        if(this.head == null) {
            return -1;
        }
        int el = this.head.data;
        if(this.head.next == null) {
            this.head = this.tail = null;
        } else {
            this.head = this.head.next;
            this.head.prev = null;
        }
        return el;
    } 
    int deleteEnd() {
        if(this.tail == null) {
            return -1;
        }
        int el = this.tail.data;
        if(this.tail.prev == null) {
            this.tail = this.head = null;
        } else {
            this.tail = this.tail.prev;
            this.tail.next = null;
        }
        return el;
    }
    int getFront() {
        if(this.head == null) {
            return -1;
        } 
        return this.head.data;
    }
    int getRear() {
        if(this.tail == null) {
            return -1;
        }
        return this.tail.data;
    }
    boolean isEmpty() {
        return this.head == null && this.tail == null;
    }
}
class deque {
    public static void main(String[] args) {
        dQ d = new dQ();
        d.insertFront(10);
        d.insertFront(5);
        d.insertEnd(15);
        d.insertEnd(20);

        System.out.println(d.deleteEnd());
        System.out.println(d.deleteEnd());

        System.out.println(d.deleteFront());

        System.out.println(d.deleteFront());
        System.out.println(d.deleteEnd());


    }
}