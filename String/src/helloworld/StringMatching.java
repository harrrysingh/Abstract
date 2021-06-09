package helloworld;

public class StringMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      String Str = new String("Welcome to bangalore");

		      System.out.print("Return Value :" );
		      System.out.println(Str.matches("(.*)Bangalore(.*)"));

		      System.out.print("Return Value :" );
		      System.out.println(Str.matches("Bangalore"));

		      System.out.print("Return Value :" );
		      System.out.println(Str.matches("Welcome(.*)"));
		   }
		}

	


