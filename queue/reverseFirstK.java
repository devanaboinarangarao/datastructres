import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
class reverseFirstK {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);

        int k = 2;
        
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<k;i++) {
            stack.push(q.poll());
        }
        while(!stack.isEmpty()) {
            q.add(stack.pop());
        }
        for(int i=0;i<8-k; i++) {
            int el = q.poll();
            q.add(el);
        }
        for(int e : q) {
            System.out.print(e +" ");
        }
        
    }
}