import java.util.Scanner;
class twoStackInArray {
    static int top1 = -2, top2 = -1;
    static int[] stack;
    static int n;
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
                    System.out.println("1.stack1\n2.stack2\nenter your choice\n");
                    int ch2 = s.nextInt();
                    
                    switch(ch2) {
                        case 1 : {

                            System.out.println("Enter element");
                            int el = s.nextInt();
                            push1(stack, el);
                            break;
                        }
                        case 2 : {
                            System.out.println("Enter element");
                            int el = s.nextInt();
                            push2(stack, el);
                            break;
                        }
                        default : {
                            System.out.println("Invali choice is given");
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("1.stack1\n2.stack2\nenter your choice\n");
                    int ch2 = s.nextInt();
                    switch(ch2) {
                        case 1 : {
                            pop1(stack);
                            break;
                           
                        }
                        case 2 : {
                            pop2(stack);
                             break;
                        }
                        default : {
                            System.out.println("Invali choice is given");
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("1.stack1\n2.stack2\nenter your choice\n");
                    int ch2 = s.nextInt();
                    switch(ch2) {
                        case 1 : {
                            System.out.println(peek1(stack));
                            break;
                           
                        }
                        case 2 : {
                            System.out.println(peek2(stack));
                             break;
                        }
                        default : {
                            System.out.println("Invali choice is given");
                            break;
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.println("1.stack1\n2.stack2\nenter your choice\n");
                    int ch2 = s.nextInt();
                    switch(ch2) {
                        case 1 : {
                            print1(stack);
                            break;
                           
                        }
                        case 2 : {
                            print2(stack);
                             break;
                        }
                        default : {
                            System.out.println("Invali choice is given");
                            break;
                        }
                    }
                    break;
                }
                case 5: {
                    System.out.print("Thank you!!! Hope to see you again\n");
                    ch = 5;
                    break;
                }
                default: {
                    System.out.print("Invalid choice is given\n");
                }
            }
        } while (ch != 5);
    }
    static int[] push1(int[] stack, int el) {

        if(top1 >= n || top2 >= n) {
            System.out.println("Overflow Occured");
        } else {
            top1 = top1+2;
            stack[top1] = el;
        }
        return stack;
    }
    static int[] push2(int[] stack, int el) {

        if(top2 >= n || top1 >= n) {
            System.out.println("Overflow Occured");
        } else {
            top2 = top2+2;
            stack[top2] = el;
        }
        return stack;
    }
    static int[] pop1(int[] stack) {
        if(top1 <= 0) {
            System.out.println("Underflow Occured");
        } else {
            stack[top1] = -1;
            top1 = top1-2;
        }
        return stack;
    }
    static int[] pop2(int[] stack) {
        if(top2 <= 0) {
            System.out.println("Underflow Occured");
        } else {
            stack[top2--] = -1;
            top2 = top2-2;
        }
        return stack;
    }
    static int peek1(int[] stack) {
        // System.out.println("top1 is "+top1);
        if(top1 < 0) {
            return -2;
        }
        return stack[top1];
    }
    static int peek2(int[] stack) {
        // System.out.println("top2 is "+top2);
        if(top2 < 0) {
            return -1;
        }
        return stack[top2];
    }
    static void print1(int[] stack) {
        if(top1 == -2) {
            System.out.println("No elements to show");
        }
        for(int i=top1; i>=0; i = i-2) {
            System.out.print(stack[i] +" ");
        }
    }
    static void print2(int[] stack) {
        if(top2 == -1) {
            System.out.println("No elements to show");
        }
        for(int i=top2; i>=0; i= i-2) {
            System.out.print(stack[i] +" ");
        }
    }
}