package com.hj.java8to11.ch4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        /* list sample */
        /*
        List<String> names = new ArrayList<>();
        names.add("keesun");
        names.add("whiteship");
        names.add("toby");
        names.add("foo");
        */
        /*
        Stream<String> stringStream = names.stream().map(String::toUpperCase);

        //names.forEach(System.out::println);
        List<String> collect = names.stream().map((s)-> {
            System.out.println(s);
            return s.toUpperCase();
        }).collect(Collectors.toList());

        System.out.println("=========");
        collect.forEach(System.out::println);
         */

        /* 단순한 stream */
        /*
        for(String name : names)
            System.out.println(name);
        */

        /* parallel */
        /*
        List<String> collect = names.parallelStream().map((s) -> {
            System.out.println(s + " " + Thread.currentThread().getName());
            return s.toUpperCase();
        }).collect(Collectors.toList());
        collect.forEach(System.out::println);
        */

        /* ============= */

        /*  list */
        List<OnlineClass> springClass = new ArrayList<>();
        springClass.add(new OnlineClass(1, "spring boot", true));
        springClass.add(new OnlineClass(2, "spring data jpa", true));
        springClass.add(new OnlineClass(3, "spring mvc", false));
        springClass.add(new OnlineClass(4, "spring core", false));
        springClass.add(new OnlineClass(5, "rest api  development", false));

        System.out.println("spring 으로 시작하는 수업");
        // TODO
        springClass.stream()
            .filter(o -> o.getTitle().startsWith("spring"))
            .forEach(o -> System.out.println(o.getId()));


        System.out.println("close 되지 않은 수업");
        // TODO
        springClass.stream()
                .filter(Predicate.not(OnlineClass::isClose))
                .forEach(o -> System.out.println(o.getId()));

        System.out.println("수업 이름만 모아서 stream 만들기");
        // TODO
        springClass.stream()
                .map(OnlineClass::getTitle) // stream을 만들고
                .forEach(System.out::println);

        List<OnlineClass> javaClasses = new ArrayList<>();
        javaClasses.add(new OnlineClass(6, "The JAva, Test", true));
        javaClasses.add(new OnlineClass(7, "The Java, Code maniplulation", true));
        javaClasses.add(new OnlineClass(8, "The Java, 8 to 11", false));

        List<List<OnlineClass>> keesunEvents = new ArrayList<>();
        keesunEvents.add(springClass);
        keesunEvents.add(javaClasses);

        System.out.println("두 수업 목록에 들어있는 모든 수업 아이디 출력");
        // TODO
        keesunEvents.stream()
                .flatMap(Collection::stream)
                .forEach(o -> System.out.println(o.getId()));

        System.out.println("10부터 1씩 증가하는 무제한 스트림 중에서 앞에 10개 빼고 최대 10개 까지만");
        // TODO
        Stream.iterate(10, i-> i+1)
                .skip(10)
                .limit(10)
                .forEach(System.out::println);

        System.out.println("자바 수업 중에 Test가 들어있는 수업이 있는지 확인");
        // TODO
        boolean hasTest = javaClasses.stream().anyMatch(oc->oc.getTitle().contains("Test"));
        System.out.println(hasTest);

        System.out.println("스프링 수업 중에 제목에 spring이 들어간 제목만 모아서 List로 만들기");
        // TODO
        List<String> list = springClass.stream()
                .map(OnlineClass::getTitle)
                .filter(t -> t.contains("spring"))
                .collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}

