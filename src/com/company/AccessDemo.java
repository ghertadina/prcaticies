package com.company;

class Myclass{
    private int alpha;
    public  int beta;
    int gamma;

    void setAlpha (int a){
        alpha = a;
    }

    int getAlpha (){
        return alpha;
    }
}


public class AccessDemo {
    public static void main(String[] args) {
   Myclass ob = new Myclass();
    ob.beta = 88;
    ob.gamma =99;
    ob.setAlpha(30);
        System.out.println(ob.getAlpha());
    }
}
