import java.util.*;

class JavaStream7{

    // Driver code
    public static void main(String[] args)
    {

        // Creating a list of Strings
        List<String> list = Arrays.asList("Java", "Python",
                                          "C", "C++","React","Php","Node");


        // Using forEach(Consumer action) to
        // print the elements of stream
        list.stream().forEach(System.out::println);
        for(String s : list)
        {
			System.out.println( s );
		}

        
    }
}