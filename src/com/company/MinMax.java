package com.company;

public class MinMax {
    public static void main(String[] args) {

        int nums[] = {1,3,-5,7,9,33,299,-14,20,200};
        int min, max;
        min = max = nums[0];
        for (int i = 1; i < 10; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];

        }
        System.out.println("min и max: " + min + " " + max);
    }
}