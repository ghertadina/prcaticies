package com.company;

public class SideEffects {
    public static void main(String[] args) {
        int i;
        i = 0;

        if( false & (++i < 100))
            System.out.println("Эта строка не будит отображатся");
        System.out.println(" оператор if выполняется : "+ i);

        if( false && (++i < 100))
            System.out.println("Эта строка не будит отображатся");
        System.out.println(" оператор if по прежнему : "+ i);


    }
}
