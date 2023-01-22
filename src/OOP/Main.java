package OOP;

import java.util.Vector;

public class Main {

    public static  void main(String []r){

        Car c = new Car(1,80);
        c.putPrice(20);
        System.out.println((c.getPrice()));

        Truck t = new Truck(2, 80);
        t.checkStatic();

    }
}
