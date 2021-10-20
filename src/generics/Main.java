package generics;

public class Main {
    public static void main(String[] args) {
        NumberFns<Integer> integerNumberFns= new NumberFns<>(6);
        NumberFns<Double> doubleNumberFns = new NumberFns<>(-6.0);
        System.out.println(integerNumberFns.absEqual(doubleNumberFns));
        Integer d=3;
        System.out.println(d.doubleValue());
    }
}
