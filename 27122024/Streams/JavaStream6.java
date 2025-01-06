import java.util.Arrays;
import java.util.List;

public class JavaStream6 {
    public static void main(String[] args) {

        // Creating an array of Integer type
        Integer[] n = {1, 2, 3, 4, 5};


        // Getting the list view of the array
        List<Integer> l = Arrays.asList(n);

        System.out.println("" + l);
    }
}