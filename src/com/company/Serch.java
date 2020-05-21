package com.company;

public class Serch {
    public static void main(String[] args) {
        int[] nums = {1, 5, 3, 7, 2, 6, 4, 8, 9, 10};
        int val = 6;
        boolean found = false;

        for (int x: nums){
            if(x == val){
                found = true;
                break;
            }
        }
        if(found)
        System.out.println(" Значение найдено "+ val);
        }
    }

