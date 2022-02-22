package practice1;

public class SumOfDigits {
    static int sumOfDigits(int num) {
        int sum = 0;
        int rem;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(sumOfDigits(12345));
    }
}
