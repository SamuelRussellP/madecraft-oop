package exercise;

import java.util.ArrayList;

public class MainFunction {
    public static void main (String[] args){
        BetterArrayList cars = new BetterArrayList();
        cars.add("Volvo");
        cars.add("BMW");
        System.out.println(cars);
        cars.print();
        cars.pop();
        cars.remove("BMW");
        cars.add("Mercedes Benz");
        cars.print();
        cars.pop();
    }
}
