package com.company;
import java.util.concurrent.Callable;
class ChkNum{
    boolean isEven (int x){
        if (x % 2 == 0) return true;
        else return false;
    }
}

public class ParmDemo {
    public static void main(String[] args) {
       ChkNum e = new ChkNum();
       if(e.isEven(10)) System.out.println("10 - четное число");
       if(e.isEven(9)) System.out.println("9 - Не четное число");
       if (e.isEven(8)) System.out.println("8 - четное число");
    }
}