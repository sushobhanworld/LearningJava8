package javaQuestions;

import java.util.Stack;

public class Question37 {
    public static void main(String[] args) {
        method1();
    }

    public static Boolean method1(){
        int[] a= {10,20,30};
        Stack<Integer> stack= new Stack<>();

        try{
            System.out.println(a[3]);
            return true;
        }
        finally {
            System.out.println("END");
        }
    }
}
