package com.hj.java8to11;

public class App {

    public static void main(String[] args) {
        Foo foo = new DefaultFoo("yoon");
        foo.printName();
        foo.printNameUpperCase();
        Foo.printAnything();
    }
}
