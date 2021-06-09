package helloworld;

class Parent {
		    // Static method in base class
		    // which will be hidden in subclass
		    void a1()
		    {
		        System.out.println("From parent "
		                           + "static a1()");
		    }
		  
		    // Non-static method which will
		    // be overridden in derived class
		    void b2()
		    {
		        System.out.println("From parent "
		                           + "non-static(instance) b2()");
		    }
		
		    // be overridden in derived class
		    void c3()
		    {
		        System.out.println("From parent "
		                           + "non-static(instance) c3()");
		    }
}
