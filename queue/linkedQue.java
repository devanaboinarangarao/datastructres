class qNode {
    int data;
    qNode next;

    qNode(int data) {
        this.data = data;
    }
} 
class Queue {
    qNode front, rear;

    Queue() {
        this.front = this.rear = null;
    }
    void enqueue(int el) {
        qNode eNode = new qNode(el);

        if(this.rear == null) {
            this.front = this.rear = eNode;
            return; 
        }
        this.rear.next = eNode;
        this.rear = eNode;
        return;
    }

    int dequeue() {
        if(this.front == null) {
            return Integer.MIN_VALUE;
        }
        int el = this.front.data;
        this.front = this.front.next;

        if(this.front == null) {
            this.rear = null;
        }
        return el;
    }
}

class linkedQue {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());


    }
}