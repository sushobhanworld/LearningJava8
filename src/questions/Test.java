package questions;

public class Test {
    public static void main(String[] args) {
        try{
            throw new B();
        }
        catch (B b){
            System.out.println("A caught");
        }
        catch (Exception e){
            System.out.println("exception caught");
        }
    }
}
