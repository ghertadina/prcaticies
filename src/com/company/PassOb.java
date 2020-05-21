package com.company;
class Block{
    int a,b,c;
    int volume;

    Block (int i,int j, int k){
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }

    boolean SameBlock (Block ob){
        if((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        else return false;
    }
    boolean SameVolume (Block ob){
        if(ob.volume == volume) return true;
        else return false;
    }
}

public class PassOb {
    public static void main(String[] args) {

        Block ob1 = new Block(10,2,5);
        Block ob2 = new Block(10,2,5);
        Block ob3 = new Block(4,5,5);

        System.out.println("ob1 имеет те же размеры что и ob2 : " + ob1.SameBlock(ob2));
        System.out.println("ob1 имеет те же размеры что и ob3 : " + ob1.SameBlock(ob3));
        System.out.println("ob1 имеет тот же обьем  что и ob3 : " + ob1.SameVolume(ob3));
    }
}
