import java.util.Scanner;
import java.util.Stack;
class sortStack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        Stack<Integer> stack = new Stack<Integer>();

        while(n > 0) {
            int el = s.nextInt();
            stack.push(el);
            n--;
        }
        sortRecur(stack);
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() +" ");
        }
    }
    static void sortRecur(Stack<Integer> stack) {
        if(stack.isEmpty()) {
            return;
        }
        int el = stack.pop();
        sortRecur(stack);
        sortedInsert(stack, el);
        return;
    }
    static void sortedInsert(Stack<Integer> stack, int el) {
        if(stack.isEmpty() || el > stack.peek()) {
            stack.push(el);
            return;
        }
        int e = stack.pop();
        sortedInsert(stack, el);
        stack.push(e);
        return;
    }
}