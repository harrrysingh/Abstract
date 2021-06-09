package helloworld;

public class Student1 {
		
			//instance variables of the class  
		int id;  
			String name;  
			  
			Student1(int i, String n){  
			id = i;  
			name = n;  
			}  
			  
			public static void main(String[] args) {  
			//object creation  
				Student1 s = new Student1(10,"Harry");  
			//printing instance variables  
			System.out.println(s.id); //prints 10  
			System.out.println(s.name); //prints John  
			}  
		} 

