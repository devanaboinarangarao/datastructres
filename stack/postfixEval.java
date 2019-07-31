import java.util.Scanner;
import java.util.Stack;

class postfixEval {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String exp = s.nextLine();
        String expArr[] = exp.split(" ");

        // System.out.println(expArr.length);
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < expArr.length; i++) {
            if (!expArr[i].equals("*") && !expArr[i].equals("%") && !expArr[i].equals("/") && !expArr[i].equals("+")
                    && !expArr[i].equals("-") && !expArr[i].equals("^")) {
                stack.push(Integer.parseInt(expArr[i]));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                int sum = 0;
                switch (expArr[i]) {
                    case "+": {
                        sum = a + b;
                        break;
                    }
                    case "-": {
                        sum = a - b;
                        break;
                    }
                    case "*": {
                        sum = a * b;
                        break;
                    }
                    case "%": {
                        sum = a % b;
                        break;
                    }
                    case "/": {
                        sum = a / b;
                        break;
                    }
                    case "^": {
                        sum = a ^ b;
                        break;
                    }
                    default: {
                        System.out.println("Invalid Operation");
                        return;
                    }
                }
                stack.push(sum);
            }
        }
        // System.out.print(stack.peek() + " \n");
        System.out.println(stack.pop());
        if (!stack.isEmpty()) {
            System.out.println("Invalid Expression is Given");
        }
    }
}