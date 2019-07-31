import java.util.Scanner;

public class arrayStack {
    static int top = -1;
    static int n;
    static int stack[];
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        stack = new int[n];
        int ch = 0;
        do {
            System.out.println("1.push\n2.pop\n3.peek\n4.print\n5.exit\nenter your choice\n");
            ch = s.nextInt();
            switch (ch) {
            case 1: {
                System.out.println("Enter element");
                int el = s.nextInt();
                stack = push(stack, el);
                break;
            }
            case 2: {
                stack = pop(stack);
                break;
            }
            case 3: {
                System.out.println(peek(stack));
                break;
            }
            case 4: {
                print(stack);
                break;
            }
            case 5: {
                System.out.print("Thank you!!! Hope to see you again");
                ch = 5;
                break;
            }
            default: {
                System.out.print("Invalid choice is given");
            }
            }
        } while (ch != 5);
    }

    static int[] push(int[] stack, int el) {

        if(top >= n) {
            System.out.println("Overflow Occured");
        } else {
            stack[++top] = el;
        }
        return stack;
    }
    static int[] pop(int[] stack) {
        if(top == -1) {
            System.out.println("Underflow Occured");
        } else {
            stack[top--] = -1;
        }
        return stack;
    }
    static int peek(int[] stack) {
        if(top == -1) {
            return -1;
        }
        return stack[top];
    }
    static void print(int[] stack) {
        if(top == -1) {
            System.out.println("No elements to show");
        }
        for(int i=top; i>=0; i--) {
            System.out.print(stack[i] +" ");
        }
    }
}