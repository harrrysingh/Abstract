package helloworld;

public class CopyAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int [] numbers = {1, 2, 3, 4, 5, 6};
		        int [] positiveNumbers = numbers;    // copying arrays
		      
		        // change value of first array
		        numbers[0] = -1;

		        // printing the second array
		        for (int number: positiveNumbers) {
		            System.out.print(number + ", ");
		        }
		    }
		}

	


