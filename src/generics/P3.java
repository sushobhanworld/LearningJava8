package generics;

import java.util.ArrayList;
import java.util.List;

class Bucket<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}


public class P3 {

    private static <T> void addStore(T t, List<Bucket<T>> list){
        Bucket<T> bucket= new Bucket<>();
        bucket.setItem(t);
        list.add(bucket);

        System.out.println(t.toString()+" has been added to the list");
    }

    public static void main(String[] args) {
        List<Bucket<String>> bucketList= new ArrayList<>();
        addStore("Adam",bucketList);
        addStore("Jack",bucketList);
    }
}
