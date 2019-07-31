import java.util.Scanner;
import java.util.Stack;
class reverseStack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        Stack<Integer> stack = new Stack<Integer>();

        while(n > 0) {
            int el = s.nextInt();
            stack.push(el);
            n--;
        }
        Queue<Integer> q = new Queue<Integer>();
    
        reverseStack(stack);
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
    static void reverseStack(Stack<Integer> stack) {
        if(stack.isEmpty()) {
            return;
        }
        int el = stack.pop();
        reverseStack(stack);
        bottomInsert(stack, el);
        return;
    }
    static void bottomInsert(Stack<Integer> stack, int el) {
        if(stack.isEmpty()) {
            stack.push(el);
            return;
        }
        int e = stack.pop();
        bottomInsert(stack, el);
        stack.push(e);
        return;
    }
}