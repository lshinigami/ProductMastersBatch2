package org.example.week_4.easy;

public class StringPrinter<T> implements Printer<T> {
    @Override
    public void print(T value) {
        System.out.println(value);
    }

}
