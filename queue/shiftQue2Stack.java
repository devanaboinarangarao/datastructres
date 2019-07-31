import java.util.*;
import java.util.Queue;
class shiftQue2Stack {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        Stack<Integer> stack = new Stack<Integer>();
        while(!q.isEmpty()) {
            stack.push(q.poll());
        }
        while(!stack.isEmpty()) {
            q.add(stack.pop());
        }
        while(!q.isEmpty()) {
            stack.push(q.poll());
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() +" ");
        }
    }
}