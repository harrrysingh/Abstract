package helloworld;

public class MammalInt {
		
			   public void eat() {
			      System.out.println(" eats");
			   }
			
			   public void travel() {
		      System.out.println(" travels");
			   } 
			
			   public int noOfLegs() {
			      return 0;
			   }
	
			   public static void main(String args[]) {
			      MammalInt m = new MammalInt();
			      m.eat();
			      m.travel();
			   }
			} 


