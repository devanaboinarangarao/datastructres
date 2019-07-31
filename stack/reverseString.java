import java.util.Scanner;
import java.util.Stack;
class reverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        reverse(str);
        reverseRecur(str, -1);
        System.out.println();
        char strArr[] = str.toCharArray();

        Stack<Character> stack = new Stack<Character>();

        for(int i=0; i<strArr.length; i++) {
            stack.push(strArr[i]);
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop()+"");
        }
        System.out.println();
    }

    static void reverseRecur(String str, int i) {
        if(i >= str.length()-1 ) {
            return;
        }
        i = i+1;
        reverseRecur(str, i);
        System.out.print(str.charAt(i));
    }

    static void reverse(String str) {
        int n = str.length();
        char strArr[] = str.toCharArray();
        int mid = strArr.length/2;

        for(int i=0; i< mid; i++) {
            // System.out.println(strArr[i]);
            char temp = strArr[i];
            strArr[i] = strArr[n-i-1];
            strArr[n-i-1] = temp;
        }
        System.out.println(strArr);
        return;
    }
}