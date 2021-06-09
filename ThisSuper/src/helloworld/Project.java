package helloworld;

public class Project {

	  int sum;

	  // first constructor
	  Project() {
	    // calling the second constructor
	    this(10, 2);
	  }

	  // second constructor
	  Project(int arg1, int arg2) {
	    // add two value
	    this.sum = arg1 + arg2;
	  }

	void display()
	{
	    System.out.println("Sum is: " + sum);
	  }

	  // main class
	  public static void main(String[] args) 
	  {

	    // call the first constructor
	    Project obj = new Project();

	    // call display method
	    obj.display();
	  }
	}
