package helloworld;
import java.util.Arrays;

public class Secondlargest {

		   public static void main(String args[]){
		      int array[] = {10, 20, 30, 60, 90, 50};
		      int size = array.length;
		      Arrays.sort(array);
		      System.out.println("sorted Array ::"+Arrays.toString(array));
		      int res = array[size-2];
		      System.out.println("2nd largest element is ::"+res);
		   }
		}

	


