package helloworld;

interface A2{
		  int f();
		}

		interface B2{
		  int f();
		}

		class Test2 implements A, B{   
		  public static void main(String[] args) throws Exception{   

		  }

		  @Override
		  public int f() {  // from which interface A or B
		    return 0;
		  }
		}   

