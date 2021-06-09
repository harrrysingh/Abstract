package helloworld;

public class CompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				    String str1 = "run";
				    String str2 = new String("run");
				    String str3 = "gun";
				    String str4 = "sun";
				    
				    //equal so returns 0
				    System.out.println(str1.compareTo(str2));
				    // Comparison with in a condition
				    // that's how generally used 
				    if(str1.compareTo(str2) == 0){
				      System.out.println("str1 is equal to str2");
				    }else{
				      System.out.println("str1 is not equal to str2");
				    }
				      
				    //str1 > str3 so returns positive integer
				    System.out.println(str1.compareTo(str3));
				    // with condition
				    if(str1.compareTo(str3) > 0){
				      System.out.println("str1 is greater than str3");
				    }else{
				      System.out.println("str1 is less than str3");
				    }
				    
				    // str1 < str4 so returns negative integer
				    System.out.println(str1.compareTo(str4));       
				  }
				

	}


