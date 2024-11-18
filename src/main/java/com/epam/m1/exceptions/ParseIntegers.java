package com.epam.m1.exceptions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Complete the code, parse integers, calculate the sum of numbers in the WORDS, join strings with
 * space delimiter
 */
public class ParseIntegers {

    private static final List<String> WORDS =
            Arrays.asList(
                    "JDK 17 has released on 14 September 2021 with 10 new features, 2 feature removals and 2 feature deprecations."
                            .split(" "));

    public static void main(String[] args) {
        Iterator<String> words = WORDS.iterator();
        int sum = 0;
        StringBuilder justWords = new StringBuilder();
        while (words.hasNext()) {
            String next = words.next();
            try{
                int number = Integer.parseInt(next);
                sum += number;
            }
            catch(NumberFormatException e){
                if (justWords.length() > 0) {
                    justWords.append(" "); // Add space before next word if not first
                }
                justWords.append(next);
            }
//            String next = words.next();
//            int number = Integer.parseInt(next);
            // todo: complete it
        }
        System.out.println("Sum is " + sum);
        System.out.println("Just words: " + justWords);
    }
}

