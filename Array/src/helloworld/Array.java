package helloworld;
import java.util.*; 
 
 public class Array {
 public static void main(String[] args)
 {
    int[] array_nums = {23, 23, 12, 12, 12, 23};
	System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	int num1 = 23;
    int num2 = 12;
	
	System.out.println("Result: "+result(array_nums, num1, num2));
    }	
  
  public static boolean result(int[] array_nums, int num1, int num2) {
    for (int number : array_nums) {
      boolean r = number != num1 && number != num2;
      if (r) {
        return false;
        }
     }
        return true;
   }
}