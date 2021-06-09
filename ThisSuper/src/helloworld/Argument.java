package helloworld;

public class Argument {
	
		  int sum;

		  // first constructor
		  Argument() {
		    // calling the second constructor
		    this(5, 2);
		  }

		  // second constructor
		  Argument(int arg1, int arg2) {
		    // add two value
		    this.sum = arg1 + arg2;
		  }

		  void display() {
		    System.out.println("Sum is: " + sum);
		  }

		  // main class
		  public static void main(String[] args) {

		    // call the first constructor
		    Argument obj = new Argument();

		    // call display method
		    obj.display();
		  }
		}


