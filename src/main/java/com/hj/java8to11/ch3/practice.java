package com.hj.java8to11.ch3;

import java.util.*;

public class practice {
    public static void main(String[] args) {
/*
        List<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("grape");
        fruits.add("melon");
*/
        /* 1. stream */
        /*
        long e = fruits.stream().map(String::toUpperCase)
                .filter(s->s.endsWith("E"))
                .count();
        System.out.println(e);
         */

        /* 2. removeIf */
        /*
        fruits.removeIf(s->s.startsWith("a"));
        fruits.forEach(System.out::println);
         */


        /* 3. parallelStream() */
        /*
        fruits.forEach(System.out::println);
        System.out.println("=============");
        //fruits.parallelStream().forEach(System.out::println);
        fruits.parallelStream().forEachOrdered(System.out::println);
         */

        /* 4. reversed */
        /*
        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        fruits.sort(compareToIgnoreCase.reversed());
        fruits.forEach(System.out::println);
        */

        /*
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("grape", "purple"));
        fruits.add(new Fruit("grape", "green"));
        fruits.add(new Fruit("apple", "red"));
        fruits.add(new Fruit("melon", "green"));
        fruits.add(new Fruit("banana", "yellow"));
        */

        /*5. thenComparing */
        /*
        Collections.sort(fruits, Comparator.comparing(Fruit::getName)
                .thenComparing(Comparator.comparing(Fruit::getColor)));

        fruits.forEach(fruit -> System.out.println(fruit.getName() + " : " + fruit.getColor()));
        */

        /*6.  reverseOrder */
        /*
        Comparator<Fruit> cmp = Collections.reverseOrder(Comparator.comparing(Fruit::getName))
                .thenComparing(Comparator.comparing(Fruit::getColor));
        Collections.sort(fruits, cmp);
        fruits.forEach(fruit -> System.out.println(fruit.getName() + " : " + fruit.getColor()));
        */

        /*7. naturalOrder()*/
        /*
        fruits.sort(Comparator.naturalOrder());
        fruits.forEach(System.out::println);
         */


        /*
        List<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("grape");
        fruits.add("melon");
        */

        /* 8. naturalOrder() */
        /* fruits.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
        fruits.forEach(System.out::println); */

        /* 9. naturalOrder() */
        /*
        fruits.sort(Comparator.nullsLast(Comparator.naturalOrder()));
        fruits.forEach(System.out::println);
         */
    }
}
