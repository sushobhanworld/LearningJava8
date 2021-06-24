package questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraysContainsSameElements {
    public static boolean checkArrayContainsSameElements(Object[] arr1, Object[] arr2){
        Set<Object> firstSetOfElements= new HashSet<>(Arrays.asList(arr1));
        Set<Object> secondSetOfElements= new HashSet<>(Arrays.asList(arr2));
        return firstSetOfElements.size() == secondSetOfElements.size();
    }

    public static void main(String[] args) {
        Integer[] a1={1,2,3,2,1};
        Integer[] a2={4,5,6};
        System.out.println(checkArrayContainsSameElements(a1,a2));
    }
}
