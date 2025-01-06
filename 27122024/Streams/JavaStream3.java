import java.util.stream.*;
public class JavaStream3 {
    public static void main(String[] args){
        Stream.iterate(1, element->element+1)
        .filter(element->element%5==0)
        .limit(5)
        .forEach(System.out::println);
    }
}

int element;
int count = 0;
for(element = 1 ; true ; element++)
{
	if(element % 5 == 0)
	{
		System.out.println( element );
		count++;
	}
	if(count > 5)
	{
		break;
	}
}





