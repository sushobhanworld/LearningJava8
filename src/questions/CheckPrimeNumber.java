package questions;

public class CheckPrimeNumber {
    public static boolean checkPrimeNumber(int num){
        int temp;
        for(int i=2;i<num/2;i++){
            temp=num%i;
            if(temp==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPrimeNumber(43));
    }
}
