package decimalToBinary;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        System.out.println("only one 1");
        System.out.println(decimalToBinary(2));
        System.out.println(decimalToBinary(4));
        System.out.println(decimalToBinary(8));
        System.out.println(decimalToBinary(16));
        System.out.println(decimalToBinary(32));
        System.out.println(decimalToBinary(64));
        System.out.println(decimalToBinary(128));

        System.out.println("-------------------------");

        System.out.println("other tests");
        System.out.println(decimalToBinary(10));
        System.out.println(decimalToBinary(255));
        System.out.println(decimalToBinary(127));
        System.out.println(decimalToBinary(11));






    }

    public static String decimalToBinary(int decimalNum) {

        Stack<Integer> stack = new Stack<>();

        while(decimalNum > 0) {

            stack.push(decimalNum % 2);
            decimalNum = decimalNum / 2;
        }

        StringBuilder builder = new StringBuilder();

        while(!stack.isEmpty()) {
             builder.append(stack.pop().toString());
        }

        return builder.toString();
    }
}
