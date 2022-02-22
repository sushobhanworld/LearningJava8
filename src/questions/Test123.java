package questions;

public class Test123<T> {
    private T t;

    public static void main(String[] args) {
        Test123 obj = new Test123();
        obj.setT("demo");
        obj.setT(10);
        obj.setT("%");
        System.out.println(obj.getT());
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
