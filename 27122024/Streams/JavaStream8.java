import java.util.*;
import java.util.stream.Stream;

class JavaStream8 {

    // Driver code
    public static void main(String[] args)
    {

        // Creating a Stream of Strings
        Stream<String> stream = Stream.of("Java", "Python",
                                          "Cricinfo", "Ndtv",
                                          "C++","React","Nagpur"

                                          );

        // Using forEach(Consumer action) to print
        // Character at index 1 in reverse order
        stream.sorted(Comparator.reverseOrder())
            .flatMap(str -> Stream.of(str.charAt(1)))
            .forEach(System.out::println);
    }
}