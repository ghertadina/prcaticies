package com.company;

public class IfDemo {
    public static void main(String[] args) {
        int a,b,c;
        a = 2;
        b = 3;
        if(a<b) System.out.println("a menishe b");
        if(a==b) System.out.println("vi ne doljni videti etot text");
        System.out.println();
        c = a-b;
        System.out.println("c soderjit -1");
        if(c >= 0) System.out.println("c - ne otritsatelinoe cislo");
        if(c < 0) System.out.println("c - otritsatelinoe cislo");
        System.out.println();
        c = b-a;
        System.out.println("c soderjit 1");
        if(c >= 0) System.out.println("c - ne otritsatelinoe cislo");
        if(c < 0) System.out.println("c - otritsatelinoe cislo");
    }
}
