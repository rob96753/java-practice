package tech.robnelson.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountingCharacters {

    static public long vowelCount(String input) {
        List<String> vowels = Arrays.asList("a", "e", "i", "o", "u", "y");
        final var string = input.toLowerCase();
        
        var count = Arrays.stream(string.split(""))            
            //.filter(vowels::contains)
            .filter(c -> vowels.indexOf(c) != -1)
            .count();
        
        return count;

    }

    static public long consonantlCount(String input) {
        List<String> vowels = Arrays.asList("a", "e", "i", "o", "u", "y");
        final var string = input.toLowerCase();
        long count = 0l;

        if (input.length() > 0) {
            count = Arrays.stream(string.split(""))            
                //.filter(vowels::contains)
                .filter(c -> vowels.indexOf(c) < 0)
                .count();
        }
        
        return count;

    }

    static public void main(String[] args) {
        String text[] = { "This is a good time to test the string",
                        "good times were had by all",
                        "",
                        "This is a good time to test the string",
                        "f",
                        "a"};
        for (var i = 0; i < text.length; i++) {
            System.out.println("There are " + vowelCount(text[i]) + " vowels in the text of length: " + text[i].length());
        }

        for (var i = 0; i < text.length; i++) {
            System.out.println("There are " + consonantlCount(text[i]) + " consonants in the text of length: " + text[i].length());
        }
    }

}