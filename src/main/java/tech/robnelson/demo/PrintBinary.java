package tech.robnelson.demo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class PrintBinary {
    /* Generate binary numbers up to n and print on the screen.

        Questions to ask.
            Are these all positive integers?
            If not all positive integers, what are the input types?
            Are the binary values zero padded?
            Is there a lower bound, as in always starting at zero, or do we want a range of numbers?
            Is the upper bound inclusive?
            Is there a particular data structure you want used to demonstrate this (e.g., a queue)?

            The pattern of binary numbers is 0 1 10 11 100 101 110 ... this could be built with a queue of integers.

    */

    public static void printBinary(Integer n) {
        if (n > 0) { 
            System.out.println("Generating binary for 0 through " + n);
            IntStream.range(0, n+1)
            .forEach( i -> System.out.println(String.format("%4s", Integer.toBinaryString(i)).replace(" ", "0")));
        } else {
            System.out.println("Nothing to print for n == " + n);
        }
    }

    public static void printBinaryUsingQueue(Integer n) {
        if (n > 0) { 
            System.out.println("Generating binary for 0 through " + n);
            Queue<Integer> queue = new LinkedList<>();
            queue.add(1);
            for (var i = 1; i <= n; i++) {
                Integer current = queue.remove();
                System.out.println(current);

                queue.add(current * 10);
                queue.add(current * 10 + 1);
            }
            System.out.println();
        } else {
            System.out.println("Nothing to print for n == " + n);
        }
    }

    public static void main(String[] args) {
        // printBinary(5);
        // printBinary(22);
        // printBinary(15);
        // printBinary(-5);

        printBinaryUsingQueue(5);
        printBinaryUsingQueue(22);
        printBinaryUsingQueue(15);
        printBinaryUsingQueue(-5);


    }

}