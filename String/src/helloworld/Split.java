package helloworld;

public class Split {
	
	    public static void main(String args[]) 
	    { 
	        String str = "We're,Ridiculously,Committed!"; 
	        String[] arrOfStr = str.split(","); 
	         System.out.println("Number of substrings: "+arrOfStr.length);
	         
	         for(int i=0; i< arrOfStr.length; i++)
	         {
	             System.out.println("str["+i+"] : "+arrOfStr[i]);
	         }
	 
	    } 
	}

