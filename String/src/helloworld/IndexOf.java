package helloworld;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
			String s1="this is index of example";  
			//passing substring with from index  
			int index3=s1.indexOf("is",4);//returns the index of is substring after 4th index  
				System.out.println(index3);//5 i.e. the index of another is  
				  
				//passing char value  
				int index4=s1.indexOf('s');//returns the index of s char value  
				System.out.println(index4);//3  
			}

	}


