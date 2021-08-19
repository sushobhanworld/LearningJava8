package q2;



import java.util.Stack;

public class MyStack {
    Stack stack= new Stack();
    public <E> void push(E obj){
        stack.push(obj);
    }

    public <E> E pop(){
        stack.pop();
        return (E) stack;
    }

    public static void main(String[] args) {
        MyStack s1= new MyStack();
        s1.push(83);
      //  System.out.println(s1.pop());
    }
}
