package FinalDemo;

public class Parent {


    int marks = 0;

    final int getMarks(){
        return marks;
    }

    final int getMarks(int b){
        return 10;
    }

    void putMarks(int mark){
        this.marks = mark;
    }
}
