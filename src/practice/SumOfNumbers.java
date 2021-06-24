package practice;

import java.util.Arrays;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 2, 3, 4, 5}));
        System.out.println(sumOfAllDigits(1234));
    }

    public static long sum(int[] n){
       return Arrays.stream(n).sum();
    }

    public static long sumOfAllDigits(int n){
        int rem=0;
        int s=0;
        while (n >0){
            rem= n%10;
            s=s+rem;
            n=n/10;
        }
        return s;
    }
}
