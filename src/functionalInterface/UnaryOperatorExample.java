package functionalInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample
{
    //when the input and output type are same type, we can use unary operator
    //in function, we have input of one type and output of other type
    static UnaryOperator<String> unaryOperator= (s -> s.concat(" hello"));

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("java"));
    }
}
