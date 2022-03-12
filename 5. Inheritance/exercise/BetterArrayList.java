package exercise;

import java.util.ArrayList;

public class BetterArrayList extends ArrayList {

    void pop(){
        int size = this.size();
        System.out.println(this.get(size-1));
    }

    void print(){
        System.out.println("Cars List now: " + this);
    }
}

