package questions;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            System.out.println("Exception raised: "+5/0);
        }
        catch (ArithmeticException e){
            System.out.println("from Arithmetic pointer");
        }
        catch (Exception e){
            System.out.println("from exception");
        }
    }
}
