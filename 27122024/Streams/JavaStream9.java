import java.util.*;
import java.util.stream.Stream;

class JavaStream9 {
    // Driver code
    public static void main(String[] args)
    {
        // Creating a List of Lists
        List<List<String>> listOfLists = Arrays.asList(
            Arrays.asList("C Language", "C++","Node"),
            Arrays.asList("React", "Php"),
            Arrays.asList("Java", "Programming")
        );
		System.out.println( "Initial : "  + listOfLists );
        // Using Stream flatMap(Function mapper)
        listOfLists.stream()
                   .flatMap(list -> list.stream())
                   .forEach(System.out::println);

        System.out.println( "Final : "  + listOfLists );
    }
}