package palindrom.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't node"));
    }

    public static boolean checkForPalindrome(String text) {

        Stack<Character> stackText = new Stack<>();
        ;

        for(char c : text.toUpperCase().toCharArray()) {

            if( Character.isAlphabetic(c)) {
                stackText.push(c);
            }
        }

        for(char c : text.replaceAll("\\P{L}+", "").toUpperCase().toCharArray()) {

            if(stackText.pop() != c)
                return false;
        }

        return true;
    }
}
