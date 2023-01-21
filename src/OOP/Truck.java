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
        super.getSpeed();
    }
}
