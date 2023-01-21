package WrapperClasses;

public class Main {

    public static void main(String[] r){

        Integer i = 10;
        Integer newI = Integer.valueOf(10);
        int k = 9;
        Integer newK = k;
        int intK = newK;

        System.out.println(i);
        System.out.println(newI);

        System.out.println(newK);
        System.out.println(intK);
    }
}
