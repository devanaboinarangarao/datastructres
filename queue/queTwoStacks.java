import java.util.*;
import java.io.*;
class queTwoStacks {
    static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            String lineStr[] = br.readLine().trim().split(" ");
            // System.out.println(lineStr[1]);
            if(Integer.valueOf(lineStr[0]) == 1) {
                insert(Integer.parseInt(lineStr[1]));
            } else if(Integer.valueOf(lineStr[0]) == 2) {
                int el = delete();
                System.out.println(el +" ");
            }
        }
        
    }
    static void insert(int el) {
        stack1.push(el);

    }
    static int delete() {
        if(stack1.isEmpty() && stack2.isEmpty()) {
            return -1;
        }
        if(stack2.isEmpty()) {
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}