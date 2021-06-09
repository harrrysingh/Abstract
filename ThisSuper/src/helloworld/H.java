package helloworld;

public class H {
	
		public int x, y;
	    public H(int x, int y) 
	    {
			      this.x = x;
			      this.y = y;
			   }
			}
	class I extends H
	{
			   public int x, y;
			   public I()
			   {
			      this(0, 0);
		   }
    public I(int x, int y) 
    {
		      super(x + 1, y + 1);// calls parent class constructor
			      this.x = x;
			      this.y = y;
			   }
   public void print() 
   {
		      System.out.println("Base class : {" + x + ", " + y + "}");
		      System.out.println("Super class : {" + super.x + ", " + super.y + "}");
			   }
		}
	class Point 
	{
			   public static void main(String[] args)
			   {
			      I obj = new I();
			      obj.print();
		          obj = new I(1, 2);
			      obj.print();
			   }
			}


