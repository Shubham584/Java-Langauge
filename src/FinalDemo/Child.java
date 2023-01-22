package FinalDemo;

public class Child extends Parent{


    int mark = 0;
    @Override
    public void putMark(int x) {
        this.mark = x;
    }

    @Override
    public int getMark() {
        return mark;
    }
}
