import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
import java.util.Stack;
class reverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(50);
        q.add(40);
        q.add(30);
        q.add(20);
        q.add(10);

        for(Integer i : q) {
            System.out.print(i +" ");
        }

        q = iterativeRev(q);
        System.out.println();

        for(Integer i : q) {
            System.out.print(i +" ");
        }

        q = recursiveRev(q);
        System.out.println();

        for(Integer i : q) {
            System.out.print(i +" ");
        }
    }
    static Queue<Integer> recursiveRev(Queue<Integer> q) {
        if(q.isEmpty()) {
            return q;
        }
        int el = q.poll();
        recursiveRev(q);
        q.add(el);
        return q;
    }
    static Queue<Integer> iterativeRev(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<Integer>();

        while(!q.isEmpty()) {
            int el = q.poll();
            stack.push(el);
        }
        while(!stack.isEmpty()) {
            int el = stack.pop();
            q.add(el);
        }
        return q;
    }

}