
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class test {
	public static void main (String[] args) {
		//code
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t > 0) {
		    String str = s.next();
    		char[] strArr = str.toCharArray();
    		Stack<Character> stack = new Stack<Character>();
    		
    		for(int i=strArr.length-1; i>=0; i--) {
                if(stack.isEmpty() || strArr[i] != stack.peek()) {
                    stack.push(strArr[i]);
                }
            }
            while(!stack.isEmpty()) {
                System.out.print(stack.pop());
            }
            System.out.println();
		    t--;
		}
	}
}