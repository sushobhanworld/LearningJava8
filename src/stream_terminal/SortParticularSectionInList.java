package stream_terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortParticularSectionInList {
    static List<String> sortElementsAfterFiltering(List<String> list){
        return list.stream()
                .filter((number)->number.toUpperCase().startsWith("G"))
                .sorted((s1,s2)->s1.compareTo(s2))
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<String> someNumbers = Arrays.asList(
                "N40","N36",
                "B12","B6",
                "G53","G49","G60","G50","g64",
                "O71"
        );
        System.out.println(sortElementsAfterFiltering(someNumbers));
    }
}
