package generics;

public class P2 {
    public static void main(String[] args) {
        System.out.println(add2Numbers(20f,5.6));
    }

    private static <T extends Number> double add2Numbers(T num1, T num2){
        return num1.doubleValue()+num2.doubleValue();
    }
}
