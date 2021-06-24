package lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample
{
    public static void main(String[] args) {
        Comparator<Integer> comparable= new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("Result of comparator is :"+comparable.compare(3,2));
        Comparator<Integer> integerComparator= (Integer a, Integer b) -> a.compareTo(b);
        System.out.println("Result of comparator using lambda :"+comparable.compare(3,2));
        Comparator<Integer> integerComparator1= (a,b) -> a.compareTo(b);
        System.out.println("Result of comparator using lambda removing type in lambda :"+comparable.compare(3,2));
    }
}
