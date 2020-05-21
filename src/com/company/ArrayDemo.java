package com.company;

public class ArrayDemo {
    public static void main(String[] args) {
        int sample[] = new int[10];
        int i;
        for(i = 0 ;i < 10; i = ++i)
        sample[i] = i;
        for (i = 0; i < 10; i = ++i)
        System.out.println("Елемент [ " + i + " ] : " + sample[i]);

    }
}
