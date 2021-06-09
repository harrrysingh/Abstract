package helloworld;

		class A
		 {
		     void show()
		 {
		    System.out.println("Class A");
		 }
		 }
		 class B extends A
		 {
		void show()
		 {
		    System.out.println("Class B");
		 }
		 }
		 class C extends B
		 {
		     void show()
		     {
		        System.out.println("Class B");
		     }
		 }
		 class Test {
		public static void main(String[] args)
		 {
		     A a=new A();
		     a.show();
		     B b=new B();
		     b.show();
		     A a2=new C();
		     a2.show();
		     }
		}

	
