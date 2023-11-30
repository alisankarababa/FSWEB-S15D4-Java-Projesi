package palindrom.stackqueue;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't node"));
    }

    public static boolean checkForPalindrome(String text) {

        Queue<Character> queueText = new LinkedList<>();
        Stack<Character> stackText = new Stack<>();

        for(char c : text.toUpperCase().toCharArray()) {

            if( Character.isAlphabetic(c)) {
                stackText.push(c);
                queueText.add(c);
            }
        }

        while(!queueText.isEmpty() && !stackText.isEmpty()) {

            if(queueText.poll() != stackText.pop())
                return false;

        }

        return true;
    }
}