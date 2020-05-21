package com.company;
class Factor{
    boolean isFactor(int i, int y){
        if(y % i == 0)return true;
        else return false;
    }

}

public class IsFact {
    public static void main(String[] args) {
        Factor x = new Factor();
        if(x.isFactor(2,20)) System.out.println(" 2 deliteli ");
        if (x.isFactor(3,20)) System.out.println( "0000000");
    }
}
