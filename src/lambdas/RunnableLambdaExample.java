package lambdas;

public class RunnableLambdaExample
{
    public static void main(String[] args) {
        //prior to Java8
        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable 1");
            }
        };
        new Thread(runnable).start();
        //Using Java8
        //() -> {};
        Runnable runnableLambda= () -> {
            System.out.println("Inside runnable 2");
        };
        new Thread(runnableLambda).start();

        Runnable runnableLambda1= () -> System.out.println("Inside runnable 3");
        new Thread(runnableLambda1).start();

        new Thread(()-> System.out.println("Single line runnable")).start();
    }
}
