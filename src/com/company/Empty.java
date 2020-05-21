package com.company;

import java.io.IOException;

public class Empty {
    public static void main(String[] args) throws IOException {
        int sum = 0;
        int fact = 1;

        for(int i = 1; i <= 5 ; i ++){
            sum += i;
            fact *= i;
        }
        System.out.println("sum = "+sum);
        System.out.println("fact = "+ fact);
    }

}

