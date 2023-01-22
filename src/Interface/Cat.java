package Interface;

public class Cat implements Animal{

    Cat(){
        System.out.println("Cat");
    }

    @Override
    public void getLegs() {
        System.out.println("lehs");
    }


}
