package tech.robnelson.demo;

import java.util.Map;
import java.util.Stack;

public class MatchingParenthesis {

    public static boolean matchingParenthesis(String string) {
        Stack<Character> stack = new Stack();
        Map<Character, Character> blockSymbols = Map.of(')', '(', ']', '[', '>', '<');

        for (var i = 0; i < string.length(); i++) {
            char current = string.charAt(i);

            if (blockSymbols.containsValue(current)) {
               stack.push(current);
               continue; 
            }

            if (blockSymbols.containsKey(current) && 
                (stack.isEmpty() || 
                    blockSymbols.get(current) != stack.pop())) {
                        return false;
            }
          }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(matchingParenthesis(""));
        System.out.println(matchingParenthesis("((This <is> [a] test))"));
        System.out.println(matchingParenthesis("((This <is> [a test))")); //false
        System.out.println(matchingParenthesis("((This <is> [a] <<test>>))"));
        System.out.println(matchingParenthesis("a"));
        System.out.println(matchingParenthesis(")(")); //false


    }

}