package functionalInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample
{
    static Comparator<Integer> comparator= (a,b) ->a.compareTo(b);
    static BinaryOperator<Integer> binaryOperator= (a, b) ->a*b;
    public static void main(String[] args) {
        binaryOperator.apply(3,4);
        BinaryOperator<Integer> maxBy= BinaryOperator.maxBy(comparator);
        System.out.println("Result of comparator "+maxBy.apply(6,5));
    }
}
