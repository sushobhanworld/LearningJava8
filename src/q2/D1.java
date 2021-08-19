package q2;

import java.util.HashSet;
import java.util.Set;

public class D1 {
    public static void main(String[] args) {
        MyGen intObj= new MyGen(51);
        MyGen stringObj= new MyGen(51);
        intObj=stringObj;
        intObj.print();

       // Set<? extends Number> set1= new HashSet<String>();
        Set<? extends Number> set2= new HashSet<Double>();
    }
}
