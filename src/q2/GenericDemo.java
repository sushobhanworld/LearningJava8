package q2;

import javax.sound.sampled.Line;

public class GenericDemo {
    public static void main(String[] args) {
        B b= new B();
        C c= (C) b.doTask(new C());
        B b2= new B();
        C c2= (C) b2.doTask(new C());
    }
}
