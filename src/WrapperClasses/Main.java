package WrapperClasses;

import javax.sound.midi.SysexMessage;

public class Main {

    public static void main(String[] r){

        Integer i = 10;
        Integer newI = Integer.valueOf(10);
        int k = 9;
        Integer newK = k;
        Character c = 921;
        System.out.println(c.charValue());
        int intK = newK;

        System.out.println(i);
        System.out.println(newI);

        System.out.println(newK);
        System.out.println(intK);
    }
}
