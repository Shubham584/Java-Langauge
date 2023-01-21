package OOP;

public class Car extends Vehicle{

    private int price;
    Car(int color, int maxSpeed) {
        super(color, maxSpeed);
    }

    void putPrice(int price){
        this.price = price;
    }

    int getPrice(){
        return super.price;
    }

    void getSpeed(){
        super.getSpeed();
    }

}
