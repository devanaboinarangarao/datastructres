import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
class interleavingQue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(1);
        q.add(2);
        q.add(3);

        Stack<Integer> stack = new Stack<Integer>();
        System.out.print(q.size()/2 + " ");
        int size = q.size();
        for(int i = 0; i<size/2; i++) {
            System.out.println("hello " + i);
            int el = q.poll();
            // System.out.println(el);
            stack.push(el);
        }
        for(int i: q) {
            System.out.print(i + " ");
        }
        System.out.println();
        while(!stack.isEmpty()) {
            q.add(stack.pop());
        }
        for(int i=0; i<size/2; i++) {
            int el = q.poll();
            q.add(el);
        }
        for(int i=0; i<size/2; i++) {
            stack.push(q.poll());
        }
        while(!stack.isEmpty()) {
            int el = stack.pop();
            int el2 = q.poll();

            q.add(el);
            q.add(el2);
        }
        for(int i: q) {
            System.out.print(i +" ");
        }
    }
}