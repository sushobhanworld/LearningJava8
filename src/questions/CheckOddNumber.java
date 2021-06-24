package questions;

import java.util.ArrayList;
import java.util.List;

public class CheckOddNumber {
    public static void findOddNumber(List<Integer>numbers){
        numbers.forEach(n ->{
            if(n%2 !=0) System.out.println(n);
        });
    }

    public static void main(String[] args) {
        List<Integer>numbers= new ArrayList<>();
        numbers.add(1);
        numbers.add(50);
        numbers.add(5);
        numbers.add(8);
        numbers.add(2);
        findOddNumber(numbers);
    }
}
