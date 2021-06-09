package helloworld;

public class SameName {

	  void multiply(int l, int b)
	  {
	    System.out.println("Result is"+(l*b)) ;
	  }
	  void multiply(int l, int b,int h)
	  {
	    System.out.println("Result is"+(l*b*h));
	  }
	  public static void main(String[] args)
	  {
	    SameName  ar = new SameName();
	    ar.multiply(10,5);   //multiply(int l, int b) is method is called
	    ar.multiply(6,6,2);   //multiply(int l, int b,int h) is called
	  }
	}
