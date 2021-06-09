package helloworld;


public class Student3 {
			
			int rollno;  
			String name;  
			float fee;  
			Student3(int rollno,String name,float fee)
			{  
				this.rollno=rollno;  
			this.name=name;  
			this.fee=fee;  
			}  
		void display()
			{
				System.out.println(rollno+" "+name+" "+fee);
				}  
			}  
			  
	class TestThis3
	{  
			public static void main(String args[])
			{
				
			Student3 s1=new Student3(111,"Harry",5000f);  
			Student3 s2=new Student3(112,"Singh",6000f);  
			s1.display();  
			s2.display();  
			}
			
	}

	
	


