package helloworld;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
public class DuplicateElement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		    // create an arraylist from the array
		    // using asList() method of the Arrays class
		    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 3));
		    System.out.println("ArrayList with duplicate elements: " + numbers);

		    // convert the arraylist into a set
		    Set<Integer> set = new LinkedHashSet<>();
		    set.addAll(numbers);

		    // delete al elements of arraylist
		    numbers.clear();

		    // add element from set to arraylist
		    numbers.addAll(set);
		    System.out.println("ArrayList without duplicate elements: " + numbers);
		  }
		}

	


