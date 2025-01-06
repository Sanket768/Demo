import java.util.stream.Stream; 
public class JavaStream5 { 
  
    public static void main(String[] args) 
    { 
  
        // create a stream using iterate 
        Stream<Double> stream 
            = Stream.iterate(2.0, 
                             decimal -> decimal > 0.25, decimal -> decimal / 2); 
  
        // print Values 
        stream.forEach(System.out::println); 
    } 
} 