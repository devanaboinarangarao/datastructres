import java.util.Scanner;
import java.util.Stack;
class infixToPostFix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String expression = s.next();

        char expArr[] = expression.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<expArr.length; i++) {
            if(expArr[i] == ')') {
                while((stack.peek() != '(')) {
                    if(stack.isEmpty()) {
                        System.out.print("Invalid Expression");
                        return;
                    }
                    System.out.print(stack.pop() +" ");
                }
                stack.pop();
                continue;
            }
            if(expArr[i] != '(' && expArr[i] != '+' && expArr[i] != '-' && expArr[i] != '*' && expArr[i] != '/' && expArr[i] != '%' && expArr[i] != '^' && expArr[i] != ')') {
                System.out.print(expArr[i] +" ");
                continue;
            }
            while(!stack.isEmpty() && !isSafeToPush(expArr[i], stack.peek())) {
                char c = stack.pop();
                System.out.print(c+" ");
            }
            stack.push(expArr[i]);
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() +" ");
        }
    }
    static boolean isSafeToPush(char c, char c2) {
        boolean ans = false;
        switch(c) {
            case '^' : {
                if(c2 == '(' || c2 == '+' || c2 == '-' || c2 == '*' || c2 == '%' || c2 == '/' || c2 == '^' )
                {
                    ans =  true;
                } else{
                    ans= false;
                }
                break;
            }
            case '*' : {
                if(c2 == '(' || c2 == '+' || c2 == '-' || c2 == '*' || c2 == '%' || c2 == '/' )
                {
                    ans =  true;
                } else {
                    ans= false;
                }
                break;
            }
            case '%' : {
                if(c2 == '(' || c2 == '+' || c2 == '-'  || c2 == '%' || c2 == '/' )
                {
                    ans =  true;
                } else{
                    ans= false;
                }
                break;
            }
            case '/' : {
                if(c2 == '(' || c2 == '+' || c2 == '-' || c2 == '/' )
                {
                    ans =  true;
                } else{
                    ans= false;
                }
                break;
            }
            case '+' : {
                if(c2 == '(' || c2 == '+' || c2 == '-' )
                {
                    ans =  true;
                } else{
                    ans= false;
                }
                break;
            }
            case '-' : {
                if(c2 == '(' || c2 == '-' )
                {
                    ans =  true;
                } else{
                    ans= false;
                }
                break;
            }
            case '(' : {
                ans = true;
                break;
            }
            default : {
                System.out.println("something went wrong");
            }
        }
        return ans;
    }
}