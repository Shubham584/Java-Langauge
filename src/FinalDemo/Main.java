package FinalDemo;

public class Main {

    public static  void  main(String []r){

        Parent p = new Child();
        p.putMark(10);
        System.out.println((p.getMark()));
    }
}
