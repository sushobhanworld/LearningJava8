package functionalInterface;

import java.util.function.Predicate;

public class PredicateExample
{
    static Predicate<Integer> predicate= (integer -> {
        return integer%2==0;
    });
    static Predicate<Integer> predicate1= (integer -> integer%2==0);
    static Predicate<Integer> predicate2= (integer -> integer%5==0);

    public static void predictAnd()
    {
        System.out.println("PredicateAnd result :"+predicate1.and(predicate2).test(10));
        System.out.println("PredicateAnd result :"+predicate1.and(predicate2).test(9));
    }

    public static void predictOR()
    {
        System.out.println("PredicateOR result :"+predicate1.or(predicate2).test(10));
        System.out.println("PredicateOR result :"+predicate1.or(predicate2).test(8));
    }

    public static void predictNegate()
    {
        System.out.println("PredicateOR result :"+predicate1.or(predicate2).negate().test(10));
        System.out.println("PredicateNegate result :"+predicate1.or(predicate2).test(8));
    }

    public static void main(String[] args) {

        System.out.println(predicate.test(4));
        predictAnd();
        predictOR();
        predictNegate();
    }
}
