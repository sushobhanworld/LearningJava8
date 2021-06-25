package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringPractice {
    public static void main(String[] args) {
        String[] array= new String[]{"A","B","C"};
        List<String> list1= Arrays.asList(array);
        List<String> list2= new ArrayList<>(Arrays.asList(array));
        List<String> list3= new ArrayList<>(Arrays.asList("A",new String("B"),"C"));
        System.out.println(list1.equals(list2));
        System.out.println(list1.equals(list3));

        String s1="N";
        String s2= new String("N");
        System.out.println(s1.equals(s2));
    }
}
