package comparables;

import java.util.ArrayList;

public class MyUtils {
    public static <T> void iterateList(ArrayList<T> list){
        list.forEach(System.out::println);
    }
}
