package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P4 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Adam","Kevin");
        display(list);
        List<Integer> integers= Arrays.asList(2,3);
        display(integers);

        List<Rectangle> rectangles= new ArrayList<>();
        rectangles.add(new Rectangle());
        drawAll(rectangles);
    }

    public static void display(List<?> list){
        list.forEach(System.out::println);
    }

    public static <T extends Rectangle> void drawAll(List<T> shapes){
        shapes.forEach(Shape::draw);
    }
}
