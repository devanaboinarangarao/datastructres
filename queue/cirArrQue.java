import java.util.Scanner;
class Queue {
    int front, rear, size, capacity;
    int[] array;

    Queue(int capacity) {
        this.capacity = capacity;
        this.array = new int[this.capacity];
        this.front = this.size = 0;
        this.rear = this.capacity-1; 
    }
    boolean isEmpty(Queue queue) {
        return queue.size == 0;
    }
    boolean isFull(Queue queue) {
        return queue.size == queue.capacity;
    }

    void enqueue(int el) {
        if(isFull(this) || (this.rear == this.size-1 && this.front == 0) || this.rear == this.front-1) {
            return;
        }
        this.rear = (this.rear+1)%this.capacity;
        this.array[this.rear] = el;
        this.size++;
        return;
    }
    int dequeue() {
        if(isEmpty(this)) {
            return Integer.MIN_VALUE;
        }
        int el = this.array[this.front];
        if(this.front == this.rear) {
            this.front = this.rear = -1;
            return el;
        }
        this.front = (this.front+1)%this.capacity;
        this.size--;
        return el;
    }
    int front() {
        if(isEmpty(this)) {
            return Integer.MIN_VALUE;
        }
        return this.array[this.front];
    }
    int rear() {
        if(isEmpty(this)) {
            return Integer.MIN_VALUE;
        }
        return this.array[this.rear];
    }
}
public class cirArrQue {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);

        System.out.println(queue.front() +" "+ queue.rear() + queue.dequeue());
        System.out.println(queue.front() +" "+ queue.rear() + queue.dequeue());
        System.out.println(queue.front() +" "+ queue.rear() + queue.dequeue());
        System.out.println(queue.front() +" "+ queue.rear() + queue.dequeue());
        System.out.println(queue.front() +" "+ queue.rear() + queue.dequeue());
        System.out.println(queue.front() +" "+ queue.rear() + queue.dequeue());
    }
}