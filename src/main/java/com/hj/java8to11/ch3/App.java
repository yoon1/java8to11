package com.hj.java8to11.ch3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("keesun");
        name.add("whiteship");
        name.add("toby");
        name.add("foo");

        /* 1. 일반적인 iterator */
        /*
        name.forEach(System.out::println);

        for(String n: name) {
            System.out.println(n);
        }
         */


        /* 2. splitIterator */
        /*
        Spliterator<String> spliterator = name.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit();
        while(spliterator.tryAdvance(System.out::println));
        System.out.println("============");
        while(spliterator1.tryAdvance(System.out::println));
         */

        /* 3. stream */
        /*
        name.stream().map(String::toUpperCase)
                        .filter(s->s.startsWith("K"))
                        .collect(Collectors.toSet());
        System.out.println(k);
        */

        /* 4. removeIf */
        /*
        name.removeIf(s->s.startsWith("k"));
        name.forEach(System.out::println);
         */


        /* 5. Comparator */
        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        name.sort(compareToIgnoreCase.reversed());

    }
}

