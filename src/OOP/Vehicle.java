package OOP;

abstract public class Vehicle {

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

    void nonOverFun(){
        System.out.println("NON - override Fun in Vehicle");
    }

    public void check(){
        System.out.println("I am Vehicle");
    }

    public static void checkStatic(){
        System.out.println("in Vehicle");
    }

}
