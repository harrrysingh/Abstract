package helloworld;

public class DriverClass {

	    public static void main(String[] args)
	    {
	        Parent obj1 = new Parent();
	  
	        // As per overriding rules this
	        // should call to class Child static
	        // overridden method. Since static
	        // method can not be overridden, it
	        // calls Parent's m1()
	        obj1.a1();
	  
	        // Here overriding works
	        // and Child's m2() is called
	        obj1.b2();
	        obj1.c3();


	    }
	}


