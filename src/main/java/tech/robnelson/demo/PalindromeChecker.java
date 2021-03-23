package tech.robnelson.demo;

public class PalindromeChecker {
    public static boolean isPalindrome(String string) {
        //clean the string
        string = string.replaceAll("\\s+", "").toLowerCase();
        var length = string.length();
        var results = false;
        if (length < 1) {
            results = false;        
        } else {            
            StringBuilder reverse = new StringBuilder(string).reverse();            
            results = string.equals(reverse.toString());
        }
        return results;
    }


    public static void main(String[] args) {
        System.out.println("'radar' is Palindrome a " + isPalindrome("radar"));
        System.out.println("'test' is Palindrome a " + isPalindrome("test"));
        System.out.println("'2002' is Palindrome a " + isPalindrome("2002"));
        System.out.println("'20502' is Palindrome a " + isPalindrome("20502"));
        System.out.println("'racecar' is Palindrome a " + isPalindrome("racecar"));        
        System.out.println("'a' is Palindrome a " + isPalindrome("a"));
        System.out.println("'' is Palindrome b " + isPalindrome(""));

    }

}