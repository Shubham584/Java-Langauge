package OOP;

public class Truck extends  Vehicle{

    private int price = 0;

    Truck(int color, int maxSpeed){
        super(color, maxSpeed);
    }

    void putPrice(int price){
        this.price = price;
    }


    int getPrice(){
        return price;
    }

    void getSpeed(){
        System.out.println("Max Speed is of Truck is: " + 80);
    }

    void nonOverFun(){
        System.out.println("NON - override Fun");
    }

    public void check(){
        super.check();
        System.out.println("In Truck");
    }

    int add(int a, int b){
        return a + b;
    }

    int add(long a, long b){
        return (int)(a + b);
    }


}
