package helloworld;

interface In1
{
    // public, static and final
    final int a = 10;
  
    // public and abstract 
    void display();
}
  
// A class that implements the interface.
class TestClassA implements In1
{
    // Implementing the capabilities of
    // interface.
    public void display()
    {
        System.out.println("Jam");
    }
  
    // Driver Code
    public static void main (String[] args)
    {
        TestClass t = new TestClass();
        ((In1) t).display();
        System.out.println(a);
    }
}

