package helloworld;

public class D {

	
	  void multiply(int a, int b)
	  {
	    System.out.println("Result is" + (a*b)) ;
	  }
	  void multiply(int a, int b,int c)
	  {
	    System.out.println("Result is" + (a*b*c));
	  }
	  public static void main(String[] args)
	  {
	    D obj = new D();
	    obj.multiply(8,5);   
	    obj.multiply(4,6,2);   
	  }
	}
