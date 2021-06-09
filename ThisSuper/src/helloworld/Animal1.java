package helloworld;

public class Animal1 {
	
	  // default or no-arg constructor
	  Animal1() {
	    System.out.println("I am an animal");
	  }
	
	  // parameterized constructor
	  Animal1(String type) {
	    System.out.println("Type: "+type);
	  }
	}
	
	class Dog1 extends Animal1 {

  // default constructor
	  Dog1() {
	
	    // calling parameterized constructor of the superclass
	    super("Animal");
	
	    System.out.println("I am a dog");
	  }
	}
	
	class Main1 {
	
		public static void main(String[] args) {
			@SuppressWarnings("unused")
			Dog dog1 = new Dog();
	  }
	}