package tech.robnelson.demo;

import java.util.Arrays;

public class TextParse {

    
    

    public static void main(String[] args) {
        String text = "If you do need to serialize an object that contains an Optional value, the" + 
                "Jackson library provides support for treating Optionals as ordinary objects. What " + 
                "this means is that Jackson treats empty objects as null and objects with a value as " +
                "fields containing that value. This functionality can be found in the jackson-modules-java8 " + 
                "project. Another situation when it’s not very helpful to use the type is as a parameter " +
                "for methods or constructors. This would lead to code that is unnecessarily complicated: " +
                "User user = new User(\"john@gmail.com\", \"1234\", Optional.empty()); Instead, it’s much " +
                "easier to use method overloading to handle parameter which aren’t mandatory.";

        String[] sentences = text.split("\\ +");
        System.out.println("The text has " + sentences.length + " sentences.");

        String[] words = text.replaceAll("\\p{Punct}", "").split(" |-");
        System.out.println("The text has " + words.length + " words.");
        System.out.println(Arrays.asList(words));

        

    }



}