import java.util.Scanner;
class Node {
    int data;
    int priority;
    Node next;

    Node(int data, int priority) {
        this.data = data;
        this.priority = priority;
    }
}
class Queue {
    Node front, rear;

    Queue() {
        this.front = this.rear = null;
    }

    void insert(int el, int priority) {
        Node elNode = new Node(el, priority);
        if(this.rear == null) {
            this.rear = this.front = elNode;
            return;
        }
        this.rear.next = elNode;
        this.rear = elNode;
    }
    Node getHighestPriority() {
        if(front.next == null) {
            return front;
        }
        Node temp = front;
        Node maxPriorityNode = null;
        int maxPriority = Integer.MIN_VALUE;

        while(temp != null) {
            if(temp.priority > maxPriority) {
                maxPriority = temp.priority;
                maxPriorityNode = temp;
            }
            temp = temp.next;
        }
        return maxPriorityNode;
    }
    int deleteHighestPriority() {
        int el;
        if(this.front.next == null) {
            el = this.front.data;
            this.front = this.rear = null;
            return el;
        }
        Node pNode = this.getHighestPriority();
        Node temp = front;
        while(temp.next !=  pNode) {
            temp = temp.next;
        } 
        if(temp.next.next != null) {
            temp.next = temp.next.next;
        } else {
            temp.next = null;
        }
        return pNode.data;
    }
}
public class priorityQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.insert(10, 1);
        queue.insert(20, 2);
        queue.insert(30, 3);
        queue.insert(40, 4);

        Node t =queue.getHighestPriority();
        System.out.print(t.data);

        queue.deleteHighestPriority();
        // t = queue.getHighestPriority();
        // System.out.print(t.data);

        queue.deleteHighestPriority();
        queue.deleteHighestPriority();

        t = queue.getHighestPriority();
        System.out.print(t.data);
    }
}