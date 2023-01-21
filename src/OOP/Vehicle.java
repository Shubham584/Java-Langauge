package OOP;

public class Vehicle {

    public int color;
    int price = 0;
    private  int numTyre = 0;
    private int maxSpeed;

    static int totalVehicle = 0;

    Vehicle(int color, int maxSpeed){
        totalVehicle++;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    int getColor(){
        return color;
    }

    void getSpeed(){
        System.out.println("Speed of Vehicle is: " + maxSpeed);
    }


}
