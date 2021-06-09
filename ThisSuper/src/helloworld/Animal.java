package helloworld;

public class Animal {
	
	  // default or no-arg constructor
	  Animal() {
	    System.out.println("I am an animal");
	  }
	
	  // parameterized constructor
	  Animal(String type) {
	    System.out.println("Type: "+type);
	  }
	}
	
	class Dog extends Animal {

  // default constructor
	  Dog() {
	
	    // calling parameterized constructor of the superclass
	    super("Animal");
	
	    System.out.println("I am a dog");
	  }
	}
	
	class Main {
		@SuppressWarnings("unused")
		public static void main(String[] args) {
			Dog dog1 = new Dog();
	  }

		public void display() {
			// TODO Auto-generated method stub
			
		}
	}

