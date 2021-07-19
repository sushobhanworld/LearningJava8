package comparables;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class PlaySong {
    public static void main(String[] args) {
        ArrayList<Song> songArrayList= new ArrayList<>();
        Song song1= new Song("Hello","World", 1990);
        Song song2= new Song("Kumar","Sushobhan", 1991);
        Song song3= new Song("Anjana","Maiti", 1996);
        Song song4= new Song("Ram","Shayam", 1992);
        Song song5= new Song("Mohan","Sohan", 1999);

        songArrayList.add(song1);
        songArrayList.add(song2);
        songArrayList.add(song3);
        songArrayList.add(song4);
        songArrayList.add(song5);

        MyUtils.iterateList(songArrayList);
        System.out.println("----------------------------------------------------------");
        songArrayList.forEach(System.out::println);

        System.out.println("----------------------------------------------------------");
        //Collections.sort(songArrayList);
        songArrayList.stream()
                .sorted(Comparator.comparing(Song::getYear).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);
        //MyUtils.iterateList(songArrayList);

        songArrayList.stream()
                .sorted(Comparator.comparing(Song::getTitle))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
