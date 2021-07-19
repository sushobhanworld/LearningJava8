package flatMap;

import java.util.function.Function;
import java.util.function.Supplier;

public class T1 {
    public static void main(String[] args) {
        Runnable runnable= () -> {
            String myString= "Let's split this up into an array";
            String[] parts= myString.split(" ");
            for(String part:parts){
                System.out.println(part);
            }
        };
        runnable.run();

        Function<String,String> stringFunction= s->{
            StringBuilder returnValue = new StringBuilder();
            for(int i=0;i<s.length();i++){
                if(i%2==1){
                    returnValue.append(s.charAt(i));
                }
            }
            return returnValue.toString();
        };
        System.out.println(stringFunction.apply("1234567890"));
        String result= everySecondCharacter(stringFunction,"1234567890");
        System.out.println(result);

        Supplier<String> iLoveJava= () -> "I love java";
        System.out.println(iLoveJava.get());
    }
    private  static String everySecondCharacter(Function<String,String> function,String source){
        return function.apply(source);
    }
}
