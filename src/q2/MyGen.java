package q2;

public class MyGen <T>{
    T obj;
    MyGen(T obj){
        this.obj= obj;
    }
    void print(){
        System.out.println(obj);
    }
}
