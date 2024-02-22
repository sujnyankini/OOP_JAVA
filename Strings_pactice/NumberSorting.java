import java.util.Arrays;

public class NumberSorting 
{
   public static void main(String[] args)
	{
        Integer[] numbers = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // Sort the array using Arrays.sort() and the natural order (compareTo)
        Arrays.sort(numbers);

        System.out.println("Sorted Numbers (Ascending Order): " + Arrays.toString(numbers));
    }
}

