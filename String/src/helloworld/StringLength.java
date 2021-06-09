package helloworld;
public class StringLength {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				String str="Hello World";
				char[] len= str.toCharArray();
				int a=0;
				for(char ch : len)
				{
					a++;
				}		
				System.out.println("Length of a string is :"+a);
					
			}
		}


