package com.company;

class Guess {
    public static void main(String args[])
            throws java.io.IOException {
        char ch, answer = 's';
        System.out.println("Зaдyмaнa буква из диапазона A-Z. 11");
        System.out.print("Пoпытaйтecь ее угадать: ");
        ch = (char) System.in.read();
        if (ch == answer){
            System.out.println("** Правильно! **");
        } else System.out.println("Извините вы не угадали");
        if (ch < answer)
            System.out.println("ближe к концу алфавита");
        else System.out.println("ближe к началу алфавита");
    }
}
