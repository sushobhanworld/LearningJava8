package generics;

public class NumberFns<T extends Number>{
    T obj;
    // T can be anything, means Number ->Integer
    // -> Double
    // -> Float

    public NumberFns(T obj) {
        this.obj = obj;
    }
    double square(){
        return obj.intValue()* obj.intValue();
    }
    boolean absEqual(NumberFns<?> num){
        if(Math.abs(obj.doubleValue())==Math.abs(num.obj.doubleValue()))
            return true;
        return false;
    }
}
