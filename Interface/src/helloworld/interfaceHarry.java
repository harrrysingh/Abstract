package helloworld;

interface harry
	{
	public
	    int show1();
	}
	  
	interface geeks
	{
	public
	    int show1();
	}
	  
	class Test3 implements harry, geeks
	{
	    public int show1() // Overloaded method based on return type, Error
	    {
			return 0;
	    }
	    int show() // Error
	    {
	        return show();
	    }
	public
	    static void main(String args[])
	    {
	    }
	}
