package stream_terminal;

public class X {
    public static void main(String[] args) {
        try
        {
            badMethod();
            System.out.println("A");
        }
        catch (Exception exception){
            System.out.println("B");
        }
        finally {
            System.out.println("C");
        }
        System.out.println("D");
    }
    public static void badMethod(){
        throw new Error();
    }
}
